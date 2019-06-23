package com.edu.gdpt.xxgcx.train.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Adapter.DepotDateAdapter;
import com.edu.gdpt.xxgcx.train.Bean.ABean;
import com.edu.gdpt.xxgcx.train.Bean.Constant;
import com.edu.gdpt.xxgcx.train.Bean.JsonParse;
import com.edu.gdpt.xxgcx.train.Bean.QueryBean;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depot_date);
        mHandler=new MHandler();
        initView();
        initDate();
        Intent intent=getIntent();
        String startText=intent.getStringExtra("startText");
        String endText=intent.getStringExtra("endText");
        tv_depot_start.setText(startText);
        tv_depot_end.setText(endText);

    }

    private void initDate() {
        OkHttpClient okHttpClient=new OkHttpClient();
        final Request request=new Request.Builder().url(Constant.WEB_DEPOT+Constant.DEPOT_START
        +tv_depot_start.getText().toString()+Constant.DEPOT_END+tv_depot_end.getText().toString()).build();
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
                        List<ABean.ResultBean.ListBean>depotList= JsonParse.getInstance().getDepotList(vlResult);
                        adapter.setDate(depotList);//适配器数赋值
                    }
                    break;
            }
        }
    }
}
