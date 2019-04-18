package com.example.shyamlab32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {
 Button button, button2, button3;
  EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);

          button = (Button) findViewById(R.id.button);
          button2 = (Button) findViewById(R.id.button2);
          button3 = (Button) findViewById(R.id.button3);
          editText = (EditText) findViewById(R.id.editText);


          button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("OPEN MAP", "onClick: OPEN MAP");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
            // Or map point based on latitude/longitude
            // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
                     }
                 });

            button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                      Log.d("CALL", "onClick: MAKE A CALL");
                      Uri number = Uri.parse("tel:4567123");
                      Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                      startActivity(callIntent);
                          }
                        });

           button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String text = editText.getText().toString();
                    Log.d("text", "onClick: Go " + text);
                    Uri webpage = Uri.parse(text);
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    startActivity(webIntent);
                 }
             });
    }
}
