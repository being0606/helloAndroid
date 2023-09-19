package com.example.sampleframelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView9;
    ImageView imageView10;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
    }

    public void onButtonClicked(View v) {
        changeImage();
    }

    public void changeImage() {
        if (imageIndex == 0) {
            imageView9.setVisibility(View.VISIBLE);
            imageView10.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        } else {
            imageView9.setVisibility(View.INVISIBLE);
            imageView10.setVisibility(View.VISIBLE);
            imageIndex = 0;
        }
    }
}