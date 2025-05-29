package com.example.cardviewmine;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Pattern> pattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.black)); // Status bar
            window.setNavigationBarColor(ContextCompat.getColor(this, R.color.black)); // Navigation bar
        }

        recyclerView = findViewById(R.id.rview);
        pattern = new ArrayList<>();
        Pattern p1 = new Pattern("Blue Abstract", R.drawable.blue_abstract);
        Pattern p2 = new Pattern("Blue Green natural", R.drawable.blue_green_natural);
        Pattern p3 = new Pattern("Blue White natural", R.drawable.blue_white_natural);
        Pattern p4 = new Pattern("Green Orange Illustrated", R.drawable.green_orange_illustrated_flowers);
        Pattern p5 = new Pattern("Minimal Patterns", R.drawable.minimal_patterns);
        Pattern p6 = new Pattern("Purple Illustrative", R.drawable.purple_illustrative);
        Pattern p7 = new Pattern("White Pink Yellow", R.drawable.white_pink_yellow);

        pattern.add(p1);
        pattern.add(p2);
        pattern.add(p3);
        pattern.add(p4);
        pattern.add(p5);
        pattern.add(p6);
        pattern.add(p7);


        CustomAdapter customAdapter = new CustomAdapter(pattern);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);


    }
}