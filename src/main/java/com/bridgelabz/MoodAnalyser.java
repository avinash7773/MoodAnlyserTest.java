package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        MoodAnalyser moodanalyser = new MoodAnalyser("Happy");
    }

    public String analyseMood() {
        this.message = message;
        return message;
    }

}
