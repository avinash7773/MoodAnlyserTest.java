package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        moodanalyser.analyseMood();
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }

    }
}
