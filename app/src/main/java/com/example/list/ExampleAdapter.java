package com.example.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    public   ArrayList<view> mExampleList ;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView ;
        public TextView mTextView1 ;
        public TextView mTextView2 ;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img1);
            mTextView1 = itemView.findViewById(R.id.ln1);
            mTextView2 = itemView.findViewById(R.id.ln2);

        }
    }

    public ExampleAdapter(ArrayList<view> exampleList) {
        mExampleList = exampleList ;
    }
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view , parent , false);
        ExampleViewHolder evh = new ExampleViewHolder(v) ;
        return evh ;

    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        view current = mExampleList.get(position);
        holder.mImageView.setImageResource(current.getmImageResourse());
        holder.mTextView1.setText(current.getmText1());
        holder.mTextView2.setText(current.getmText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
