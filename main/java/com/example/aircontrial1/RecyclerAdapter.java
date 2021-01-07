package com.example.aircontrial1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private ArrayList<Room> roomsList;

    public RecyclerAdapter(ArrayList<Room> roomsList){
        this.roomsList = roomsList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.room_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        String room = roomsList.get(position).getRooms();
        holder.roomName.setText(room);
    }

    @Override
    public int getItemCount() {
        return roomsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView roomName;
        private TextView desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roomName = itemView.findViewById(R.id.LargeTextView);
            desc = itemView.findViewById(R.id.smallTextView);

        }
    }
}
