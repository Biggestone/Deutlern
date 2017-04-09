package com.example.renanlima.deutlern;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {
    CardView anfaengerCard,fortgeschrittenerCard,experteCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.stoolbar);
        setSupportActionBar(toolbar);

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

        anfaengerCard = (CardView)findViewById(R.id.cardV_anfaenger);
        fortgeschrittenerCard = (CardView)findViewById(R.id.cardV_fortgescrittener);
        experteCard = (CardView)findViewById(R.id.cardV_experte);

        anfaengerCard.setOnClickListener(onClickListenerAnfaenger);
        fortgeschrittenerCard.setOnClickListener(onClickListenerFortgescrittener);
        experteCard.setOnClickListener(onClickListenerExperte);

    }

    View.OnClickListener onClickListenerAnfaenger = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),NumbersActivity.class);
            String niveau = "Anfänger";
            intent.putExtra("niveau",niveau);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickListenerFortgescrittener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),NumbersActivity.class);
            String niveau = "Forgescrittener";
            intent.putExtra("niveau",niveau);
            startActivity(intent);
        }
    };
    View.OnClickListener onClickListenerExperte = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),NumbersActivity.class);
            String niveau = "Experte";
            intent.putExtra("niveau",niveau);
            startActivity(intent);
        }
    };

}
