package com.example.android;

public class SinhVien {
    private int resourceId;
    private String maSV;
    private String tenSV;

    public SinhVien(int resourceId, String maSV, String tenSV) {
        this.resourceId = resourceId;
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
}
