package com.example.renanlima.deutlern;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {
    final int ROWCOUNT = 5;
    final int COLUMNCOUNT = 4;
    static String niveau;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extra = getIntent().getExtras();
        if(extra!=null){
            String niveau = extra.getString("niveau");

        }
        TextView txtNiveau = (TextView)findViewById(R.id.txtv_niveau);
        txtNiveau.setText(niveau);
        getSupportActionBar().setSubtitle("Wählen Sie ein Niveau");
        /*GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout_questions);
        gridLayout.setColumnCount(COLUMNCOUNT);
        gridLayout.setRowCount(ROWCOUNT);


        for (int i = 0;i < ROWCOUNT;i++){
            for (int j = 0;j < COLUMNCOUNT;j++){
                Button mButton = new Button(this);
                mButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                gridLayout.addView(mButton);
            }
        }*/


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


    public void callQuestions(View view) {
        Intent intentQuestionsActivity = new Intent(this,QuestionsActivity.class);
        startActivity(intentQuestionsActivity);

    }
}
