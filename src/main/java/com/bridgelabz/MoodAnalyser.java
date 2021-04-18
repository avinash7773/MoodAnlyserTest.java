package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public static void main(String[] args) {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.analyseMood("Happy");
    }

    public String analyseMood(String message){
        this.message = message;
        return message;

    }
}
