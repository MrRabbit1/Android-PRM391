package com.fpt.edu.tiengviet123;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fpt.edu.tiengviet123.bean.VCharacter;

import java.util.ArrayList;
import java.util.List;

public class CharacterTable1 extends AppCompatActivity {
    ArrayList<VCharacter> list;
    Button btnA, btnA6, btnA8, btnB, btnC, btnD, btnD9, btnE, btnE6, btnG, btnH, btnI, btnK, btnL, btnM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_table1);
        Bundle bd = getIntent().getBundleExtra("data");
        list = (ArrayList<VCharacter>) bd.getSerializable("list");

        // find adn set button from view

        btnA = findViewById(R.id.btnA);
        btnA6 = findViewById(R.id.btnA6);
        btnA8 = findViewById(R.id.btnA8);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnD9 = findViewById(R.id.btnD9);
        btnE = findViewById(R.id.btnE);
        btnE6 = findViewById(R.id.btnE6);
        btnG = findViewById(R.id.btnG);
        btnH = findViewById(R.id.btnI);
        btnI = findViewById(R.id.btnH);
        btnK = findViewById(R.id.btnK);
        btnL = findViewById(R.id.btnL);
        btnM = findViewById(R.id.btnM);
        final List<Button> listBtn = new ArrayList<>();

        listBtn.add(btnA);
        listBtn.add(btnA8);
        listBtn.add(btnA6);
        listBtn.add(btnB);
        listBtn.add(btnC);
        listBtn.add(btnD);
        listBtn.add(btnD9);
        listBtn.add(btnE);
        listBtn.add(btnE6);
        listBtn.add(btnG);
        listBtn.add(btnH);
        listBtn.add(btnI);
        listBtn.add(btnK);
        listBtn.add(btnL);
        listBtn.add(btnM);
        for (int i = 0; i < listBtn.size(); i++) {
            final int finalI = i;
            listBtn.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playAudio(listBtn.get(finalI).getText().toString());
                }
            });
        }


    }


    void playAudio(String text) {
        int audioId = 0;
        for (int i = 0; i < list.size(); i++) {
            if (text.equalsIgnoreCase(list.get(i).getFace())) {
                audioId = list.get(i).getBaseAudioId();
            }
        }
        if (audioId != 0) {
            MediaPlayer audio = MediaPlayer.create(this, audioId);

            audio.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer audio) {
                    audio.reset();
                    audio.release();
                    audio=null;
                }
            });
            audio.start();
        }


    }


}