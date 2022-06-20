package com.example.recycleviewusingcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    myAdapter adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            ArrayList<Model> contents = new ArrayList<>();

            Model obj1 =  new Model();
            obj1.setHeader("Android Development");
            obj1.setDesc("Used to create android application");
            obj1.setImg(R.drawable.android);
            contents.add(obj1);

            Model obj2 = new Model();
            obj2.setHeader("Python");
            obj2.setDesc("Used on a server to create web applications.");
            obj2.setImg(R.drawable.python);
            contents.add(obj2);

            Model obj3 = new Model();
            obj3.setHeader("ReactJs");
            obj3.setDesc("Used on a server to create web applications.");
            obj3.setImg(R.drawable.react);
            contents.add(obj3);

            Model obj4 = new Model();
            obj4.setHeader("NodeJs");
            obj4.setDesc("Used on a server to create web applications.");
            obj4.setImg(R.drawable.node);
            contents.add(obj4);

            Model obj5 = new Model();
            obj5.setHeader("UI/UX");
            obj5.setDesc("Designing.");
            obj5.setImg(R.drawable.ux);
            contents.add(obj5);

            Model obj6 = new Model();
            obj6.setHeader("Python");
            obj6.setDesc("Used on a server to create web applications.");
            obj6.setImg(R.drawable.python);
            contents.add(obj6);

        Model obj7 = new Model();
        obj7.setHeader("NodeJs");
        obj7.setDesc("Used on a server to create web applications.");
        obj7.setImg(R.drawable.node);
        contents.add(obj7);

        Model obj8 = new Model();
        obj8.setHeader("ReactJs");
        obj8.setDesc("Used on a server to create web applications.");
        obj8.setImg(R.drawable.react);
        contents.add(obj8);



        recyclerView = findViewById(R.id.recylerview);

        adapter = new myAdapter(contents); //myAAdapter class maa jani bho ani uta arraylist ko code run huncha
        linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }




    }


