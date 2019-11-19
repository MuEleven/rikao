package com.bw.rikao1113;

/*
   作者 杜凯宾
   时间 19.11.13
   功能 自定义view
* */
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //初始化变量
    private View view;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
