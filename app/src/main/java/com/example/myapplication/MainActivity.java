package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        Toast.makeText(this, "上传gitbut", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "gitbut", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "上传gitbut", Toast.LENGTH_SHORT).show();
    }

}
