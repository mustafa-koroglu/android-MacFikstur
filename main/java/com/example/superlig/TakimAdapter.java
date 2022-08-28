package com.example.superlig;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TakimAdapter extends BaseAdapter {

    ArrayList<Takim> takimArrayList= new ArrayList<>();

    Activity activity=new Activity();

    public TakimAdapter(ArrayList<Takim> takimArrayList, Activity activity) {
        this.takimArrayList = takimArrayList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return takimArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return takimArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(activity).inflate(R.layout.custom_listview_row,parent,false);
        TextView list_row_takim=convertView.findViewById(R.id.list_row_takim);
        ImageView list_row_flag_image=convertView.findViewById(R.id.list_row_flag_image);

        Takim takim= takimArrayList.get(position);
        list_row_takim.setText(takim.getTakim());
        list_row_flag_image.setImageResource(takim.getLogo());

        return convertView;
    }
}
