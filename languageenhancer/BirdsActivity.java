package com.example.languageenhancer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BirdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Birds");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Cockatoo","काकातुआ" , R.drawable.bird_cockatoo));
        words.add(new Word("Crow", "कौआ", R.drawable.bird_crow));
        words.add(new Word("Duck","बत्तख", R.drawable.bird_duck));
        words.add(new Word("Flamingo","राज-हंस", R.drawable.bird_flamingo));
        words.add(new Word("Hen", "मुर्गी", R.drawable.bird_hen));
        words.add(new Word("Humming Bird","गुंजन पक्षी", R.drawable.bird_hummingbird));
        words.add(new Word("Kingfisher","नीलकंठ", R.drawable.bird_kingfisher));
        words.add(new Word("Owl", "उल्लू", R.drawable.bird_owl));
        words.add(new Word("Parrot","तोता", R.drawable.bird_parrot));
        words.add(new Word("Penguin", "पेंगुइन", R.drawable.bird_penguin));
        words.add(new Word("Sparrow","गौरैया", R.drawable.bird_sparrow));
        words.add(new Word("Toco Toucan","टोको टूकेन पक्षी", R.drawable.bird_toco_toucan));
        words.add(new Word("Woodpecker", "कठफोड़वा", R.drawable.bird_woodpecker));
        words.add(new Word("Bat","चमगादड़", R.drawable.bird_bat));

        WordAdapter adapter = new WordAdapter(this , words,R.color.DodgerBlue);
        ListView listView  = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}