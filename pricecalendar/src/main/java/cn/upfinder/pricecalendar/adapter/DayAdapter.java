package cn.upfinder.pricecalendar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cn.upfinder.pricecalendar.R;
import cn.upfinder.pricecalendar.data.DayBean;

/**
 * Created by ucm on 2018/3/29.
 */

public class DayAdapter extends RecyclerView.Adapter<DayViewHolder> {


    private List<DayBean> days;

    DayAdapter(List<DayBean> days) {
        this.days = days;
    }


    @Override
    public DayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_day_layout, parent, false);
        DayViewHolder viewHolder = new DayViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DayViewHolder holder, int position) {

        DayBean day = days.get(position);
        holder.tvDay.setText(day.getDayNum());
        holder.tvInfo.setText(day.getInfo());
        switch (day.getState()) {
            case END:
                break;
            case START:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return days.size();
    }
}
