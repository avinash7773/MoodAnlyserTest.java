package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyseTest {
    @Test
    void testAnalyseMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Happy");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);

    }
}
