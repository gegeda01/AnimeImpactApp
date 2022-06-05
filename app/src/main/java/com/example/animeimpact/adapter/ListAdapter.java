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
import com.example.animeimpact.model.TopPicksItem;

import java.util.List;
//This adapter was inspired by https://www.youtube.com/watch?v=SLTUBf5FaCA&t=4489s
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    List<TopPicksItem> listItemLists;
    Context context;
    public ListAdapter(Context ct, List<TopPicksItem> listItemLists) {
        context = ct;
        this.listItemLists = listItemLists;
    }

    //Create the view holder for the ListView
    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the layout
        View view = inflater.inflate(R.layout.row_lists,parent,false);
        //Return the layout
        return new ListAdapter.ListViewHolder(view);
    }

    //Getting the information that is displayed onto each of the Cardview
    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, @SuppressLint("RecyclerView") int position) {


        //Get the specific item based on its position
        TopPicksItem item = listItemLists.get(position);
        //Link the information to the holder

        holder.name.setText(listItemLists.get(position).getdescription());
        holder.volume.setText(listItemLists.get(position).getname());
        holder.price.setText(String.valueOf(listItemLists.get(position).getPrice()));
        holder.image.setImageResource(listItemLists.get(position).getImage());



        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("id",  item);
               // i.putExtra("volume", listItemLists.get(position).getVolume())
                context.startActivity(i);
                DataProvider.increaseView(item);

            }
        });
    }


        //Allows for the Cardview to be clickable, and sends information to DetailActivity so it knows which
        //item it needs to go into
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("id",  item);
                context.startActivity(i);
                //Increase the count once it is being clicked
                DataProvider.increaseView(item);
            }
        });
    }
    //Return the size of the total items
    @Override
    public int getItemCount() {
        return listItemLists.size();
    }


    //Getting the IDs from the relevant layouts
    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView name,volume,price;
        ImageView image;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            // Stores the itemView into a variable that can be used to access the context.
            name = itemView.findViewById(R.id.list_name);
            volume = itemView.findViewById(R.id.list_type);
            price = itemView.findViewById(R.id.list_price);
            image = itemView.findViewById(R.id.list_image);


        }
    }

}
