package com.bw.rikao1115;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //初始化属性
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator obj = ObjectAnimator.ofFloat(image,"rotation",0f,360f);
                obj.setDuration(3000);
                //启动动画
                obj.start();
            }
        });
    }
}
