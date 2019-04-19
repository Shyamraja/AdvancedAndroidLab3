package com.example.lab22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
  ArrayList<String> countries;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //setContentView(R.layout.activity_main);
    countries = new ArrayList<>();
    countries.add("Afghanistan");
    countries.add("Albania");
    countries.add("Algeria");
    countries.add("America Samoa");
    countries.add("Andorra");
    countries.add("Angola");
    countries.add("Anguilla");
    countries.add("Antarctica");


    LinearLayout mainView = new LinearLayout(this);
    mainView.setOrientation(LinearLayout.VERTICAL);
    setContentView(mainView);

    LinearLayout buttons = new LinearLayout(this);
    buttons.setOrientation(LinearLayout.HORIZONTAL);
    Button add = new Button(this);
    add.setText("ADD");


    Button edit = new Button(this);
    edit.setText("EDIT");

    Button remove = new Button(this);
    remove.setText("REMOVE");


    buttons.addView(add);
    buttons.addView(edit);
    buttons.addView(remove);

    mainView.addView(buttons);


    final EditText edittxt = new EditText(this);
    edittxt.setText("");
    mainView.addView(edittxt);

    ListView countries_v = new ListView(this);
    mainView.addView(countries_v);

    final ArrayAdapter<String> arraycountries = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
    countries_v.setAdapter(arraycountries);

    add.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        arraycountries.add(edittxt.getText().toString());
      }
    });
  }
}