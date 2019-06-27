package com.edu.gdpt.xxgcx.train.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.gdpt.xxgcx.train.Activity.TicketDataActivity;
import com.edu.gdpt.xxgcx.train.Adapter.DepotHistoryAdapter;
import com.edu.gdpt.xxgcx.train.R;
import com.edu.gdpt.xxgcx.train.Sqlite.HistorySQLite;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TicketFragment extends Fragment implements View.OnClickListener {


    private EditText edt_station_start;
    private EditText edt_station_end;
    private EditText edt_station_data;
    private CheckBox cb_station_train;
    private TextView tv_station_turn;
    private Button btn_station_query;
    public RecyclerView rv_depot_hc;
    public TextView tv_depot_delete;
    public LinearLayout ll_depot_hc;
    public DepotHistoryAdapter adapter;
    private ArrayList<String> historyList=new ArrayList<String>();


    public TicketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ticket, container, false);
        edt_station_start = (EditText) view.findViewById(R.id.edt_station_start);
        edt_station_end = (EditText) view.findViewById(R.id.edt_station_end);
        edt_station_data = (EditText) view.findViewById(R.id.edt_station_data);
        cb_station_train = (CheckBox) view.findViewById(R.id.cb_station_train);
        tv_station_turn = (TextView) view.findViewById(R.id.tv_station_turn);
        btn_station_query = (Button) view.findViewById(R.id.btn_station_query);
        rv_depot_hc=(RecyclerView) view.findViewById(R.id.rv_depot_hc);
        ll_depot_hc=(LinearLayout) view.findViewById(R.id.ll_depot_hc);
        tv_depot_delete=(TextView) view.findViewById(R.id.tv_depot_delete);
        btn_station_query.setOnClickListener(this);
        tv_station_turn.setOnClickListener(this);
        tv_depot_delete.setOnClickListener(this);

        initHistoryRecycler();//初始化historyRecycler
        getHistoryList();//得到历史记录数组

        return view;
    }

    private void getHistoryList() {
        historyList.clear();
        historyList.addAll(HistorySQLite.getInstance(getContext()).queryHistoryList());
        adapter.notifyDataSetChanged();
        showView();
    }

    private void initHistoryRecycler() {
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_depot_hc.setLayoutManager(layoutManager);
        rv_depot_hc.setNestedScrollingEnabled(false);//解决滑动冲突
        adapter=new DepotHistoryAdapter(getContext(),historyList);
        rv_depot_hc.setAdapter(adapter);
        adapter.setOnItemClickListener(new DepotHistoryAdapter.OnItemClickListener() {
            @Override
            public void onItemDeleteImgClick(View v, String name) {
                HistorySQLite.getInstance(getActivity()).deleteHistory(name);
                getHistoryList();
                adapter.notifyDataSetChanged();
                showView();
            }
        });
    }
    private void showView() {
        if (historyList.size()>0){
            ll_depot_hc.setVisibility(View.VISIBLE);
        }else {
            ll_depot_hc.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_station_query:
                submit();
                Intent intent=new Intent(getContext(), TicketDataActivity.class);
                String st=edt_station_start.getText().toString().trim();
                String et=edt_station_end.getText().toString().trim();
                String date=edt_station_data.getText().toString().trim();

                intent.putExtra("st",st);
                intent.putExtra("et",et);
                intent.putExtra("date",date);

                startActivity(intent);
                HistorySQLite.getInstance(getActivity()).putNewSearch(st+"—>"+et);
                getHistoryList();
                adapter.notifyDataSetChanged();
                break;
            case R.id.tv_depot_delete:
                HistorySQLite.getInstance(getActivity()).deleteAllHistory();
                getHistoryList();
                adapter.notifyDataSetChanged();//刷新列表
                showView();
                break;
            case R.id.tv_station_turn:
                String s=edt_station_end.getText().toString().trim();
                String e=edt_station_start.getText().toString().trim();
                edt_station_start.setText(s);
                edt_station_end.setText(e);
                break;
        }
    }

    private void submit() {
        // validate
        String start = edt_station_start.getText().toString().trim();
        if (TextUtils.isEmpty(start)) {
            Toast.makeText(getContext(), "出发站不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String end = edt_station_end.getText().toString().trim();
        if (TextUtils.isEmpty(end)) {
            Toast.makeText(getContext(), "目的站不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String date = edt_station_data.getText().toString().trim();
        if (TextUtils.isEmpty(date)) {
            Toast.makeText(getContext(), "日期不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
