package com.edu.gdpt.xxgcx.train.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.R;

import java.util.List;

public class TrainNumDataActivity extends AppCompatActivity {

    private TextView tv_tn_lt;
    private ListView lv_tnd_context;
    private List<Demo>demoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_num_data);
        initView();

    }

    private void initView() {
        tv_tn_lt = (TextView) findViewById(R.id.tv_tn_lt);
        lv_tnd_context = (ListView) findViewById(R.id.lv_tnd_context);
    }
    private class DataAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return demoList.size();
        }

        @Override
        public Object getItem(int position) {
            return demoList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tnd_list_item,null);
            TextView num=view.findViewById(R.id.tv_tnd_num);
            num.setText(demoList.get(position).num);

            TextView type=view.findViewById(R.id.tv_tnd_type);
            type.setText(demoList.get(position).type);

            TextView start=view.findViewById(R.id.tv_tnd_start);
            start.setText(demoList.get(position).start);

            TextView stime=view.findViewById(R.id.tv_tnd_stime);
            stime.setText(demoList.get(position).stime);

            TextView atime=view.findViewById(R.id.tv_tnd_atime);
            atime.setText(demoList.get(position).atime);

            TextView stop=view.findViewById(R.id.tv_tnd_stop);
            stop.setText(demoList.get(position).stop);

            return view;
        }
    }
    private class Demo {
        String num,type,start,stime,atime,stop;
    }
}
