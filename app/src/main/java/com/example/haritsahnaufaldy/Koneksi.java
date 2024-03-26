package com.example.haritsahnaufaldy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Koneksi extends RecyclerView.Adapter<Tampilan> {


    Context context;
    List<Isi> items;

    public Koneksi(Context context, List<Isi> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Tampilan onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.isi_view, parent, false);
        return new Tampilan(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tampilan holder, int position) {
        Isi currentItem = items.get(position);
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", currentItem.getName());
                intent.putExtra("nim", currentItem.getNim());
                intent.putExtra("gambar", currentItem.getImage());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}