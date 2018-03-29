package cn.upfinder.pricecalendar.data;

import java.util.List;

/**
 * Created by ucm on 2018/3/29.
 */

public class MouthData {
    private String mouthName; //月份名称必须按照这样的格式 2018-12
    private List<DayBean> days;

    public String getMouthName() {
        return mouthName;
    }

    public void setMouthName(String mouthName) {
        this.mouthName = mouthName;
    }

    public List<DayBean> getDays() {
        return days;
    }

    public void setDays(List<DayBean> days) {
        this.days = days;
    }
}
