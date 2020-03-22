package com.example.mytimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ListView list = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Choose From Below");
        arrayList.add("Lecture and Time-Table");
        arrayList.add("Syllabus");
        arrayList.add("Faculty Info");
        arrayList.add("College Calender");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1) {
                    Intent intent = new Intent(MainMenu.this,MainActivity.class);
                    startActivity(intent);
                }
                if(position==2) {
                    Intent intent = new Intent(MainMenu.this,Syllabus.class);
                    startActivity(intent);
                }
                if(position==3) {
                    Intent intent = new Intent(MainMenu.this,Faculty_Info.class);
                    startActivity(intent);
                }
                if(position==4) {
                    Intent intent = new Intent(MainMenu.this,College_Calendar.class);
                    startActivity(intent);
                }
                }

        });
    }
}
