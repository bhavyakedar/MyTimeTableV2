package com.example.mytimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Syllabus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        ListView subjects = findViewById(R.id.subjects);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("CT - All Lecture Slides + Lab PDFs + Project + Assignments + Overall Evaluation");
        arrayList.add("EL - Base Conversions and Associated Boolean algebra And Arithmetic, Logic Gates and their production from Transistors,Diodes and MOS, K-Maps, Idiotic out-of-syllabus MCQs");
        arrayList.add("SC - Syllabus between 2nd insem to endsem");
        arrayList.add("IT - Linked-List,Stacks,Queues,Trees,Hash-Tables,Heaps,Graphs,Asymptotic Notations,Searching and Sorting");
        arrayList.add("HM - Group Presentations");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        subjects.setAdapter(arrayAdapter);

    }
}
