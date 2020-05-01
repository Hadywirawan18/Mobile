package com.example.gofood;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {

private String namaMakanan;
private String detailMakanan;
private String hargaMakanan;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public static Creator<Makanan> getCREATOR() {
        return CREATOR;
    }

    private int photo;

    protected Makanan(Parcel in) {
        namaMakanan = in.readString();
        detailMakanan = in.readString();
        hargaMakanan = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    public Makanan() {

    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDetailMakanan() {
        return detailMakanan;
    }

    public void setDetailMakanan(String detailMakanan) {
        this.detailMakanan = detailMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaMakanan);
        dest.writeString(detailMakanan);
        dest.writeString(hargaMakanan);
        dest.writeInt(photo);
    }
}
