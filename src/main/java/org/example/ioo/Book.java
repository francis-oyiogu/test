package org.example.ioo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Queue;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Book <T>{
    T id;
    String name;

//    List
    public void sellFIFo(Queue<Book<T>> b){

    }

    public void sellPQ(Queue<Book<T>> b){

    }
}
