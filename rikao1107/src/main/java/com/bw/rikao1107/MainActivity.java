package com.bw.rikao1107;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bw.rikao1107.bean.News;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recycler);
        //设置layoutManager
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //设置adapter
        initData();
        MasonryAdapter adapter=new MasonryAdapter(productList);
        recyclerView.setAdapter(adapter);
        //设置item之间的间隔
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        recyclerView.addItemDecoration(decoration);

    }

    private void initData() {

    }
}
