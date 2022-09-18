package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Animals");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Squirrel","गिलहरी" , R.drawable.animal_squirrel));
        words.add(new Word("Rhino", "गैंडा", R.drawable.animal_rhino));
        words.add(new Word("leopard","तेंदुआ", R.drawable.animal_leopard));
        words.add(new Word("Elephant","हाथी", R.drawable.animal_elephant));
        words.add(new Word("Lion", "सिंह", R.drawable.animal_lion));
        words.add(new Word("Zebra","ज़ेबरा", R.drawable.animal_zebra));
        words.add(new Word("Tiger","बाघ", R.drawable.animal_tiger));
        words.add(new Word("Giraffe", "जिराफ़", R.drawable.animal_giraffe));
        words.add(new Word("Horse","घोड़ा", R.drawable.animal_horse));
        words.add(new Word("Cow", "गाय", R.drawable.animal_cow));
        words.add(new Word("Bear","भालू", R.drawable.animal_bear));
        words.add(new Word("Wolf","भेड़िया", R.drawable.animal_wolf));
        words.add(new Word("Rabbit", "खरगोश", R.drawable.animal_rabbit));
        words.add(new Word("Fox","लोमड़ी", R.drawable.animal_fox));
        words.add(new Word("Raccoon","एक प्रकार का कुत्ता", R.drawable.animal_raccoon));

        WordAdapter adapter = new WordAdapter(this , words,R.color.DodgerBlue);
        ListView listView  = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}