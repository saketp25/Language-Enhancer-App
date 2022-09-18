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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        setTitle("Phrases");

        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("Hello how are you" , "नमस्ते, कैसे हो आप" ) );
        words.add( new Word("What's your name" ,"आपका नाम क्या है" ) );
        words.add( new Word("I live in India" , "में भारत में रहता हूँ" ) );
        words.add( new Word("Where are your from" ,"आप कहाँ से हो" ) );
        words.add( new Word("Where are you going" , "आप कहाँ जा रहे हैं" ) );
        words.add( new Word("Come here" ,"यहाँ आओ" ) );
        words.add( new Word("I'm feeling good" , "मैं अच्छा महसूस कर रहा हूँ" ) );
        words.add( new Word("I love eating pani puri" ,"मुझे पान पुरी खाना बहुत पसंद है" ) );
        words.add( new Word("Thanks for your help" , "आपकी सहायता के लिए धन्यवाद" ) );

        WordAdapter adapter = new WordAdapter(this , words,R.color.light_green);
        ListView listView  = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}