package com.example.carsncars.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.carsncars.Models.Vehicle;
import com.example.carsncars.R;

public class VehicleDetailsActivity extends AppCompatActivity {

    private TextView vehicleName, vehicleType, vehicleYear, vehiclePrice;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_details);
        vehicleName = findViewById(R.id.vehicleName);
        vehicleType = findViewById(R.id.vehicleType);
        vehicleYear = findViewById(R.id.vehicleYear);
        vehiclePrice = findViewById(R.id.vehiclePrice);
        imageView = findViewById(R.id.vehicleImage);

        Vehicle vehicle = (Vehicle) getIntent().getSerializableExtra("vehicle");

        if (vehicle != null) {

            vehicleName.setText(vehicle.getName());
            vehicleType.setText(vehicle.getType());
            vehicleYear.setText(vehicle.getYear());
            vehiclePrice.setText(vehicle.getPrice());
            Glide.with(this)
                    .load(vehicle.getImageUrl())
                    .into(imageView);
        }
    }
}