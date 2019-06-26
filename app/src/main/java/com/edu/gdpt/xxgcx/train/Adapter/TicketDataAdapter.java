package com.edu.gdpt.xxgcx.train.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Bean.TicketBean;
import com.edu.gdpt.xxgcx.train.R;

import org.w3c.dom.Text;

import java.util.List;
import java.util.logging.Handler;

public class TicketDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public List<TicketBean.ResultBean.ListBean> tnbl;
    public void setDate(List<TicketBean.ResultBean.ListBean> tnbl){
        this.tnbl=tnbl;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ticket_list_item,viewGroup,false);
        TicketViewHolder ticketViewHolder=new TicketViewHolder(view);
        return ticketViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final TicketBean.ResultBean.ListBean bean=tnbl.get(i);

        ((TicketViewHolder)viewHolder).num.setText(bean.getTrainno());
        ((TicketViewHolder)viewHolder).start.setText(bean.getDepartstation());
        ((TicketViewHolder)viewHolder).end.setText(bean.getTerminalstation());
        ((TicketViewHolder)viewHolder).stime.setText(bean.getDeparturetime());
        ((TicketViewHolder)viewHolder).atime.setText(bean.getArrivaltime());
        ((TicketViewHolder)viewHolder).lost.setText(bean.getNumsw());
    }

    @Override
    public int getItemCount() {
        return tnbl == null ? 0 : tnbl.size();
    }

    private class TicketViewHolder extends RecyclerView.ViewHolder {
        private TextView num,start,end,stime,atime,lost;
        public TicketViewHolder(@NonNull View itemView) {
            super(itemView);
            num=itemView.findViewById(R.id.tv_tl_num);
            start=itemView.findViewById(R.id.tv_tl_start);
            end=itemView.findViewById(R.id.tv_tl_end);
            stime=itemView.findViewById(R.id.tv_tl_stime);
            atime=itemView.findViewById(R.id.tv_tl_atime);
            lost=itemView.findViewById(R.id.tv_tl_lost);

        }
    }
}
