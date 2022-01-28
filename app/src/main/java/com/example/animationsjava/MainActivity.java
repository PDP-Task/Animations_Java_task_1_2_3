package com.example.animationsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_main);
        Button btnBounce = findViewById(R.id.btn_bounce);
        Button btnSequential = findViewById(R.id.btn_sequential);
        Button btnTogether = findViewById(R.id.btn_together);

        Animation bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        Animation sequential = AnimationUtils.loadAnimation(this, R.anim.squential);
        Animation together = AnimationUtils.loadAnimation(this, R.anim.togather);

        btnBounce.setOnClickListener(view -> {
            imageView.startAnimation(bounce);
        });
        btnSequential.setOnClickListener(view -> {
            imageView.startAnimation(sequential);
        });
        btnTogether.setOnClickListener(view -> {
            imageView.startAnimation(together);
        });
    }
}