package com.example.musicmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MYMUSICSSS extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn_pause , btn_play , btn_stop ;
    MediaPlayer mediaPlayer;
    Button btn_previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymusicsss);

        btn_pause = findViewById(R.id.pause);
        btn_play= findViewById(R.id.play);
        btn_stop = findViewById(R.id.stop);
        btn_previous= findViewById(R.id.previous);

        btn_stop.setOnClickListener(this);
        btn_play.setOnClickListener(this);
        btn_pause.setOnClickListener(this);

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MYMUSICSSS.this, MyMusic.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case  R.id.play:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.pubgmusic);
                mediaPlayer.start();
                Toast.makeText(MYMUSICSSS.this,"MUSIC PLAYED",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pause:
                // if (mediaPlayer!=null) {
                mediaPlayer.pause();
                Toast.makeText(MYMUSICSSS.this,"MUSIC PAUSED",Toast.LENGTH_SHORT).show();
                //  }
                break;
            case R.id.stop:
                //  if(mediaPlayer!=null) {
                mediaPlayer.stop();
                Toast.makeText(MYMUSICSSS.this,"MUSIC STOPPED",Toast.LENGTH_SHORT).show();
                //   }
                break;


        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}