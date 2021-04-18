package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyseTest {
    @Test
    void testAnalyseMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Happy");
        Assert.assertEquals("Happy",mood);

    }
}
