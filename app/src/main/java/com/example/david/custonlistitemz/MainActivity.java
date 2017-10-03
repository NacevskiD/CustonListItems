package com.example.david.custonlistitemz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNewButton = (Button) findViewById(R.id.new_todo_item_button);
        final EditText newToDoEditText = (EditText) findViewById(R.id.new_todo_item_edittext);

        ListView todoListView = (ListView) findViewById(R.id.todo_listview);

        final ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this,R.layout.todo_list_item);

        todoListView.setAdapter(toDoListAdapter);

        addNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newItemText = newToDoEditText.getText().toString();

                if(newItemText.length() == 0){
                    Toast.makeText(MainActivity.this,"Enter a todo item",Toast.LENGTH_SHORT).show();
                    return;
                }

                ToDoItem newItem = new ToDoItem(newItemText);
                toDoListAdapter.add(newItem);

                toDoListAdapter.notifyDataSetChanged();
                newToDoEditText.getText().clear();
            }
        });
    }
}
