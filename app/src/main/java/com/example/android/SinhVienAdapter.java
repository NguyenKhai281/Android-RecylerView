package com.example.android;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.SvViewHolder> {
    private Context mContext;
    private List<SinhVien> mListSinhVien;

    public SinhVienAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<SinhVien> list){
        this.mListSinhVien = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sinhvien, parent, false);
        return new SvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SvViewHolder holder, int position) {
        SinhVien SV = mListSinhVien.get(position);
        if (SV == null) {
            return;
        }

        holder.imgSV.setImageResource(SV.getResourceId());
        holder.tenSV.setText(SV.getTenSV());
        holder.maSV.setText(SV.getMaSV());

        // Thêm sự kiện click vào item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khởi tạo Intent để chuyển hướng sang MainActivity3
                Intent intent = new Intent(mContext, MainActivity3.class);

                // Có thể truyền dữ liệu kèm theo Intent nếu cần
                intent.putExtra("maSV", SV.getMaSV());
                intent.putExtra("tenSV", SV.getTenSV());
                intent.putExtra("ResId", SV.getResourceId());
                // Bắt đầu activity mới
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListSinhVien != null) {
            return mListSinhVien.size();
        }
        return 0;
    }

    public class SvViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgSV;
        private TextView tenSV;
        private TextView maSV;

        public SvViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSV = itemView.findViewById(R.id.img_sv);
            tenSV = itemView.findViewById(R.id.ten_sv);
            maSV = itemView.findViewById(R.id.ma_sv);
        }
    }
}