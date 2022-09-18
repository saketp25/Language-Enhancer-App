package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Numbers");

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "एक",R.drawable.number_one));
        words.add(new Word("Two","दो",R.drawable.number_two));
        words.add(new Word("Three", "तीन",R.drawable.number_three));
        words.add(new Word("Four","चार",R.drawable.number_four));
        words.add(new Word("Five", "पांच",R.drawable.number_five));
        words.add(new Word("Six","छह",R.drawable.number_six));
        words.add(new Word("Seven", "सात",R.drawable.number_seven));
        words.add(new Word("Eight","आठ",R.drawable.number_eight));
        words.add(new Word("Nine", "नौ",R.drawable.number_nine));
        words.add(new Word("Ten","दस",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this , words,R.color.DodgerBlue);
        ListView listView  = findViewById(R.id.list);
        listView.setAdapter(adapter);
        

    }

}