package cn.upfinder.pricecalendar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cn.upfinder.pricecalendar.R;
import cn.upfinder.pricecalendar.data.MouthData;

/**
 * Created by ucm on 2018/3/29.
 */

public class MouthAdapter extends RecyclerView.Adapter<MouthViewHolder> {

    private List<MouthData> mouths;


    public MouthAdapter(List<MouthData> mouths) {
        this.mouths = mouths;
    }


    @Override
    public MouthViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_mouth_layout, parent, false);
        MouthViewHolder viewHolder = new MouthViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MouthViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
