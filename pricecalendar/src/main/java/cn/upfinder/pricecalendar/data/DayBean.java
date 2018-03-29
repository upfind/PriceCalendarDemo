package cn.upfinder.pricecalendar.data;

/**
 * Created by ucm on 2018/3/29.
 */

public class DayBean {

    private String info; //日期底部信息 220元
    private String dayNum;  //日期 1，2 ，3等

    private DayState state; //日期状态 可选不可选等


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDayNum() {
        return dayNum;
    }

    public void setDayNum(String dayNum) {
        this.dayNum = dayNum;
    }

    public DayState getState() {
        return state;
    }

    public void setState(DayState state) {
        this.state = state;
    }
}
