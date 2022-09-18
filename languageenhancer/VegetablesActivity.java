package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class VegetablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Vegetables");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Beetroot","चुकंदर", R.drawable.vegetable_beetroot));
        words.add(new Word("Brinjal","बैंगन", R.drawable.vegetable_brinjal));
        words.add(new Word("Cabbage","पत्ता गोभी", R.drawable.vegetable_cabbage));
        words.add(new Word("cauliflower","फूल गोभी", R.drawable.vegetable_cauliflower));
        words.add(new Word("Capsicum","शिमला मिर्च", R.drawable.vegetable_capsicum));
        words.add(new Word("Carrot","गाजर", R.drawable.vegetable_carrot));
        words.add(new Word("Chilli","मिर्च", R.drawable.vegetable_chilli));
        words.add(new Word("Corn","मक्का", R.drawable.vegetable_corn));
        words.add(new Word("Cucumber","ककड़ी", R.drawable.vegetable_cucumber));
        words.add(new Word("Onion","प्याज", R.drawable.vegetable_onion));
        words.add(new Word("Pea","मटर", R.drawable.vegetable_pea));
        words.add(new Word("Potato","आलू", R.drawable.vegetable_potato));
        words.add(new Word("Sweet Potato","शकरकंद", R.drawable.vegetable_sweetpotato));
        words.add(new Word("Tomato","टमाटर", R.drawable.vegetable_tomato));
        words.add(new Word("Unknown","अज्ञात", R.drawable.vegetable_unknown));

        WordAdapter adapter = new WordAdapter(this,words,R.color.DodgerBlue);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}