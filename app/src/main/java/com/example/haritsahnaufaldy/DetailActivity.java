package com.example.haritsahnaufaldy;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView imageView = findViewById(R.id.imageview);
        TextView nameView = findViewById(R.id.name);
        TextView nimView = findViewById(R.id.nim);

        Intent intent = getIntent();
        if (intent != null) {
            String nama = intent.getStringExtra("nama");
            String nim = intent.getStringExtra("nim");
            int gambar = intent.getIntExtra("gambar", 0);

            imageView.setImageResource(gambar);
            nameView.setText(nama);
            nimView.setText(nim);
        }
    }
}
