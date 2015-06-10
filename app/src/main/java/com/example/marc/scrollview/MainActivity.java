package com.example.marc.scrollview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Button;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends Activity implements OnClickListener {

    ImageView principal, a, b, c, d, e, f,g,h,i;
    int movil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (ImageView) findViewById(R.id.a);
        b = (ImageView) findViewById(R.id.b);
        c = (ImageView) findViewById(R.id.c);
        d = (ImageView) findViewById(R.id.d);
        e = (ImageView) findViewById(R.id.e);
        f = (ImageView) findViewById(R.id.g);
        f = (ImageView) findViewById(R.id.f);
        f = (ImageView) findViewById(R.id.f);
        f = (ImageView) findViewById(R.id.f);

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);}

    public void onClick(View v) {

       }


    }
