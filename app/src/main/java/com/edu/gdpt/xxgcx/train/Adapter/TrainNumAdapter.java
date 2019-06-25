package com.edu.gdpt.xxgcx.train.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

//import com.edu.gdpt.xxgcx.train.Activity.TrainNumDataActivity.Demo;
import com.edu.gdpt.xxgcx.train.Bean.TrainNumBean;
import com.edu.gdpt.xxgcx.train.R;

import java.util.List;

public class TrainNumAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<TrainNumBean.ResultBean.ListBean> tbl;//列表数据
    public void setDate(List<TrainNumBean.ResultBean.ListBean> tdl){//初始化数据
        this.tbl=tdl;
        notifyDataSetChanged();
    }

    @NonNull
    @Override//创建视图
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tnd_list_item,viewGroup,false);
        TrainNumViewHolder trainNumViewHolder=new TrainNumViewHolder(view);
        return trainNumViewHolder;
    }

    @Override//绑定数据
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final TrainNumBean.ResultBean.ListBean bean=tbl.get(i);

        ((TrainNumViewHolder)viewHolder).num.setText(bean.getSequenceno());
        ((TrainNumViewHolder)viewHolder).costtime.setText(bean.getCosttime());
        ((TrainNumViewHolder)viewHolder).start.setText(bean.getStation());
        ((TrainNumViewHolder)viewHolder).atime.setText(bean.getArrivaltime());
        ((TrainNumViewHolder)viewHolder).stime.setText(bean.getDeparturetime());
        ((TrainNumViewHolder)viewHolder).stop.setText(bean.getStoptime());

    }

    @Override
    public int getItemCount() {
        return tbl==null ? 0 : tbl.size();
    }

    private class TrainNumViewHolder extends RecyclerView.ViewHolder {//获取布局文件的控件
        private TextView num,costtime,start,atime,stime,stop;
        public TrainNumViewHolder(@NonNull View itemView) {
            super(itemView);
            num=itemView.findViewById(R.id.tv_tnd_num);
            costtime=itemView.findViewById(R.id.tv_tnd_costtime);
            start=itemView.findViewById(R.id.tv_tnd_start);
            atime=itemView.findViewById(R.id.tv_tnd_atime);
            stime=itemView.findViewById(R.id.tv_tnd_stime);
            stop=itemView.findViewById(R.id.tv_tnd_stop);
        }
    }
}
