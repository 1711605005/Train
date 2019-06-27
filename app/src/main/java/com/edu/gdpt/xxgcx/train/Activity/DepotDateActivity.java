package com.edu.gdpt.xxgcx.train.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Adapter.DepotDateAdapter;
import com.edu.gdpt.xxgcx.train.Bean.DepotBean;
import com.edu.gdpt.xxgcx.train.Bean.Constant;
import com.edu.gdpt.xxgcx.train.R;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class DepotDateActivity extends AppCompatActivity {

    private TextView tv_depot_start;
    private TextView tv_depot_end;
    private RecyclerView rv_depot_context;
    private DepotDateAdapter adapter;
    private MHandler mHandler;
    private String startText,endText,Data;
    private LinearLayout ll_depot_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depot_date);
        mHandler=new MHandler();
        initView();

        Intent intent=getIntent();
        startText=intent.getStringExtra("startText");
        endText=intent.getStringExtra("endText");
        Data=intent.getStringExtra("Data");
        tv_depot_start.setText(startText);
        tv_depot_end.setText(endText);
        initDate();
    }

    private void initDate() {
        String start=startText;
        String end=endText;
        String data=Data;
        OkHttpClient okHttpClient=new OkHttpClient();
        final Request request=new Request.Builder().url(Constant.WEB_DEPOT+Constant.DEPOT_START
        +start+Constant.DEPOT_END+end+Constant.STATION_DATE+data).build();
        Call call=okHttpClient.newCall(request);
        //开启异步线程访问网络
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String res=response.body().string();
                Message msg=new Message();
                msg.what=1;
                msg.obj=res;
                mHandler.sendMessage(msg);
            }
        });
    }

    private void initView() {
        tv_depot_start = (TextView) findViewById(R.id.tv_depot_start);
        tv_depot_end = (TextView) findViewById(R.id.tv_depot_end);
        rv_depot_context = (RecyclerView) findViewById(R.id.rv_depot_context);
        rv_depot_context.setLayoutManager(new LinearLayoutManager(this));
        adapter=new DepotDateAdapter();
        rv_depot_context.setAdapter(adapter);
        ll_depot_back=findViewById(R.id.ll_depot_back);
        ll_depot_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DepotDateActivity.this.finish();
            }
        });
    }

    public class MHandler extends Handler {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            switch (msg.what){
                case 1:
                    if (msg.obj !=null){
                        String vlResult=(String) msg.obj;
                        //使用Gson解析数据
                   /*     List<DepotBean.ResultBean.ListBean>depotList= JsonParse.getInstance().getDepotList(vlResult);*/
                        DepotBean depotBean = new Gson().fromJson(vlResult, DepotBean.class);
                        adapter.setDate(depotBean.getResult().getList());//适配器数赋值
                    }
                    break;
            }
        }
    }


}
