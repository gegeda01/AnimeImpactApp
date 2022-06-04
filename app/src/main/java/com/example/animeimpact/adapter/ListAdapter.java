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

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
import com.example.animeimpact.DataProvider;
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
import com.example.animeimpact.DetailsActivity;
import com.example.animeimpact.R;
import com.example.animeimpact.model.TopPicksItem;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    List<TopPicksItem> listItemLists;
    Context context;
    public ListAdapter(Context ct, List<TopPicksItem> listItemLists) {
        context = ct;
        this.listItemLists = listItemLists;
    }

    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_lists,parent,false);
        return new ListAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, @SuppressLint("RecyclerView") int position) {
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
        TopPicksItem item = listItemLists.get(position);
        holder.name.setText(listItemLists.get(position).getdescription());
        holder.volume.setText(listItemLists.get(position).getname());
        holder.price.setText(String.valueOf(listItemLists.get(position).getPrice()));
        holder.image.setImageResource(listItemLists.get(position).getImage());
=======
>>>>>>> Stashed changes
        holder.name.setText(listItemLists.get(position).getTitle());
        holder.volume.setText(listItemLists.get(position).getVolume());
        holder.price.setText(String.valueOf(listItemLists.get(position).getPrice()));
        holder.image.setImageResource(listItemLists.get(position).getImageurl());
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
                i.putExtra("id",  item);
               // i.putExtra("volume", listItemLists.get(position).getVolume())
                context.startActivity(i);
                DataProvider.increaseView(item);
=======
>>>>>>> Stashed changes
                i.putExtra("name", listItemLists.get(position).getTitle());
                i.putExtra("volume", listItemLists.get(position).getVolume());

                context.startActivity(i);
<<<<<<< Updated upstream
=======
>>>>>>> f40f470850d33e3d2975db3318ac11486b923f86
>>>>>>> Stashed changes
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItemLists.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView name,volume,price;
        ImageView image;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.list_name);
            volume = itemView.findViewById(R.id.list_type);
            price = itemView.findViewById(R.id.list_price);
            image = itemView.findViewById(R.id.list_image);


        }
    }

}
