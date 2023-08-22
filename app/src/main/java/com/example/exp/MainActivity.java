package com.example.exp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNeedWorkPage(View view) {
        Intent intent = new Intent(this, NeedWorkActivity.class);
        startActivity(intent);
    }

    public void openGiveWorkPage(View view) {
        Intent intent = new Intent(this, GiveWorkActivity.class);
        startActivity(intent);
    }
}
