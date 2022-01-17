package com.example.hw2car;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarViewerHolder> {

    private List<Car> Cars;
    public CarAdapter(List<Car> cars)
    {
        this.Cars = cars;
    }

    public void AddContact(Car car)
    {
        Cars.add(car);
        notifyDataSetChanged();
        DataPersistencyHelper.StoreData(Cars);
    }

    public void DeleteContact(int position)
    {
        Cars.remove(position);
        notifyDataSetChanged();
        DataPersistencyHelper.StoreData(Cars);
    }
    @NonNull
    @Override
    public CarViewerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.contact,parent,false);
        CarViewerHolder vh = new CarViewerHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewerHolder holder, int position) {
        Car car = Cars.get(position);

        holder.avatar.setImageResource(car.getImage());
        holder.name.setText(car.getName());
        holder.email.setText(car.getEmail());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),MainActivity2.class);
                i.putExtra("car",car);
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) v.getContext(),
                                holder.avatar,
                                "avatarTrasnition"
                        );
                v.getContext().startActivity(i,options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return Cars.size();
    }
}
