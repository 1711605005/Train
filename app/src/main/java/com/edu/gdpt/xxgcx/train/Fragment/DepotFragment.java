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
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.edu.gdpt.xxgcx.train.Activity.DepotDateActivity;
import com.edu.gdpt.xxgcx.train.Adapter.DepotHistoryAdapter;
import com.edu.gdpt.xxgcx.train.R;
import com.edu.gdpt.xxgcx.train.Sqlite.HistorySQLite;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DepotFragment extends Fragment implements View.OnClickListener {


    public EditText edt_depot_start;
    public EditText edt_depot_end;
    public LinearLayout ll_depot_turn;
    public EditText edt_depot_data;
    public CheckBox cb_depot_train;
    public Button btn_depot_query;
    public RecyclerView rv_depot_hc;
    public TextView tv_depot_delete;
    public LinearLayout ll_depot_hc;
    public DepotHistoryAdapter adapter;
    private ArrayList<String> historyList=new ArrayList<String>();

    public DepotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_depot, container, false);

        edt_depot_start = (EditText) view.findViewById(R.id.edt_depot_start);
        edt_depot_end = (EditText) view.findViewById(R.id.edt_depot_end);
        ll_depot_turn = (LinearLayout) view.findViewById(R.id.ll_depot_turn);
        edt_depot_data = (EditText) view.findViewById(R.id.edt_depot_data);
        cb_depot_train = (CheckBox) view.findViewById(R.id.cb_depot_train);
        btn_depot_query = (Button) view.findViewById(R.id.btn_depot_query);
        rv_depot_hc=(RecyclerView) view.findViewById(R.id.rv_depot_hc);
        ll_depot_hc=(LinearLayout) view.findViewById(R.id.ll_depot_hc);
        tv_depot_delete=(TextView) view.findViewById(R.id.tv_depot_delete);

        btn_depot_query.setOnClickListener(this);
        ll_depot_turn.setOnClickListener(this);
        tv_depot_delete.setOnClickListener(this);

        initHistoryRecycler();//初始化historyRecycler
        getHistoryList();//得到历史记录数组
//        setHistoryDeleteAll();

        return view;
    }

//    private void setHistoryDeleteAll() {
//        tv_depot_delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//    }

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
            case R.id.btn_depot_query:
                submit();
                Intent intent=new Intent(getContext(), DepotDateActivity.class);
                String startText=edt_depot_start.getText().toString().trim();
                String endText=edt_depot_end.getText().toString().trim();
                String Data=edt_depot_data.getText().toString().trim();
                intent.putExtra("Data",Data);
                intent.putExtra("startText",startText);
                intent.putExtra("endText",endText);
                startActivity(intent);
                HistorySQLite.getInstance(getActivity()).putNewSearch(startText+"—>"+endText);
                getHistoryList();
                adapter.notifyDataSetChanged();
                break;
            case R.id.ll_depot_turn:
                String s=edt_depot_start.getText().toString().trim();
                String e=edt_depot_end.getText().toString().trim();
                edt_depot_start.setText(e);
                edt_depot_end.setText(s);
                break;
            case R.id.tv_depot_delete:
                HistorySQLite.getInstance(getActivity()).deleteAllHistory();
                getHistoryList();
                adapter.notifyDataSetChanged();//刷新列表
                showView();
                break;
        }
    }
    private void submit() {
        // validate
        String start = edt_depot_start.getText().toString().trim();
        if (TextUtils.isEmpty(start)) {
            Toast.makeText(getContext(), "出发站不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String end = edt_depot_end.getText().toString().trim();
        if (TextUtils.isEmpty(end)) {
            Toast.makeText(getContext(), "到达站不能为空", Toast.LENGTH_SHORT).show();
            return;
        }


        // TODO validate success, do something


    }

}
