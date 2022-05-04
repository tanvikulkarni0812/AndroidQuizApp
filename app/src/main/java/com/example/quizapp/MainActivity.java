package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyAnswers mMyAnswers =  new MyAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answerLabel = (TextView)findViewById(R.id.texView1);
        Button getAnswerButton = (Button)findViewById(R.id.button1);
        getAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = mMyAnswers.getmAnswers();
                answerLabel.setText(answer);
            }
        });


    }
}