package com.eggdevs.demoapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   // Will be used to display restros in textview
   String res = "";

   Spinner spinner;
   Button button;
   TextView textView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      spinner = findViewById(R.id.spinner);
      button = findViewById(R.id.button);
      textView = findViewById(R.id.textView);

      button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            //Before setting up result, delete/clear previous result.
            res = "";

            // This variable is used to store the selected item in the spinner.
            String foodType = spinner.getSelectedItem().toString();

            // using if else to compare food types.
            if (foodType.equals("Mexican")) {
               res = res + "Dominos\n" + "Pablo Escobar\n" + "Netflix";
            }
            else if (foodType.equals("Italian")) {
               res = res + "Alvi\n" + "Rome Palace\n" + "Rome Oberai\n" + "Julius Caesar Foods";
            }
            else if (foodType.equals("Chinese")) {
               res = res + "China Town\n" + "Ching Chang\n" + "Soupy Time";
            }
            else if (foodType.equals("South Indian")) {
               res = res + "Bawarchi\n" + "Mom's Dosa\n" + "Mandi House";
            }
            else if (foodType.equals("North Indian")) {
               res = res + "Moorthal\n" + "Kailash Da Dhaba\n" + "Parathe Wali Gali";
            }
            else if (foodType.equals("Sea Food")) {
               res = res + "Crab Town\n" + "Fish Fun\n" + "Whale Stadium";
            } else {
               Toast.makeText(MainActivity.this, "No restro found!", Toast.LENGTH_SHORT).show();
               res = res + "That's right!";
            }
            textView.setText(res);


         }
      });
   }

}

