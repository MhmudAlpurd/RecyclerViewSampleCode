package com.example.sourcerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerActivity extends AppCompatActivity {

    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);

        recycler = findViewById(R.id.recycler);

        /*harjouri shodeh list ra az server ya hard be inja miresanam va badesh be adaptor montaghel mikonam*/
        List<String> names = new ArrayList<>();
        names.add("Poya");
        names.add("Mahmoud");
        names.add("Sadegh");
        names.add("Mohammad");
        names.add("Karim");
        names.add("Ali");
        names.add("Sara");
        names.add("Hasan");
        names.add("Mahdi");

        TestAdapter adapter = new TestAdapter(names);

        recycler.setAdapter(adapter);
//Vertical
        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));
        //Horzontal
       // recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.HORIZONTAL, false));
        //Grid
       // recycler.setLayoutManager(new GridLayoutManager(TestRecyclerActivity.this,3, RecyclerView.VERTICAL,false));
        //Straggered
      //  recycler.setLayoutManager(new StaggeredGridLayoutManager(TestRecyclerActivity.this,3,RecyclerView.VERTICAL,false));


    }
}
