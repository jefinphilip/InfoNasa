package com.example.clement.rssreader;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        ReadRss readRss = new ReadRss(this,recyclerView);
        readRss.execute();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id) {


            case R.id.rss:

                Toast.makeText(this, "RSS FEED is selected", Toast.LENGTH_LONG).show();
                return true;


            case R.id.youtube:

                Toast.makeText(this, "upload manager is selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_settings:

                Toast.makeText(this, "Settings is selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Exit:

                Toast.makeText(this, "Thanku for the support see you again", Toast.LENGTH_LONG).show();
                Finish();
                return true;

        }


        return super.onOptionsItemSelected(item);
    }

    private void Finish() {
        finish();
    }
}
