package com.route.routecourses;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int numberOfLayout = intent.getIntExtra("numberOfLayout", 0);
        if (numberOfLayout == 1) {
            setContentView(R.layout.activity_android_course);
        } else if (numberOfLayout == 2) {
            setContentView(R.layout.activity_ios_course);
        } else if (numberOfLayout == 3) {
            setContentView(R.layout.activity_fullstack_course);
        }

    }
}
