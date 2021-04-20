package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyseTest {

    @Test
    void testGivenNullMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
    //    String mood = null;
        try {
    //        ExpectedException exceptionRule = ExpectedException.none();
      //      exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyser.analyseMood();
       //   Assert.assertEquals("Happy",mood);
        } catch (MoodAnalysisException e) {
               Assert.assertEquals(MoodAnalysisException.ExceptionType.EnteredNull,e.type);

        }

    }
}
