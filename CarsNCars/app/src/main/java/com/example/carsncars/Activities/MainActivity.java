package com.example.carsncars.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.carsncars.Adapters.VehicleAdapter;
import com.example.carsncars.Models.Vehicle;
import com.example.carsncars.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private VehicleAdapter vehicleAdapter;
    private List<Vehicle> vehicleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Toyota Corolla", "Sedan", "2020", "$20,000", "https://tse4.mm.bing.net/th?id=OIP.XIaPOxTgNMOLOXUP1xGwuwHaE8&pid=Api&P=0&h=180"));
        vehicleList.add(new Vehicle("Honda Civic", "Sedan", "2019", "$18,500", "https://tse3.mm.bing.net/th?id=OIP.XzvTR1Mc7I9Fweg70niAXgHaEK&pid=Api&P=0&h=180"));
        vehicleList.add(new Vehicle("Ford Mustang", "Coupe", "2021", "$40,000", "https://tse3.mm.bing.net/th?id=OIP.OT_pMueBFpq69O2WmxoK5wHaE8&pid=Api&P=0&h=180"));

        vehicleAdapter = new VehicleAdapter(this, vehicleList, vehicle -> {
            Intent intent = new Intent(MainActivity.this, VehicleDetailsActivity.class);
            intent.putExtra("vehicle", vehicle);
            startActivity(intent);
        });

        recyclerView.setAdapter(vehicleAdapter);
    }

}