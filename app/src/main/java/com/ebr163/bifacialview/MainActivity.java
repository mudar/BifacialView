package com.ebr163.bifacialview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.simple_screen) {
            startActivity(new Intent(this, SimpleActivity.class));
        } else {
            startActivity(new Intent(this, ViewPagerActivity.class));
        }
    }
}
