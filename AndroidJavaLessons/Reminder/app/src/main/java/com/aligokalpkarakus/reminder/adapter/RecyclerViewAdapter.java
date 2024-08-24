package com.aligokalpkarakus.reminder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aligokalpkarakus.reminder.R;
import com.aligokalpkarakus.reminder.model.ReminderItems;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<ReminderItems> reminderList;

    public RecyclerViewAdapter(List<ReminderItems> reminderList) {
        this.reminderList = reminderList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // ViewHolder'ın oluşturulması
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reminder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Verilerin ViewHolder'a bağlanması
        ReminderItems reminderItem = reminderList.get(position);
        holder.bind(reminderItem);
    }

    @Override
    public int getItemCount() {
        return reminderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // ViewHolder bileşenleri tanımlanacak
        private TextView noteTextView;
        private TextView dateTimeTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTextView = itemView.findViewById(R.id.noteTextView);
            dateTimeTextView = itemView.findViewById(R.id.dateTimeTextView);
        }

        public void bind(ReminderItems reminderItem) {
            // Verilerin bileşenlere atanması
            noteTextView.setText(reminderItem.getNote());
            dateTimeTextView.setText(reminderItem.getDateTime());
        }
    }
}
