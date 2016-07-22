package com.example.clement.rssreader;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by CLemENt on 4/13/2016.
 */
public class NewsComplete extends AppCompatActivity{

    WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_complete1);
        webView= (WebView) findViewById(R.id.webview);

    }
}
