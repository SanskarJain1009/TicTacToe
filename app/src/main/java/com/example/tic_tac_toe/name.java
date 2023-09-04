package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class name extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
            EditText player_1, player_2;
            player_1= findViewById(R.id.player_1);
            player_2=findViewById(R.id.player_2);
            Button play;
            play=findViewById(R.id.play);

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                    public void onClick(View v) {
                    Intent play_screen;
                    play_screen = new Intent(name.this, MainActivity.class);
                    String Player_1= player_1.getText().toString();
                    String Player_2=player_2.getText().toString();
                    play_screen.putExtra("X", Player_1);
                    play_screen.putExtra("O", Player_2);
                    startActivity(play_screen);
                    }
            });
    }
}