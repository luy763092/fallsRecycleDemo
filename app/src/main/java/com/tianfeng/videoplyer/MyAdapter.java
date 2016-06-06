package com.tianfeng.videoplyer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LUY on 2016/6/6.
 */
class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private ArrayList<String> Data;
    private Context context;

    public HomeAdapter(Context con, ArrayList mDates) {
        this.context = con;
        this.Data = mDates;
    }

    @Override
    public HomeAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MyViewHolder holder;
        holder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler, viewGroup,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(HomeAdapter.MyViewHolder myViewHolder, int position) {
        myViewHolder.tv.setText(Data.get(position));
    }


    @Override
    public int getItemCount() {
        return Data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public MyViewHolder(View view) {
            super(view);
            tv = (TextView) view.findViewById(R.id.id_num);
        }
    }
}
