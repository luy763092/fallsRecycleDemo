package com.tianfeng.videoplyer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;

public class MainActivity extends Activity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.id_rv_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private class MyAdapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
