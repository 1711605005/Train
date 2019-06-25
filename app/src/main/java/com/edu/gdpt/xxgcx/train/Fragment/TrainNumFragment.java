package com.edu.gdpt.xxgcx.train.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.gdpt.xxgcx.train.Activity.TrainNumDataActivity;
import com.edu.gdpt.xxgcx.train.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainNumFragment extends Fragment implements View.OnClickListener {


    private EditText edt_tn_tn;
    private EditText edt_tn_data;
    private CheckBox cb_tn_train;
    private Button btn_tn_query;
    private TextView tv_tn_hc;

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
        tv_tn_hc = (TextView) view.findViewById(R.id.tv_tn_hc);
        btn_tn_query.setOnClickListener(this);


        return view;
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
                break;
        }
    }
}
