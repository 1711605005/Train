package com.edu.gdpt.xxgcx.train.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Bean.DepotBean;
import com.edu.gdpt.xxgcx.train.R;

import java.util.List;

public class  DepotDateAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<DepotBean.ResultBean.ListBean> dbl;//列表数据

    public void setDate(List<DepotBean.ResultBean.ListBean> dbl){//初始化数据
        this.dbl=dbl;
        notifyDataSetChanged();
    }

    @NonNull
    @Override//创建视图
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.depot_list_item,viewGroup,false);
        DepotViewHolder depotViewHolder=new DepotViewHolder(view);
        return depotViewHolder;
    }

    @Override//绑定数据
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final DepotBean.ResultBean.ListBean bean=dbl.get(i);

        ((DepotViewHolder)viewHolder).car.setText(bean.getTrainno());
        ((DepotViewHolder)viewHolder).type.setText(bean.getType());
        ((DepotViewHolder)viewHolder).station.setText(bean.getStation());
        ((DepotViewHolder)viewHolder).endstation.setText(bean.getEndstation());
        ((DepotViewHolder)viewHolder).start.setText(bean.getDeparturetime());
        ((DepotViewHolder)viewHolder).end.setText(bean.getArrivaltime());
    }

    @Override
    public int getItemCount() {
        return dbl==null ? 0:dbl.size();
    }

    private class DepotViewHolder extends RecyclerView.ViewHolder {//获取布局文件的控件
        private TextView car,type,station,endstation,start,end;
        public DepotViewHolder(@NonNull View itemView) {
            super(itemView);
            car=itemView.findViewById(R.id.tv_item_car);
            type=itemView.findViewById(R.id.tv_item_type);
            start=itemView.findViewById(R.id.tv_item_start);
            station=itemView.findViewById(R.id.tv_item_station);
            end=itemView.findViewById(R.id.tv_item_end);
            endstation=itemView.findViewById(R.id.tv_item_endstation);

        }
    }
}
