package com.bw.rikao1113;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class UserView extends View {
    private int width;
    private int height;
    private Paint linePaint;
    private Paint textPaint;
    private Paint pointPaint;
    private Context context;
    public UserView(Context context) {
        super(context);
    }

    public UserView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }
    private void init() {
        linePaint = new Paint();
        linePaint.setStyle(Paint.Style.FILL);
        linePaint.setColor(Color.RED);
        linePaint.setAntiAlias(true);
        linePaint.setStrokeWidth((float)2.0);
        //文字画笔
        textPaint = new Paint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Color.RED);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(ScreenUtils.getDpToPx(context,10));
        //文字画笔
        pointPaint = new Paint();
        pointPaint.setTextAlign(Paint.Align.CENTER);
        pointPaint.setStyle(Paint.Style.FILL);
        pointPaint.setColor(Color.RED);
        pointPaint.setAntiAlias(true);
        pointPaint.setTextSize(ScreenUtils.getDpToPx(context,20));
    }

    public UserView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
