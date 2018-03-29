package cn.upfinder.pricecalendar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import cn.upfinder.pricecalendar.R;

/**
 * Created by ucm on 2018/3/29.
 */

public class MouthViewHolder extends RecyclerView.ViewHolder {

    private LinearLayout llWeek;
    private ImageView ivLastMouth;
    private ImageView ivNextMouth;
    RecyclerView rvMouth;
    TextView tvMouthName;


    public MouthViewHolder(View itemView) {
        super(itemView);
        llWeek = itemView.findViewById(R.id.llWeeks);
        rvMouth = itemView.findViewById(R.id.rvMouth);
        ivLastMouth = itemView.findViewById(R.id.ivLastMouth);
        ivNextMouth = itemView.findViewById(R.id.ivNextMouth);
        tvMouthName = itemView.findViewById(R.id.tvMouth);
    }
}
