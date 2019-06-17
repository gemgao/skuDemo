package com.example.myapplication;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;

import static android.view.View.MeasureSpec.AT_MOST;

/**
 * 作者：gem on 2019/6/17 15:14
 */
public class AttrLayout extends LinearLayoutManager {
    Context mContext;
    public AttrLayout(Context context) {
        super(context);
        this.mContext =context;
    }

    public AttrLayout(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public AttrLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec) {
        super.setMeasuredDimension(childrenBounds, wSpec, View.MeasureSpec.makeMeasureSpec(DeviceUtil.dp2px(mContext,246), AT_MOST));
    }
}
