package com.example.david.custonlistitemz;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by David on 10/3/2017.
 */

public class ToDoListAdapter extends ArrayAdapter<ToDoItem> {
    Context context;

    public ToDoListAdapter(Context context,int resource){
        super(context,resource);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View rowView =  convertView;
        if (rowView == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.todo_list_item,parent,false);
        }

        ToDoItem item = getItem(position);
        TextView todoText = (TextView) rowView.findViewById(R.id.todo_item_text);
        TextView todoDate = (TextView) rowView.findViewById(R.id.todo_item_created_date);

        todoText.setText(item.getText());
        todoDate.setText(item.getDateCreated().toString());

        return rowView;
    }
}
