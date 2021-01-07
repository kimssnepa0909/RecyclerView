package com.example.aircontrial1;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.background1);
    }
}
