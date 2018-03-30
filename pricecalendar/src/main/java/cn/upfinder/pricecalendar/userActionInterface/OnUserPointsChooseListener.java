package cn.upfinder.pricecalendar.userActionInterface;

import java.util.List;

import cn.upfinder.pricecalendar.data.DayBean;

/**
 * Created by ucm on 2018/3/30.
 */

public interface OnUserPointsChooseListener {

    void onPointsChoosed(List<DayBean> days);
}
