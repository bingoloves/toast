package cn.cqs.toast.style;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;

import cn.cqs.toast.IToastStyle;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/ToastUtils
 *    time   : 2019/05/19
 *    desc   : 默认样式基类
 */
public abstract class BaseToastStyle implements IToastStyle {

    private Context mContext;

    public BaseToastStyle(Context context) {
        mContext = context;
    }

    @Override
    public int getGravity() {
        return Gravity.CENTER;
    }

    @Override
    public int getXOffset() {
        return 0;
    }

    @Override
    public int getYOffset() {
        return 0;
    }

    @Override
    public int getZ() {
        return 30;
    }

    @Override
    public int getMaxLines() {
        return 5;
    }

    @Override
    public int getPaddingEnd() {
        return getPaddingStart();
    }

    @Override
    public int getPaddingBottom() {
        return getPaddingTop();
    }

    /**
     * dp转px
     */
    protected int dp2px(float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, mContext.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     */
    protected int sp2px(float spValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue, mContext.getResources().getDisplayMetrics());
    }
//    /**
//     * 根据手机的分辨率从 sp 的单位 转成为 px
//     *
//     * @param spValue SP值
//     * @return 像素值
//     */
//    protected int sp2px(float spValue) {
//        float fontScale = mContext.getResources().getDisplayMetrics().scaledDensity;
//        return (int) (spValue * fontScale + 0.5f);
//    }
//    /**
//     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
//     *
//     * @param dpValue 尺寸dip
//     * @return 像素值
//     */
//    protected int dp2px(float dpValue) {
//        final float scale = mContext.getResources().getDisplayMetrics().density;
//        return (int) (dpValue * scale + 0.5f);
//    }
}