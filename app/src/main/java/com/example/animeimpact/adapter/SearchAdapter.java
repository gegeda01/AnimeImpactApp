package com.example.animeimpact.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animeimpact.DataProvider;
import com.example.animeimpact.DetailsActivity;
import com.example.animeimpact.R;
import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> implements Filterable {
    List<TopPicksItem> searchItemLists;
    List<TopPicksItem> searchItemListFull;
    Context context;

    //Arrays that is needed for storing the information to List them in Search. First array is for
    //original items, second array (Full) is for Filtering method, which allows the array to change
    //base on the inputs, and also not changing the original information
    public SearchAdapter(Context ct, List<TopPicksItem> searchItemLists) {
        context = ct;
        this.searchItemLists = searchItemLists;
        searchItemListFull = new ArrayList<>(searchItemLists);
    }

    //Viewholder for the Search Activity
    @NonNull
    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.search_lists, parent, false);
        return new SearchAdapter.SearchViewHolder(view);
    }

    //Getting the information that is displayed onto each of the Cardview
    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.SearchViewHolder holder, @SuppressLint("RecyclerView") int position) {
        TopPicksItem item = searchItemLists.get(position);
        holder.name.setText(searchItemLists.get(position).getdescription());
        holder.volume.setText(searchItemLists.get(position).getname());
        holder.price.setText(String.valueOf(searchItemLists.get(position).getPrice()));
        holder.image.setImageResource(searchItemLists.get(position).getImage());

        //Allows the Cardview to be clickable, and goes to Details Activity
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("id", item);
                context.startActivity(i);
                DataProvider.increaseView(item);
            }
        });
    }

    public int getItemCount() {
        return searchItemLists.size();
    }


    //Getting the IDs from the relevant layouts
    public class SearchViewHolder extends RecyclerView.ViewHolder {
        TextView name,volume,price;
        ImageView image;
        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.search_name);
            volume = itemView.findViewById(R.id.search_type);
            price = itemView.findViewById(R.id.search_price);
            image = itemView.findViewById(R.id.search_image);
        }
    }

    //Filtering method for getting the inputs from the keyboard.
    //Uses entire List of items, duplicates the Array to make new changes that does not affect the
    //old array.
    @Override
    public Filter getFilter() {
        return searchFilter;
    }

    private Filter searchFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<TopPicksItem> filteredList = new ArrayList<>();

            if(constraint == null || constraint.length() == 0) {
                filteredList.addAll(searchItemListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (TopPicksItem item : searchItemListFull) {
                    if (item.getname().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                    else if(item.getType().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                    else if(item.getdescription().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }


        //Returning the final changes to the array, and sets the array to hold those specific items
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            searchItemLists.clear();
            searchItemLists.addAll((List)results.values);
            notifyDataSetChanged();
        }
    };
}
