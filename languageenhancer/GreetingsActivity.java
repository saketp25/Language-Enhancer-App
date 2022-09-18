package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GreetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Greetings");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Hello","नमस्ते"));
        words.add(new Word("Welcome","स्वागत हैं"));
        words.add(new Word("Good Morning","शुभ प्रभात"));
        words.add(new Word("Good Night","शुभ रात्रि"));
        words.add(new Word("Thank you", "धन्यवाद"));
        words.add(new Word("Excuse me","मुझे माफ करें"));
        words.add(new Word("Excellent", "अति उत्कृष्ट" ));
        words.add(new Word("Congratulations","बहुत बहुत बधाई"));
        words.add(new Word("Happy Birthday","जन्मदिन मुबारकी"));
        words.add(new Word("Happy diwali","शुभ दीवाली"));


        WordAdapter adapter = new WordAdapter(this,words,R.color.light_green);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}