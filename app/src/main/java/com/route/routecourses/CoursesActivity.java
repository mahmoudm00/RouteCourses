package com.route.routecourses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoursesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.SplashTheme);
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_RouteCourses);
        setContentView(R.layout.activity_courses);

    }

    public void onCoursesClick(View view) {
        Button btn = ((Button) view);
        if (view.getId() == R.id.btn_android) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("numberOfLayout",1);
            startActivity(intent);
        } else if (view.getId() == R.id.btn_ios) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("numberOfLayout",2);
            startActivity(intent);
        } else if (view.getId() == R.id.btn_fullstack) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("numberOfLayout",3);
            startActivity(intent);
        }
    }

}