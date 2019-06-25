package com.edu.gdpt.xxgcx.train.Fragment;


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

import com.edu.gdpt.xxgcx.train.R;

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
    private TextView tv_station_hc;

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
        tv_station_hc = (TextView) view.findViewById(R.id.tv_station_hc);

        btn_station_query.setOnClickListener(this);
        tv_station_turn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_station_query:

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

        // TODO validate success, do something


    }
}
