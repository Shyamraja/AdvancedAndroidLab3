package com.example.lab31;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.Menu;
import android.graphics.Color;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout layout = findViewById(R.id.layout);
        TextView text = findViewById(R.id.hello);
        switch (item.getItemId()) {
            case R.id.red:

                layout.setBackgroundColor(Color.RED);
                text.setTextColor(Color.GREEN);
                text.setText("GREEN");
                return true;
            case R.id.green:

                layout.setBackgroundColor(Color.GREEN);
                text.setTextColor(Color.BLUE);
                text.setText("BLUE");
                return true;


            case R.id.blue:

                layout.setBackgroundColor(Color.BLUE);
                text.setTextColor(Color.YELLOW);
                text.setText("YELLOW");
                return true;

            case R.id.yellow:
                layout.setBackgroundColor(Color.YELLOW);
                text.setTextColor(Color.RED);
                text.setText("RED");
                return true;
            default:
                return super.onOptionsItemSelected(item);
         }
       }

    }



