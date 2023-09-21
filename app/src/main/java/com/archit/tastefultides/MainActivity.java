package com.archit.tastefultides;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starters;
    CardView mainCourses;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starters = findViewById(R.id.card_view_starters);
        mainCourses = findViewById(R.id.card_view_maincourse);
        dessertsCard = findViewById(R.id.deserts_card_view);

        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainCoursesActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsIntent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessertsIntent);
            }
        });


        TextView emailTextView = findViewById(R.id.text_view_email);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO);
                sendEmailIntent.setData(Uri.parse("mailto:tastytides@architsaini.com"));
                startActivity(sendEmailIntent);
            }
        });

    }
}