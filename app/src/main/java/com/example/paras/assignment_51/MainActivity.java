package com.example.paras.assignment_51;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView blinkText;
    private Button startButton;
    private Animation mfadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.startButton);
        blinkText = (TextView)findViewById(R.id.blinkText);

        //loading the fading in and out xml files.
        mfadein = AnimationUtils.loadAnimation(this,R.anim.fadin);

        //Handling the event of clicking the button.
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blinkText.setVisibility(View.VISIBLE);   // setting text visibility to visible.
                blinkText.setBackgroundColor(Color.parseColor("#67818a"));  // setting color to the background of text view.
                blinkText.setTextColor(Color.WHITE);
                blinkText.startAnimation(mfadein);       // starting animation.
            }
        });
    }
}
