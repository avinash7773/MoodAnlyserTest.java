package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyseTest {

    @Test
    void testGivenNullMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);

    }
}
