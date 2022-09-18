package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Subjects");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Chemistry","रसायन विज्ञान" ));
        words.add(new Word("Physics", "भौतिक विज्ञान"));
        words.add(new Word("Mathematics","गणित"));
        words.add(new Word("Biology","जीवविज्ञान"));
        words.add(new Word("Geography","भूगोल"));
        words.add(new Word("History", "इतिहास"));
        words.add(new Word("Civics","नागरिकशास्र"));
        words.add(new Word("Economics","अर्थशास्त्र"));
        words.add(new Word("Accountacy", "लेखशास्त्र"));
        words.add(new Word("Literature","साहित्य"));
        words.add(new Word("Computer Science", "कंप्यूटर विज्ञान"));
        words.add(new Word("Business Studies", "व्यवसायिक अध्ययन"));

        WordAdapter adapter = new WordAdapter(this , words,R.color.light_green);
        ListView listView  = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}