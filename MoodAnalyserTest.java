package com.moodanalysertest;

import org.junit.Assert;

import org.junit.Test;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalysisException;

/**
 * The class ModdAnalyser is used to test the working of the code. The main
 * logic of the code is in MoodAnalyser.java
 * 
 * @author kshamavidyananda
 *
 */

public class MoodAnalyserTest {
	/**
	 * Use Case 1- returns sad when the message has sad.
	 */
	@Test
	public void WhenMoodIsSadDisplaysSAD() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I'm feeling sad.");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals(mood, "SAD");
	}

	/**
	 * Use Case 2 - returns happy when the message has happy.
	 */
	@Test
	public void WhenMoodIsHappyDisplaysHAPPY() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I'm feeling happy. ");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals(mood, "HAPPY");
	}

	/**
	 * Use Case 3 - returns happy when the message has no occurance of the word
	 */

	@Test
	public void WhenMoodIsAnythingElseDisplaysHAPPY() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I'm feeling okay.");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals(mood, "HAPPY");
	}

	/**
	 * Use Case 4 -when mood entered is Null, displays happy.
	 */
	@Test
	public void WhenMoodIsNullDisplaysHAPPY() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals(mood, "HAPPY");
	}
}