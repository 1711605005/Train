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

import com.edu.gdpt.xxgcx.train.Activity.TrainNumDataActivity;
import com.edu.gdpt.xxgcx.train.Adapter.DepotHistoryAdapter;
import com.edu.gdpt.xxgcx.train.R;
import com.edu.gdpt.xxgcx.train.Sqlite.HistorySQLite;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainNumFragment extends Fragment implements View.OnClickListener {


    private EditText edt_tn_tn;
    private EditText edt_tn_data;
    private CheckBox cb_tn_train;
    private Button btn_tn_query;
    public RecyclerView rv_depot_hc;
    public TextView tv_depot_delete;
    public LinearLayout ll_depot_hc;
    public DepotHistoryAdapter adapter;
    private ArrayList<String> historyList=new ArrayList<String>();

    public TrainNumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_train_num, container, false);
        edt_tn_tn = (EditText) view.findViewById(R.id.edt_tn_tn);
        edt_tn_data = (EditText) view.findViewById(R.id.edt_tn_data);
        cb_tn_train = (CheckBox) view.findViewById(R.id.cb_tn_train);
        btn_tn_query = (Button) view.findViewById(R.id.btn_tn_query);
        rv_depot_hc=(RecyclerView) view.findViewById(R.id.rv_depot_hc);
        ll_depot_hc=(LinearLayout) view.findViewById(R.id.ll_depot_hc);
        tv_depot_delete=(TextView) view.findViewById(R.id.tv_depot_delete);
        btn_tn_query.setOnClickListener(this);
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
            case R.id.btn_tn_query:
                Intent intent=new Intent(getActivity().getApplicationContext(), TrainNumDataActivity.class);
                String trainNum=edt_tn_tn.getText().toString().trim();
                String Date=edt_tn_data.getText().toString().trim();
                intent.putExtra("trainNum",trainNum);
                intent.putExtra("Date",Date);
                startActivity(intent);
                HistorySQLite.getInstance(getActivity()).putNewSearch(trainNum);
                getHistoryList();
                adapter.notifyDataSetChanged();
                break;
            case R.id.tv_depot_delete:
                HistorySQLite.getInstance(getActivity()).deleteAllHistory();
                getHistoryList();
                adapter.notifyDataSetChanged();//刷新列表
                showView();
                break;
        }
    }
}
