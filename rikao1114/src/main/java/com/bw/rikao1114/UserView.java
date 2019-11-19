package com.bw.rikao1114;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

public class UserView extends View implements View.OnClickListener{
    //定义颜色的数组
    private int[] color = new int[]{Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.DKGRAY,Color.GRAY};
    //定义文字
    private String[] textColor = new String[]{"美 女","知 性","性 感","热 舞","女 神","丰 满"};
    //屏幕的中心点
    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    private RotateAnimation mAnimation;
    private boolean isRote;

    public UserView(Context context) {
        this(context,null);
    }

    public UserView(Context context,  AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public UserView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //获取屏幕适配
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        //获取屏幕的宽和高
        int widthPixels = displayMetrics.widthPixels;
        int heightPixels = displayMetrics.heightPixels;
        //得到中心点 所以要除2
        mWidth = widthPixels / 2;
        mHeight = heightPixels / 2;
        //初始化数据 画笔
        initPaint();
        //动画
        initAnimation();
        //点击事件
        setOnClickListener(this);
    }

    private void initPaint() {
        //创建一个画笔
        mPaint = new Paint();
        //给画笔设置颜色
        mPaint.setColor(Color.RED);
        //给画笔设置宽度
        mPaint.setStrokeWidth(2);
        //消除毛边
        mPaint.setAntiAlias(true);
        //设置样式填充
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //动画  找到中心点  平移
        canvas.translate(mWidth,mHeight);
        RectF rectF = new RectF(-260,-260,260,260);
        //定义一个
        float start = 60;
        //分为6个
        for (int i = 0; i < 6; i++) {
            //循环每个不同的颜色
            mPaint.setColor(color[i]);
            //画圆弧
            canvas.drawArc(rectF,start*i,60,true,mPaint);
        }
        //画笔设置颜色
        mPaint.setColor(Color.RED);
        //开始画圆           x     y        半径
        canvas.drawCircle(0,0,100,mPaint);
        //设置字体颜色和大小
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(30);
        //创建
        Rect rect = new Rect();
        mPaint.getTextBounds("点击送老婆",0,5,rect);
        //定义rect宽和高
        int width = rect.width();
        int height = rect.height();
        canvas.drawText("点击送老婆",-width/2,height/2,mPaint);

        RectF rectF1 = new RectF(-200,-200,200,200);
        //这个是文字的循环
        for (int i = 0; i <6 ; i++) {
            //文字
            mPaint.setColor(Color.WHITE);
            mPaint.setTextSize(30);
            Path path = new Path();
            path.addArc(rectF1,start*i+20,60);
            canvas.drawTextOnPath(textColor[i],path,0,0,mPaint);
        }
    }
    //动画 旋转
    private void initAnimation() {
        mAnimation = new RotateAnimation(0, 360, mWidth, mHeight);
        //设置重复的次数
        mAnimation.setRepeatCount(-1);
        //设置终止填充
        mAnimation.setFillAfter(true);
        mAnimation.setDuration(400);
        //是Animation的xml的一个属性
        mAnimation.setInterpolator(new LinearInterpolator());
        //设置重复模式
        mAnimation.setRepeatMode(Animation.RESTART);

    }
    private void start(){
        startAnimation(mAnimation);
        isRote = true;
    }
    private void stop(){
        isRote = false;
        clearAnimation();
    }
    //点击事件
    @Override
    public void onClick(View v) {
        if (isRote){
            stop();
            // radom();
        }else {
            start();
        }
    }
}