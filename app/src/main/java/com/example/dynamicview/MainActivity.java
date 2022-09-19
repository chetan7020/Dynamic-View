package com.example.dynamicview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);

        for (int i = 0; i < 5; i++) {
            addView();
        }
    }

    private void addView() {
        View view = getLayoutInflater().inflate(R.layout.dynamic_view, null, false);

        linearLayout.addView(view);
    }
}