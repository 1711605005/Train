package com.edu.gdpt.xxgcx.train.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.R;

import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.*;

public class DepotHistoryAdapter extends RecyclerView.Adapter<DepotHistoryAdapter.ViewHolder> implements View.OnClickListener{
    private Context context;
    private List<String> historyList=new ArrayList<String>();
    private OnItemClickListener onItemClickListener;
    public DepotHistoryAdapter(Context context, List<String> historyList){
        this.context=context;
        this.historyList=historyList;
    }
    @NonNull
    @Override
    public DepotHistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_hc_item,null);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DepotHistoryAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_start.setText(historyList.get(i));
        viewHolder.tv_start.setTag(historyList.get(i));
//        viewHolder.tv_end.setText(historyList.get(i));
//        viewHolder.tv_end.setTag(historyList.get(i));
//        viewHolder.deleteImg.setTag(historyList.get(i));
        viewHolder.tv_start.setOnClickListener(this);
//        viewHolder.tv_end.setOnClickListener(this);
//        viewHolder.deleteImg.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.iv_hc_delete:
//                if (onItemClickListener !=null){
//                    onItemClickListener.onItemDeleteImgClick(v,(String)v.getTag());
//                }
//                break;
        }
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.onItemClickListener=listener;
    }
    public interface OnItemClickListener{
        void onItemDeleteImgClick(View v,String name);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_start;
//        private ImageView deleteImg;
        private View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_start=(TextView)itemView.findViewById(R.id.tv_hc_start);
//            tv_end=(TextView)itemView.findViewById(R.id.tv_hc_end);
//            deleteImg=(ImageView)itemView.findViewById(R.id.iv_hc_delete);
            this.view=itemView;
        }

    }
}
