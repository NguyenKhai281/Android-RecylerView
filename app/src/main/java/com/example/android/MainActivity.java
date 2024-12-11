package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcy;
    private SinhVienAdapter sinhVienAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcy = findViewById(R.id.rcv);
        sinhVienAdapter = new SinhVienAdapter(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcy.setLayoutManager(gridLayoutManager);
        sinhVienAdapter.setData(getListSinhVien());
        rcy.setAdapter(sinhVienAdapter);
        
    }

    private List<SinhVien> getListSinhVien() {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien(R.drawable.img_avatar,"20212815","Nguyen Van Hoan"));
        list.add(new SinhVien(R.drawable.anh2,"20212815","Nguyen van Hoan"));
        list.add(new SinhVien(R.drawable.img_avatar,"20212815","Nguyen van Hoan"));
        list.add(new SinhVien(R.drawable.anh2,"20212815","Bui Van Dat"));
        list.add(new SinhVien(R.drawable.img_avatar,"20212815","Bui Van Dat"));
        list.add(new SinhVien(R.drawable.anh2,"20212815","Bui Van Dat"));
        list.add(new SinhVien(R.drawable.img_avatar,"20212815","Bui Van Dat"));
        list.add(new SinhVien(R.drawable.anh2,"20212815","Bui Van Dat"));
        list.add(new SinhVien(R.drawable.img_avatar,"20212815","Nguyen Quang Khai"));
        list.add(new SinhVien(R.drawable.anh2,"20212815","Nguyen Quang Khai"));
        list.add(new SinhVien(R.drawable.img_avatar,"20212815","Nguyen Quang Khai"));
        list.add(new SinhVien(R.drawable.anh2,"20212815","Nguyen Quang Khai"));
        return list;
        
    }



}