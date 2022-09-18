package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MonthsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Months");

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word( "Mid-March to mid-April","चैत्रः", -1));
        words.add(new Word("Mid-April to mid-May", "वैशाखः", -1));
        words.add(new Word( "Mid-May to mid-June", "ज्येष्ठः",-1));
        words.add(new Word("Mid-June to mid-July", "आषाढः", -1));
        words.add(new Word( "Mid-July to mid-August", "श्रावणः",-1));
        words.add(new Word( "Mid-August to mid-September", "भाद्रपदः",-1));
        words.add(new Word( "Mid-September to mid-October", "आश्विनः",-1));
        words.add(new Word( "Mid-October to mid-November", "कार्तिकः",-1));
        words.add(new Word( "Mid-November to mid-December", "मार्गशीर्षः",-1));
        words.add(new Word("Mid-December to mid-January", "पौषः", -1));
        words.add(new Word("Mid-January to mid-February","माघ",-1));
        words.add(new Word( "Mid-February to mid-March", "फाल्गुनः",-1));


        WordAdapter wordsAdapter = new WordAdapter(this, words, R.color.light_green);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

    }
}