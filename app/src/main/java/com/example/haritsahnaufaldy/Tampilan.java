package com.example.haritsahnaufaldy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class   Tampilan extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView,nimView;

    public Tampilan(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        nimView = itemView.findViewById(R.id.nim);
    }
}