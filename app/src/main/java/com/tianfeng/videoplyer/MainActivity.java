package com.tianfeng.videoplyer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewDebug;
<<<<<<< HEAD
import android.view.ViewGroup;
=======
>>>>>>> 0b77fb012135c2f9b8d17b52470acd6069af4e59

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

<<<<<<< HEAD
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
=======
>>>>>>> 0b77fb012135c2f9b8d17b52470acd6069af4e59
    }
}
