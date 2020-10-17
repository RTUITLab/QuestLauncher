package ru.mirea.launcherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.mirea.launcherapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Button buttonJumpToGame = binding.jumpInGame;
        buttonJumpToGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpToGame();
            }
        });

    }

    private void jumpToGame() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.facebook.arvr.quillplayer", "com.facebook.arvr.quillplayer.MainActivity"));
        startActivity(intent);
    }
}