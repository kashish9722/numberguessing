package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int min = 1;
        int max = 100;
        result = getRandomNumber(max,min);
    }
    static int getRandomNumber(int maxNum,int minNum)
    {
        return (int) ((Math.random() * (maxNum-minNum))+minNum);
    }
    public void guessfunction(View view)

    {
       int guessnumber ;
        EditText ednumber ;
        ednumber = findViewById(R.id.ednumber);
        guessnumber = Integer.parseInt(ednumber.getText().toString());
        if(guessnumber < result)
        {
            Toast.makeText(this, "Try Again! Guess a Higher Number", Toast.LENGTH_SHORT).show();
        }
        else if (guessnumber > result)
        {
            Toast.makeText(this, "Try Again! Guess a Lower Number", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Congratulations! YOU WIN!!", Toast.LENGTH_SHORT).show();
        }
    }


}