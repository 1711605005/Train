package com.edu.gdpt.xxgcx.train.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.R;

public class TicketDataActivity extends AppCompatActivity {

    private LinearLayout ll_ticket_back;
    private TextView tv_ticket_start;
    private TextView tv_ticket_end;
    private RecyclerView rv_ticket_context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_data);
        initView();
    }

    private void initView() {
        ll_ticket_back = (LinearLayout) findViewById(R.id.ll_ticket_back);
        tv_ticket_start = (TextView) findViewById(R.id.tv_ticket_start);
        tv_ticket_end = (TextView) findViewById(R.id.tv_ticket_end);
        rv_ticket_context = (RecyclerView) findViewById(R.id.rv_ticket_context);
    }
}
