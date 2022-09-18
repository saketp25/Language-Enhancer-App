package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Fruits");


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Apple","सेब", R.drawable.fruit_apple));
        words.add(new Word("Banana","केला", R.drawable.fruit_banana));
        words.add(new Word("Kiwi","कीवी", R.drawable.fruit_kiwi));
        words.add(new Word("Lemon","नींबू", R.drawable.fruit_lemon));
        words.add(new Word("Orange","संतरा", R.drawable.fruit_orange));
        words.add(new Word("Pineapple","अनानास", R.drawable.fruit_pineapple));
        words.add(new Word("Papaya","पपीता", R.drawable.fruit_papaya));
        words.add(new Word("Mango","आम", R.drawable.fruit_mango));
        words.add(new Word("Watermelon","तरबूज", R.drawable.fruit_watermelon));
        words.add(new Word("Grapes","अंगूर", R.drawable.fruit_grapes));
        words.add(new Word("Pomegranate","अनार", R.drawable.fruit_pomegranate));
        words.add(new Word("Strawberry","स्ट्रॉबेरी", R.drawable.fruit_strawberry));
        words.add(new Word("Peach","आड़ू", R.drawable.fruit_peach));
        words.add(new Word("Pear","नाशपाती", R.drawable.fruit_pear));
        words.add(new Word("Coconut","नारियल", R.drawable.fruit_coconut));
        words.add(new Word("Cherry","चेरी", R.drawable.fruit_cherry));
        words.add(new Word("Avocado","एवोकाडो", R.drawable.fruit_avocado));

        WordAdapter adapter = new WordAdapter(this,words,R.color.DodgerBlue);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}