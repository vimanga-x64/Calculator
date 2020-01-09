package com.example.calculator;

//import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import org.mozilla.javascript.Scriptable;
//import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
     Button n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, brackets, percentage, division, delete, multiply, addition, subtraction, dot, equals;
     TextView tvInput, tvOutput;
     String process;
     boolean checkBracket = false;
     private boolean isOpPressed = false;
     private double firstnumber =0;
     private int secondNumberIndex =0;
     private char CurrentOP;

     @Override
    protected void onCreate(Bundle savedInstanceeState) {
         super.onCreate(savedInstanceeState);
         setContentView(R.layout.activity_main);

         n0 = findViewById(R.id.n0);
         n1 = findViewById(R.id.n1);
         n2 = findViewById(R.id.n2);
         n3 = findViewById(R.id.n3);
         n4 = findViewById(R.id.n4);
         n5 = findViewById(R.id.n5);
         n6 = findViewById(R.id.n6);
         n7 = findViewById(R.id.n7);
         n8 = findViewById(R.id.n8);
         n9 = findViewById(R.id.n9);

         brackets = findViewById(R.id.brackets);
         percentage = findViewById(R.id.percentage);
         division = findViewById(R.id.division);
         delete = findViewById(R.id.delete);
         multiply = findViewById(R.id.multiply);
         addition = findViewById(R.id.addition);
         subtraction = findViewById(R.id.subtraction);
         dot = findViewById(R.id.dot);
         equals = findViewById(R.id.equals);

         tvInput = findViewById(R.id.tvInput);
         tvOutput = findViewById(R.id.tvOutput);

         delete.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 tvInput.setText("");
                 tvOutput.setText("");
             }
         });

         n0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "0");
             }
         });
         n1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "1");
             }
         });
         n2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "2");
             }
         });
         n3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "3");
             }
         });
         n4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "4");
             }
         });
         n5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "5");
             }
         });
         n6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "6");
             }
         });
         n7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "7");
             }
         });
         n8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "8");
             }
         });
         n9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "9");
             }
         });
         addition.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                        String screenContent = tvInput.getText().toString();
                        secondNumberIndex=screenContent.length()+1;
                     firstnumber = Double.parseDouble(screenContent);
                     tvInput.setText(firstnumber + "+");
                     isOpPressed = true;
                     CurrentOP = '+';
                 }

         });
         subtraction.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                String screenContent = tvInput.getText().toString();
                secondNumberIndex = screenContent.length()+1;
                     firstnumber = Double.parseDouble(screenContent);
                     tvInput.setText(firstnumber + "-");
                     isOpPressed = true;
                     CurrentOP = '-';
                 }

         });
         multiply.setOnClickListener(new View.OnClickListener() {
             @Override
                     public void onClick(View v) {
             String screenContent = tvInput.getText().toString();
             secondNumberIndex = screenContent.length()+1;
             firstnumber = Double.parseDouble(screenContent);
                     tvInput.setText(firstnumber + "*");
             isOpPressed = true;
             CurrentOP = '*';
                 }

         });
         division.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String screenContent = tvInput.getText().toString();
                 secondNumberIndex = screenContent.length()+1;
                 firstnumber = Double.parseDouble(screenContent);
                 tvInput.setText(firstnumber + "/");
                 isOpPressed = true;
                 CurrentOP = '/';
             }
         });
         dot.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + ".");
             }
         });
         percentage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 process = tvInput.getText().toString();
                 tvInput.setText(process + "%");
             }
         });
         brackets.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (checkBracket) {
                     process = tvInput.getText().toString();
                     tvInput.setText(process + ")");
                     checkBracket = false;
                 }else {
                     process = tvInput.getText().toString();
                     tvInput.setText(process + "(");
                     checkBracket = true;

                 }

             }
         });

         equals.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (isOpPressed) {
                     if(CurrentOP == '+') {
                         String screenContent = tvInput.getText().toString();
                         String secondnumberstring = screenContent.substring(secondNumberIndex, screenContent.length());
                         double secondnumber = Double.parseDouble(secondnumberstring);
                         secondnumber+=firstnumber;
                         tvInput.setText(String.valueOf(secondnumber));
                     }
                     else {
                         if (CurrentOP == '-') {
                             String screenContent = tvInput.getText().toString();
                             String secondnumberstring = screenContent.substring(secondNumberIndex, screenContent.length());
                             double secondnumber = Double.parseDouble(secondnumberstring);
                             firstnumber-=secondnumber;
                             tvInput.setText(String.valueOf(secondnumber));

                         }
                     }
                     
                 }

             }
         });



     }
 }
