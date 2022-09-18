package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.UserDictionary;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Colors");

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Orange","नारंगी रंग (भगवा रंग) " ,R.drawable.color_orange ));
        words.add(new Word("Green","हरा",R.drawable.color_green ));
        words.add(new Word("Brown","भूरा",R.drawable.color_brown ));
        words.add(new Word("Black","काला",R.drawable.color_black ));
        words.add(new Word("Red","लाल",R.drawable.color_red ));
        words.add(new Word("Yellow","पीला",R.drawable.color_mustard_yellow ));
        words.add(new Word("White","सफेद",R.drawable.color_white ));
        words.add(new Word("gray","धूसर",R.drawable.color_gray ));
        words.add(new Word("Blue","नीला",R.drawable.color_blue ));
        words.add(new Word("Pink","गुलाबी",R.drawable.color_pink ));

        WordAdapter wordAdapter = new WordAdapter(this,words , R.color.DodgerBlue);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

    }

}