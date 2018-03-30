package cn.upfinder.pricecalendar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

import cn.upfinder.pricecalendar.adapter.MouthAdapter;
import cn.upfinder.pricecalendar.data.MouthData;

/**
 * Created by ucm on 2018/3/29.
 */

public class PriceCalendar extends RecyclerView {


    private List<MouthData> mMouths;
    private MouthAdapter adapter;


    public PriceCalendar(Context context) {
        this(context, null);
    }

    public PriceCalendar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PriceCalendar(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        //初始化属性

        //初始化数据
        initData(context);
    }

    private void initData(Context context) {

        mMouths = new ArrayList<>();
        adapter = new MouthAdapter(context, mMouths);
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    public void setNewData(List<MouthData> mouths) {
        this.mMouths = mouths;
        adapter.notifyDataSetChanged();
    }


}
