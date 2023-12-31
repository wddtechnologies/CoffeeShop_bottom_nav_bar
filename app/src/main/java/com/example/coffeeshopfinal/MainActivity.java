package com.example.coffeeshopfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                // Handle the selection for the "home" item.
               return true; // Return true to indicate the item is selected.
            } else if (item.getItemId() == R.id.order) {
                startActivity(new Intent(getApplicationContext(), OrderActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true; // Return true to indicate the item is selected.
            } else if (item.getItemId() == R.id.share){
                startActivity(new Intent(getApplicationContext(), ShareActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true; // Return true to indicate the item is selected.
            }else{
                return false; // Return false if the item is not recognized.
            }
        });



    }
}
