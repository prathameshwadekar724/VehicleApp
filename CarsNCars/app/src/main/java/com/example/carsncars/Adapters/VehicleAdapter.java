package com.example.carsncars.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.carsncars.Models.Vehicle;
import com.example.carsncars.R;

import java.util.List;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder> {
    private Context context;
    private List<Vehicle> vehicleList;
    private OnBuyClickListener onBuyClickListener;

    public VehicleAdapter(Context context, List<Vehicle> vehicleList, OnBuyClickListener listener) {
        this.context = context;
        this.vehicleList = vehicleList;
        this.onBuyClickListener = listener;
    }

    @NonNull
    @Override
    public VehicleAdapter.VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_item, parent, false);
        return new VehicleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleAdapter.VehicleViewHolder holder, int position) {
        Vehicle vehicle = vehicleList.get(position);

        holder.vehicleName.setText(vehicle.getName());
        holder.vehiclePrice.setText(vehicle.getPrice());

        Glide.with(context)
                .load(vehicle.getImageUrl())
                .into(holder.vehicleImage);

        holder.buyButton.setOnClickListener(v -> onBuyClickListener.onBuyClick(vehicle));
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }
    public class VehicleViewHolder extends RecyclerView.ViewHolder {
        TextView vehicleName, vehiclePrice;
        ImageView vehicleImage;
        Button buyButton;

        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            vehicleName = itemView.findViewById(R.id.vehicleName);
            vehiclePrice = itemView.findViewById(R.id.vehiclePrice);
            vehicleImage = itemView.findViewById(R.id.vehicleImage);
            buyButton = itemView.findViewById(R.id.buyButton);
        }
    }
    public interface OnBuyClickListener {
        void onBuyClick(Vehicle vehicle);
    }
}
