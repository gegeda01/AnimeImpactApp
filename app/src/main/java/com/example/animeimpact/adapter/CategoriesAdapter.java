package com.example.animeimpact.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.ListActivity;
import com.example.animeimpact.R;
import com.example.animeimpact.model.CategoriesItem;


import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {
    List<CategoriesItem> categoriesItemLists;
    Context context;

    public CategoriesAdapter(Context ct, List<CategoriesItem> categoriesItemLists){
        context = ct;
        this.categoriesItemLists= categoriesItemLists;
    }
    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_categories,parent,false);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder holder, @SuppressLint("RecyclerView")  int position) {
        holder.myText.setText(categoriesItemLists.get(position).getText());
        holder.myImage.setImageResource(categoriesItemLists.get(position).getImageurl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,ListActivity.class);
                i.putExtra("myText", categoriesItemLists.get(position).getText());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoriesItemLists.size();
    }


    public class CategoriesViewHolder extends RecyclerView.ViewHolder {

        TextView myText;
        ImageView myImage;



        public CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage = itemView.findViewById(R.id.categoriesImage);
            myText = itemView.findViewById(R.id.categoriesTitle);
        }
    }
}
