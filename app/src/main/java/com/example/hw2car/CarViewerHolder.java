package com.example.hw2car;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewerHolder extends RecyclerView.ViewHolder {

    public CardView card;
    public ImageView avatar;
    public TextView name;
    public TextView email;

    public CarViewerHolder(@NonNull View itemView) {
        super(itemView);

        card = itemView.findViewById(R.id.card);
        avatar = itemView.findViewById(R.id.avater);
        name = itemView.findViewById(R.id.name);
        email = itemView.findViewById(R.id.email);

    }
}
