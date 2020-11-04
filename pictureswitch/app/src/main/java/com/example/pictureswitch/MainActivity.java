package com.example.pictureswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.如花);
        imageView.setOnClickListener(image);


    }
    private View.OnClickListener image = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView imageView2 = (ImageView)findViewById(R.id.如花);
            imageView2.setImageResource(R.mipmap.image70);


        }
    };
}