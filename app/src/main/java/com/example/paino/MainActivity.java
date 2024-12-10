package com.example.paino;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButton(R.id.buttonC,R.raw.c );
        setupButton(R.id.buttonD,R.raw.d );
        setupButton(R.id.buttonE,R.raw.e );
        setupButton(R.id.buttonF,R.raw.f );
        setupButton(R.id.buttonG,R.raw.g );
        setupButton(R.id.buttonA,R.raw.a );
        setupButton(R.id.buttonB,R.raw.b) ;
        setupButton(R.id.buttonZ,R.raw.fa) ;
        setupButton(R.id.buttont,R.raw.la) ;
    }

    private void setupButton(int buttonId, int soundId) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> playSound(soundId));
    }

    private void playSound(int soundId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundId);
        mediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
