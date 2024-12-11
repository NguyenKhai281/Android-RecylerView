package com.example.android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ImageView imageView = findViewById(R.id.img_01);
        TextView text_01 = findViewById(R.id.tv_01);
        TextView text_02 = findViewById(R.id.tv_02);
        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("ResId", R.drawable.img_avatar));
        text_01.setText(intent.getStringExtra("tenSV"));
        text_02.setText(intent.getStringExtra("maSV"));
    }
}