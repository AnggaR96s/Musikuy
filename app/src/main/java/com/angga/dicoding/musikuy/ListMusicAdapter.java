package com.angga.dicoding.musikuy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMusicAdapter extends RecyclerView.Adapter<ListMusicAdapter.ListViewHolder>{
    private ArrayList<Music> listMusic;
    private OnItemClickCallback onItemClickCallback;


    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    ListMusicAdapter(ArrayList<Music> list) {
        this.listMusic = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_music, viewGroup, false);
        return new ListViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Music music = listMusic.get(position);
        Glide.with(holder.itemView.getContext())
                .load(music.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(music.getName());
        holder.tvDetail.setText(music.getDetail());

        final Context context = holder.itemView.getContext();
        Glide.with(holder.itemView.getContext())
                .load(music.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(music.getName());
        holder.tvDetail.setText(music.getDetail());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickCallback.onItemClicked(listMusic.get(holder.getAdapterPosition()));


                }
            });
        }


    @Override
    public int getItemCount() {
        return listMusic.size();
    }
    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }


    }

    public interface OnItemClickCallback {
        void onItemClicked(Music data);
    }
}