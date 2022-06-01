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
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.DetailsActivity;
import com.example.animeimpact.R;
import com.example.animeimpact.TopPicksDetailActivity;
import com.example.animeimpact.model.TopPicksItem;

import java.util.List;

public class TopPicksAdapter extends RecyclerView.Adapter<TopPicksAdapter.TopPicksViewHolder> {
    List<TopPicksItem> topPicksItemLists;
    Context context;

    public TopPicksAdapter(Context ct, List<TopPicksItem> topPicksItemLists){
        context = ct;
        this.topPicksItemLists=topPicksItemLists;
    }
    @NonNull
    @Override
    public TopPicksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_toppicks,parent,false);
        return new TopPicksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPicksViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.myText1.setText(topPicksItemLists.get(position).getText1());
        holder.myText2.setText(topPicksItemLists.get(position).getText2());
        holder.myImage.setImageResource(topPicksItemLists.get(position).getImageurl());


        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, TopPicksDetailActivity.class);
                i.putExtra("title", topPicksItemLists.get(position).getText2());
                i.putExtra("info", topPicksItemLists.get(position).getText1());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topPicksItemLists.size();
    }

    public class TopPicksViewHolder extends RecyclerView.ViewHolder{

        TextView myText1, myText2;
        ImageView myImage;
        public TopPicksViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage = itemView.findViewById(R.id.topPicksImage);
            myText1 = itemView.findViewById(R.id.topPicksType);
            myText2 = itemView.findViewById(R.id.topPicksName);
        }
    }

}