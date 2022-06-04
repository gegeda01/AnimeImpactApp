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

import com.example.animeimpact.DetailsActivity;
import com.example.animeimpact.R;


import com.example.animeimpact.model.TopPicksItem;

import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> implements Filterable {
    private List<TopPicksItem> searchItemLists;
    private List<TopPicksItem> searchItemListFull;
    Context context;


    public SearchAdapter(Context ct, List<TopPicksItem> searchItemLists) {


public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> implements Filterable {
    private List<SearchItem> searchItemLists;
    private List<SearchItem> searchItemListFull;
    Context context;


    public SearchAdapter(Context ct, List<SearchItem> searchItemLists) {
        context = ct;
        this.searchItemLists = searchItemLists;
        searchItemListFull = new ArrayList<>(searchItemLists);
    }

    @NonNull
    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.search_lists, parent, false);
        return new SearchAdapter.SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.SearchViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.name.setText(searchItemLists.get(position).getname());
        holder.volume.setText(searchItemLists.get(position).getdescription());
        holder.price.setText(String.valueOf(searchItemLists.get(position).getPrice()));
        holder.image.setImageResource(searchItemLists.get(position).getImage());


        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("id", searchItemLists.get(position));

                context.startActivity(i);
            }
        });
    }

    public int getItemCount() {
        return searchItemLists.size();
    }


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

    @Override
    public Filter getFilter() {
        return searchFilter;
    }

    private Filter searchFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<TopPicksItem> filteredList = new ArrayList<>();

            List<TopPicksItem> filteredList = new ArrayList<>();



            if(constraint == null || constraint.length() == 0) {
                filteredList.addAll(searchItemListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();


                for (TopPicksItem item : searchItemListFull) {
                    if (item.getname().toLowerCase().contains(filterPattern)) {


                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            searchItemLists.clear();
            searchItemLists.addAll((List)results.values);
            notifyDataSetChanged();
        }
    };
}
