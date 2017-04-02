package com.example.renanlima.deutlern;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private Button mButtonAnfanger;
    private ActionBar mActiobar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:

                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*mActiobar = getSupportActionBar();
        mActiobar.setDisplayShowCustomEnabled(true);
        mActiobar.setDisplayHomeAsUpEnabled(true);
        mActiobar.setHomeAsUpIndicator(R.drawable.ic_book_black_24dp);
        mActiobar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        mActiobar.setCustomView(getLayoutInflater().inflate(R.layout.title,null),new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER_HORIZONTAL
        ));
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
                ,ViewGroup.LayoutParams.MATCH_PARENT
                , Gravity.CENTER);

        TextView textView = (TextView)findViewById(R.id.textView_title);*/

        /*mButtonAnfanger = (Button) findViewById(R.id.button_anfaenger);*/
        /*BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);*/
    }

    public void callAnfaenger(View view) {

        Intent intent = new Intent(this,SelectionActivity.class);
        String niveau = "Anfänger";
        intent.putExtra("niveau",niveau);
        startActivity(intent);
    }

    public void callFortgeschrittener(View view) {
        String niveau = "Fortgeschrittener";
        Intent intent = new Intent(this,QuestionsActivity.class);
        intent.putExtra("niveau",niveau);
        startActivity(intent);
    }

    public void callExperte(View view) {
        String niveau = "Experte";
        Intent intent = new Intent(this,QuestionsActivity.class);
        intent.putExtra("niveau",niveau);
        startActivity(intent);
    }
}
