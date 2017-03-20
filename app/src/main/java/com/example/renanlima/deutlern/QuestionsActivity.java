package com.example.renanlima.deutlern;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {
    final int ROWCOUNT = 5;
    final int COLUMNCOUNT = 4;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout_questions);
        gridLayout.setColumnCount(COLUMNCOUNT);
        gridLayout.setRowCount(ROWCOUNT);


        for (int i = 0;i < ROWCOUNT;i++){
            for (int j = 0;j < COLUMNCOUNT;j++){
                Button mButton = new Button(this);
                mButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                gridLayout.addView(mButton);
            }
        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }




}
