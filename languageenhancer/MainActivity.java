package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTextView = findViewById(R.id.numbersTextView);
        TextView familyMembersTextView = findViewById(R.id.familyMembersTextView);
        TextView colorsTextView = findViewById(R.id.colorsTextView);
        TextView phrasesTextView = findViewById(R.id.phrasesTextView);
        TextView animalsTextView = findViewById(R.id.animalsTextView);
        TextView birdsTextView = findViewById(R.id.birdsTextView);
        TextView fruitsTextView = findViewById(R.id.fruitsTextView);
        TextView vegetablesTextView = findViewById(R.id.vegetablesTextView);
        TextView greetingsTextView = findViewById(R.id.greetingsTextView);
        TextView subjectsTextView = findViewById(R.id.subjectsTextView);
        TextView monthsTextView = findViewById(R.id.monthsTextView);


        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intent);
            }
        });

        familyMembersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(intent);
            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);
            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intent);
            }
        });

        animalsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AnimalsActivity.class);
                startActivity(intent);
            }
        });

        birdsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BirdsActivity.class);
                startActivity(intent);
            }
        });

        fruitsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FruitsActivity.class);
                startActivity(intent);
            }
        });

        vegetablesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VegetablesActivity.class);
                startActivity(intent);
            }
        });

        greetingsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GreetingsActivity.class);
                startActivity(intent);
            }
        });

        subjectsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });

        monthsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MonthsActivity.class);
                startActivity(intent);
            }
        });

    }
}