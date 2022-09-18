package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        setTitle("Family Members");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","पिता जी",R.drawable.family_father));
        words.add(new Word("Mother","मां",R.drawable.family_mother));
        words.add(new Word("Son","बेटा",R.drawable.family_son));
        words.add(new Word("Daughter","बेटी",R.drawable.family_daughter));
        words.add(new Word("Older Brother","बड़े भाई",R.drawable.family_older_brother));
        words.add(new Word("Younger Brother","छोटा भाई",R.drawable.family_younger_brother));
        words.add(new Word("Older Sister","बड़ी बहन",R.drawable.family_older_sister));
        words.add(new Word("Younger Sister","छोटी बहन",R.drawable.family_younger_sister ));
        words.add(new Word("Grandfather","दादा",R.drawable.family_grandfather));
        words.add(new Word("grandmother","दादी मा",R.drawable.family_grandmother ));

        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.DodgerBlue);
        ListView listView = findViewById(R.id.familyListView);
        listView.setAdapter(wordAdapter);

    }
}