package com.example.david.custonlistitemz;

import java.util.Date;

/**
 * Created by David on 10/3/2017.
 */

public class ToDoItem {
    String text;
    Date created;
    public ToDoItem(String text){
        this.text = text;
        this.created = new Date();
    }

    public Date getDateCreated(){
        return created;
    }
    public String getText(){
        return text;
    }
}
