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
import android.widget.LinearLayout;
import android.widget.Toast;
import com.edu.gdpt.xxgcx.train.Activity.DepotDateActivity;
import com.edu.gdpt.xxgcx.train.R;

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

        btn_depot_query.setOnClickListener(this);
        ll_depot_turn.setOnClickListener(this);


        return view;
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
                break;
            case R.id.ll_depot_turn:
                String s=edt_depot_start.getText().toString().trim();
                String e=edt_depot_end.getText().toString().trim();
                edt_depot_start.setText(e);
                edt_depot_end.setText(s);
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
