package cn.upfinder.pricecalendardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.upfinder.pricecalendar.PriceCalendar;
import cn.upfinder.pricecalendar.data.DayBean;
import cn.upfinder.pricecalendar.data.DayState;
import cn.upfinder.pricecalendar.data.MouthData;

public class MainActivity extends AppCompatActivity {


    private PriceCalendar pvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pvView = findViewById(R.id.pcView);

        initData();
    }

    private void initData() {
        List<MouthData> mouths = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            MouthData mouth = new MouthData();
            mouth.setMouthName("2018-" + i);
            List<DayBean> days = new ArrayList<>();
            for (int j = 1; j < 30; j++) {
                DayBean dayBean = new DayBean();
                dayBean.setDayNum("" + j);
                dayBean.setInfo("200元");
                dayBean.setState(DayState.CAN_SELECT);
                days.add(dayBean);
            }
            mouth.setDays(days);
            mouths.add(mouth);
        }
        pvView.setNewData(mouths);

    }
}
