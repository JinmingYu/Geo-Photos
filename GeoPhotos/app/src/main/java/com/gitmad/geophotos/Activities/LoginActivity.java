package com.gitmad.geophotos.Activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gitmad.geophotos.Fragments.LoginFragment;
import com.gitmad.geophotos.Models.User;
import com.gitmad.geophotos.R;


public class LoginActivity extends ActionBarActivity implements LoginFragment.LoginListener {

    private Button loginButton;
    private EditText emailEditText;
    private EditText userNameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    @Override
    public void loginSuccessful(User user) {
        Intent intent = new Intent(this, HomeScreen.class);
        intent.putExtra(HomeScreen.KEY_USER_DATA, user);
        startActivity(intent);
    }

    @Override
    public void loginFailed(LoginFragment.LoginFailureReason reason) {

    }
}