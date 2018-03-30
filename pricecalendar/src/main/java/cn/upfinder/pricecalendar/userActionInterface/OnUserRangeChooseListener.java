package cn.upfinder.pricecalendar.userActionInterface;

import java.util.List;

import cn.upfinder.pricecalendar.data.DayBean;

/**
 * Created by ucm on 2018/3/30.
 */

public interface OnUserRangeChooseListener {

    void onRangeChoosed(List<DayBean> days);

}
