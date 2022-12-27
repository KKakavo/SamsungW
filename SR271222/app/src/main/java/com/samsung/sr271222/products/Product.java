package com.samsung.sr271222.products;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Objects;

public class Product implements Parcelable {
    private final String name, date;
    private final int count, cost;


    public Product(String name, String date, int count, int cost) {
        this.name = name;
        this.date = date;
        this.count = count;
        this.cost = cost;
    }

    protected Product(Parcel in) {
        name = in.readString();
        date = in.readString();
        count = in.readInt();
        cost = in.readInt();
    }
    public static int findByName(List<Product> products, String name){
        for (int i = 0; i < products.size(); i++) {
            if (Objects.equals(products.get(i).getName(), name))
                return i;
        }
        return -1;
    }
    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название: ").append(this.name).append("\n")
                .append("Дата поступления: ").append(this.date).append("\n")
                .append("Количество: ").append(this.count).append("\n")
                .append("Стоимость: ").append(this.cost).append("\n");
        return sb.toString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getCount() {
        return count;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(date);
        parcel.writeInt(count);
        parcel.writeInt(cost);
    }
}
