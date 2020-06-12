package com.example.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private int[] image_id={R.drawable.one,R.drawable.two,R.drawable.tree,R.drawable.four,R.drawable.five,R.drawable.six,
            R.drawable.seven,R.drawable.eight,R.drawable.nigne,R.drawable.ten};
    Context ctx;
    ImageAdapter(Context ctx){
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return image_id.length;
    }

    @Override
    public Object getItem(int position) {
        return image_id[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView=convertView;
        if(gridView==null){
            LayoutInflater inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView=inflater.inflate(R.layout.custom_image_layout,null);
        }
        ImageView i1=(ImageView)gridView.findViewById(R.id.myimage);
        i1.setImageResource(image_id[position]);
        return gridView;
    }
}
