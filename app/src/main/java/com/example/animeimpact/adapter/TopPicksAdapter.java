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


import com.example.animeimpact.DataProvider;
import com.example.animeimpact.DetailsActivity;
import com.example.animeimpact.R;
import com.example.animeimpact.TopPicksDetailActivity;
import com.example.animeimpact.model.TopPicksItem;

import java.util.List;
//This adapter was inspired by https://www.youtube.com/watch?v=SLTUBf5FaCA&t=4489s
// Create the adapter extending from RecyclerView.Adapter
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
        // Inflate the layout
        View view = inflater.inflate(R.layout.row_toppicks,parent,false);
        //Return the layout
        return new TopPicksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPicksViewHolder holder, @SuppressLint("RecyclerView") int position) {
        
        //Link the information to the holder
        holder.myText1.setText(topPicksItemLists.get(position).getname());
        holder.myText2.setText(topPicksItemLists.get(position).getdescription());
        holder.myImage.setImageResource(topPicksItemLists.get(position).getImage());
        //Get the specific item based on its position
        TopPicksItem item = topPicksItemLists.get(position);
        //Create this onclicklistener method to make the item in the list clickable
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Direct to detail activity once it is being clicked
                Intent i = new Intent(context, DetailsActivity.class);
                //Passed in the specific position
                i.putExtra("id",item);
                context.startActivity(i);
                //Increase the count once it is being clicked
                DataProvider.increaseView(item);
            }
        });
    }
    public void setItems(List<TopPicksItem> items) {
        this.topPicksItemLists = items;
    }
    @Override
    //Return the size of the total items
    public int getItemCount() {
        return topPicksItemLists.size();
    }
    //Create the view holder for each section
    public class TopPicksViewHolder extends RecyclerView.ViewHolder{

        TextView myText1, myText2;
        ImageView myImage;
        public TopPicksViewHolder(@NonNull View itemView) {
            super(itemView);
            // Stores the itemView into a variable that can be used to access the context.
            myImage = itemView.findViewById(R.id.topPicksImage);
            myText1 = itemView.findViewById(R.id.topPicksType);
            myText2 = itemView.findViewById(R.id.topPicksName);
        }
    }

}