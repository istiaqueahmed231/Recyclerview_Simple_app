package com.example.cardviewmine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Pattern> patterns;

    public CustomAdapter(List<Pattern> patterns) {
        this.patterns = patterns;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_unit,parent,false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Pattern pattern=patterns.get(position);
        holder.textView.setText(pattern.getPatternName());
        holder.imageView.setImageResource(pattern.getPatternImg());
    }

    @Override
    public int getItemCount() {
        return patterns.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.pattern_name);
            imageView=itemView.findViewById(R.id.pattern_img);
        }
    }
}
