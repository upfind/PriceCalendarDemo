package cn.upfinder.pricecalendar.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
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
    private Context mContext;


    public MouthAdapter(Context context, List<MouthData> mouths) {
        this.mContext = context;
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

        MouthData mouth = mouths.get(position);
        holder.tvMouthName.setText(mouth.getMouthName());
        holder.rvMouth.setLayoutManager(new GridLayoutManager(mContext, 7));


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
