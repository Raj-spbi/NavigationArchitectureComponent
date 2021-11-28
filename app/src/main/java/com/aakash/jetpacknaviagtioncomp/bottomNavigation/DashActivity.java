package com.aakash.jetpacknaviagtioncomp.bottomNavigation;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.aakash.jetpacknaviagtioncomp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    NavController navController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.fragmentContainerView);

        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(R.id.firstDestination, R.id.secondDestination, R.id.thirdDestination).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            Log.e("asdfghjkl", "onCreate: " + destination.getLabel());
        });

    }
}