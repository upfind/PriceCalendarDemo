package cn.upfinder.pricecalendar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.upfinder.pricecalendar.R;

/**
 * Created by ucm on 2018/3/29.
 */

public class DayViewHolder extends RecyclerView.ViewHolder {


    public RelativeLayout rvBg;
    public TextView tvDay;
    public TextView tvInfo;


    public DayViewHolder(View itemView) {
        super(itemView);
        rvBg = itemView.findViewById(R.id.rvDay);
        tvDay = itemView.findViewById(R.id.tvDay);
        tvInfo = itemView.findViewById(R.id.tvInfo);
    }
}
