package com.example.aircontrial1;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends Activity {

    private ArrayList<Room> roomsList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactvity);

        recyclerView = findViewById(R.id.recyclerView);
        roomsList = new ArrayList<>();

        setRoomInfo();
        setAdapter();
    }

    private void setRoomInfo(){
        roomsList.add(new Room("BE 211"));
        roomsList.add(new Room("BE 213"));
        roomsList.add(new Room("BE 214"));
        roomsList.add(new Room("BE 215"));
        roomsList.add(new Room("BE 216"));
        roomsList.add(new Room("BE 217"));
    }

    private void setAdapter(){
        RecyclerAdapter adapter = new RecyclerAdapter(roomsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
