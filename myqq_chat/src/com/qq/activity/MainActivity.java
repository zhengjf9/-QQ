package com.qq.activity;

import android.support.v7.app.ActionBarActivity;
import android.R.integer;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private Button loginBt;
    private Button  registerBt;
    private EditText qqNo,qqPsw;
    private ProgressDialog pDialog;
    JSONParser jsonParser = new JSONParser();
    private String jsonData;
    private String message;
    private integer success;
    public static String user_name;
    public static String BaseURL = "http://localhost/myqq/";
    
    private static String url_register = BaseURL + "register.php";
    private static String url_login = BaseURL + "login.php";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qqlogin);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
