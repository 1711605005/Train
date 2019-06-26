package com.edu.gdpt.xxgcx.train.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Adapter.TrainNumAdapter;
import com.edu.gdpt.xxgcx.train.Bean.Constant;
import com.edu.gdpt.xxgcx.train.Bean.TrainNumBean;
import com.edu.gdpt.xxgcx.train.R;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class TrainNumDataActivity extends AppCompatActivity {

    private TextView tv_tn_lt;
    private RecyclerView rv_tnd_context;
    private LinearLayout ll_tnd_back;
    public String trainNum,Date;
    private TrainNumAdapter adapter;
    private THolder tHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_num_data);
        tHolder=new THolder();
        initView();
        Intent intent=getIntent();
        trainNum=intent.getStringExtra("trainNum");
        Date=intent.getStringExtra("Date");
        tv_tn_lt.setText(trainNum);
        initData();
    }

    private void initData() {
        String tn=trainNum;
        String data=Date;
        OkHttpClient okHttpClient=new OkHttpClient();
        final Request request=new Request.Builder().url(Constant.WEB_TN+Constant.TN_NO+tn+Constant.STATION_DATE+data).build();
        Call call=okHttpClient.newCall(request);
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
                tHolder.sendMessage(msg);
            }
        });
    }

    private void initView() {
        tv_tn_lt = (TextView) findViewById(R.id.tv_tn_lt);
        rv_tnd_context = (RecyclerView) findViewById(R.id.rv_tnd_context);
        ll_tnd_back=(LinearLayout)findViewById(R.id.ll_tnd_back);
        rv_tnd_context.setLayoutManager(new LinearLayoutManager(this));
        adapter=new TrainNumAdapter();
        rv_tnd_context.setAdapter(adapter);
        ll_tnd_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TrainNumDataActivity.this.finish();
            }
        });
    }

    private class THolder extends Handler {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            switch (msg.what){
                case 1:
                    if (msg.obj !=null){
                        String vlResult=(String) msg.obj;
                        TrainNumBean trainNumBean=new Gson().fromJson(vlResult,TrainNumBean.class);
                        adapter.setDate(trainNumBean.getResult().getList());
                    }
                    break;
            }
        }
    }
}
