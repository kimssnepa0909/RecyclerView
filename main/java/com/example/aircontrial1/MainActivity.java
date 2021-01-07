package com.example.aircontrial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myImageView = (ImageView) findViewById(R.id.imageView3);
        myImageView.setImageResource(R.drawable.layout6);
    }

    public void showSecondActivity(View view){
        //String button_text;
        //button_text = ((Button) view).getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

    }
}