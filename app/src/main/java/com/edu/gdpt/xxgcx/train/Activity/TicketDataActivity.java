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
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Adapter.TicketDataAdapter;
import com.edu.gdpt.xxgcx.train.Bean.Constant;
import com.edu.gdpt.xxgcx.train.Bean.TicketBean;
import com.edu.gdpt.xxgcx.train.R;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class TicketDataActivity extends AppCompatActivity {

    private LinearLayout ll_ticket_back;
    private TextView tv_ticket_start;
    private TextView tv_ticket_end;
    private RecyclerView rv_ticket_context;
    private TicketDataAdapter adapter;
    private THold tHold;
    public String st,et,date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_data);
        tHold=new THold();
        initView();
        initInt();
        initData();

    }

    private void initData() {
        String s=st;
        String e=et;
        String d=date;
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request=new Request.Builder().url(Constant.WEB_STATION+Constant.DEPOT_START+s+Constant.DEPOT_END+e+Constant.STATION_DATE+d).build();
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
                tHold.sendMessage(msg);
            }
        });
    }

    private void initInt() {
        Intent intent=getIntent();
        st=intent.getStringExtra("st");
        et=intent.getStringExtra("et");
        date=intent.getStringExtra("date");
        tv_ticket_start.setText(st);
        tv_ticket_end.setText(et);
    }

    private void initView() {
        ll_ticket_back = (LinearLayout) findViewById(R.id.ll_ticket_back);
        tv_ticket_start = (TextView) findViewById(R.id.tv_ticket_start);
        tv_ticket_end = (TextView) findViewById(R.id.tv_ticket_end);
        rv_ticket_context = (RecyclerView) findViewById(R.id.rv_ticket_context);
        rv_ticket_context.setLayoutManager(new LinearLayoutManager(this));
        adapter=new TicketDataAdapter();
        rv_ticket_context.setAdapter(adapter);
        ll_ticket_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TicketDataActivity.this.finish();
            }
        });
    }

    private class THold extends Handler {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            switch (msg.what){
                case 1:
                    if (msg.obj !=null){
                        String vlResult=(String)msg.obj;
                        TicketBean ticketBean=new Gson().fromJson(vlResult,TicketBean.class);
                        adapter.setDate(ticketBean.getResult().getList());
                    }
                    break;
            }
        }
    }
}
