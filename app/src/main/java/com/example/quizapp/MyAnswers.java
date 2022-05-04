package com.example.quizapp;

import java.util.Random;

public class MyAnswers {
    public String[]mAnswers = {
            "Apple",
            "Orange",
            "Banana",
            "Mango",
            "Strawberry",
            "Guava",
            "Grapes"
    };

    //methods which will be called to get answers
    public String getmAnswers(){
        String answer = "";
        Random randomGenerator = new Random();//construct new random number
        int randomNumber = randomGenerator.nextInt(mAnswers.length);
        answer = mAnswers[randomNumber];
        return answer;
    }
}
