package com.example.animeimpact.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.animeimpact.R;

import java.util.ArrayList;
//This adapter was inspired by https://www.youtube.com/watch?v=nL0k2usU7I8&ab_channel=PRABEESHRK
public class ImageAdapter extends PagerAdapter {
    private ArrayList<String> images;
    private Context context;
    private LayoutInflater layoutinflate;

    public ImageAdapter(ArrayList<String> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutinflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v  = layoutinflate.inflate(R.layout.image_lists,container,false);
        ImageView imageview = v.findViewById(R.id.detailImage);
        int img = context.getResources().getIdentifier(images.get(position), "drawable", context.getPackageName());
        imageview.setImageResource(img);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
