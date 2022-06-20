package com.example.recycleviewusingcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    ArrayList<Model> contentsList = new ArrayList<>();

    myAdapter(ArrayList<Model> contents){
        contentsList = contents;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_adapter,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.t1.setText(contentsList.get(position).getHeader());
        holder.t2.setText(contentsList.get(position).getDesc());
        holder.img.setImageResource(contentsList.get(position).getImg());



    }

    @Override
    public int getItemCount() {
        return contentsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView t1 , t2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView);
            t1=itemView.findViewById(R.id.header);
            t2=itemView.findViewById(R.id.desc);
        }
    }
}
