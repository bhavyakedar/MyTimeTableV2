package com.example.mytimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class College_Calendar extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college__calendar);
        webView = findViewById(R.id.calendar);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.daiict.ac.in/academics/academic-calendar-2019-20/");

    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
