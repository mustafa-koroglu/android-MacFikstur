package com.example.superlig;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KarsilasmalarAdapter extends RecyclerView.Adapter<KarsilasmalarAdapter.ViewHolder> {

    KarsilasmalarData[] karsilasmalarData;
    Context context;

    public KarsilasmalarAdapter(KarsilasmalarData[]karsilasmalarData,Karsilasmalar karsilasmalar) {
        this.karsilasmalarData=karsilasmalarData;
        this.context=karsilasmalar;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.karsilasmalar_item_list,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final KarsilasmalarData karsilasmalarDataList=karsilasmalarData[position];
        holder.imageView.setImageResource(karsilasmalarDataList.getImage());
        holder.textTakim.setText(karsilasmalarDataList.getTakim());
        holder.textTarih.setText(karsilasmalarDataList.getTarih());
        holder.textTakim1.setText(karsilasmalarDataList.getTakim1());
        holder.imageView1.setImageResource(karsilasmalarDataList.getImage1());

    }

    @Override
    public int getItemCount() {
        return karsilasmalarData.length;
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        ImageView imageView1;
        TextView textTakim;
        TextView textTakim1;
        TextView textTarih;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            imageView1=itemView.findViewById(R.id.imageView1);
            textTakim=itemView.findViewById(R.id.textTakim);
            textTakim1=itemView.findViewById(R.id.textTakim1);
            textTarih=itemView.findViewById(R.id.textTarih);

        }
    }

}
