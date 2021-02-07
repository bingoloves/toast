package cn.cqs.toast.style;

import android.content.Context;
import android.view.Gravity;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/ToastUtils
 *    time   : 2018/12/06
 *    desc   : 支付宝样式实现
 */
public class ToastAliPayStyle extends BaseToastStyle {

    public ToastAliPayStyle(Context context) {
        super(context);
    }

    @Override
    public int getGravity() {
        return Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM;
    }

    @Override
    public int getYOffset() {
        return dp2px(80);
    }

    @Override
    public int getCornerRadius() {
        return dp2px(4);
    }

    @Override
    public int getBackgroundColor() {
        return 0XEE575757;
    }

    @Override
    public int getTextColor() {
        return 0XFFFFFFFF;
    }

    @Override
    public float getTextSize() {
        return sp2px(14);
    }

    @Override
    public int getPaddingStart() {
        return dp2px(10);
    }

    @Override
    public int getPaddingTop() {
        return dp2px(6);
    }
}