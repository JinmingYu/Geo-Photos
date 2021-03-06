package com.gitmad.geophotos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class HomeScreen extends ActionBarActivity {

    private String userName;
    private String emailAddress;
    private String password;
    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen_layout);

        Bundle bundle = getIntent().getExtras();
        //TODO: Grab the username from the extras, set the username string appropriately.
        //Stuck? See here: http://stackoverflow.com/questions/4233873/how-to-get-extra-data-from-intent-in-android

        if(bundle.containsKey("userName")){
            userName = bundle.getString("userName");
        }
        if(bundle.containsKey("emailAddress")){
            emailAddress = bundle.getString("emailAddress");
        }
        if(bundle.containsKey("password")){
            password = bundle.getString("password");
        }

        welcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        welcomeTextView.setText("Welcome, "+ userName);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
