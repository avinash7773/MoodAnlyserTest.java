package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        moodanalyser.analyseMood();
    }

    //Handle nullpointerException
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EnteredEmpty,"Please enter valid mood");
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EnteredNull,"Please enter valid mood");
        }

    }
}
