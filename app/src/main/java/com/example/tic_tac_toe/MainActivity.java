package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReset;
    ImageView homePage;
    int flag=0;
    int count=0;
    String  b1, b2, b3, b4, b5, b6, b7, b8, b9;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homePage=findViewById(R.id.homePage);
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoHome=new Intent(MainActivity.this, name.class);
                startActivity(gotoHome);
            }
        });
        btn1= findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnReset=findViewById(R.id.btnReset);



        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });


    }

    public void check(View view)
    {

        Button btnCurrent= (Button) view;

        if(btnCurrent.getText().toString().equals(""))
        {
            count++;
            if(flag==0){btnCurrent.setText("x"); flag=1; }
            else{btnCurrent.setText("o"); flag=0;}
        }
        if(count>4)
        {
            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();

            if(b1.equals(b2) && b2.equals(b3) && !b1.equals(""))
            {

                //1
                Result(b1);

            }
            else if(b4.equals(b5) && b5.equals(b6) && !b4.equals(""))
            {
                //2
                Result(b4);
            }
            else if(b7.equals(b8) && b8.equals(b9) && !b7.equals(""))
            {
                //3
                Result(b7);
            }
            else if(b1.equals(b4) && b4.equals(b7) && !b1.equals(""))
            {
                //4
                Result(b1);
            }
            else if(b2.equals(b5) && b5.equals(b8) && !b5.equals(""))
            {
                //5
                Result(b2);
            }
            else if(b3.equals(b6) && b6.equals(b9) && !b3.equals(""))
            {
                //6
                Result(b3);
            }
            else if(b1.equals(b5) && b5.equals(b9) && !b1.equals(""))
            {
                //7
                Result(b1);
            }
            else if(b3.equals(b5) && b5.equals(b7) && !b3.equals(""))
            {
                //8
                Result(b3);
            }
            else if(!b1.equals("") && !b2.equals("") && !b3.equals("") &&
                !b4.equals("") && !b5.equals("") && !b6.equals("") &&
                !b7.equals("") && !b8.equals("") && !b9.equals(""))
                    {
                        Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show();
                        newGame();
                    }
        }
    }

    public void Result(String a)
    {
        Intent playerName= getIntent();
        String player_1= playerName.getStringExtra("X");
        String player_2= playerName.getStringExtra("O");
        if(a=="x")
        {
            Toast.makeText(this, "Winner "+ player_1, Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Winner "+ player_2, Toast.LENGTH_LONG).show();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                newGame();
            }
        }, 2000);
    }
    public void newGame()
    {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

    }


}