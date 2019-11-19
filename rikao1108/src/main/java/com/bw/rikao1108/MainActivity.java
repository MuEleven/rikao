package com.bw.rikao1108;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

public class MainActivity extends AppCompatActivity {
    private Banner banner;
    private TextView textView;
    private ImageView imageView;

    private Bitmap blist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        banner.setImageLoader(new ImageLoader() {
//            @Override
//            public void displayImage(Context context, Object path, ImageView imageView) {
//                Bean2 path1 = (Bean2) path;
//                Glide.with(context).load(path1.getImageUrl()).into(imageView);
//            }
//        });
        //设置照片
        //list数据类型为图片http://h.hiphotos.baidu.com/image/pic/item/a6efce1b9d16fdfad03ef192ba8f8c5494ee7b7f.jpg
        //如list.add("http://h.hiphotos.baidu.com/image/pic/item/a6efce1b9d16fdfad03ef192ba8f8c5494ee7b7f.jpg");
//        banner.setImages(blist);
        //是否是自动轮播
        banner.isAutoPlay(true);
        //设置延迟时间
        banner.setDelayTime(2000);
        //开始轮播
        banner.start();

    }
}
