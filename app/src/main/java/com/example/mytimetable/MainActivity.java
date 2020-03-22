package com.example.mytimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(MainActivity.this, monday.class);
                    startActivity(intent);
                }
                if(position == 1) {
                    Intent intent = new Intent(MainActivity.this, tuesday.class);
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(MainActivity.this, wednesday.class);
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(MainActivity.this, thursday.class);
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(MainActivity.this, friday.class);
                    startActivity(intent);
                }
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
