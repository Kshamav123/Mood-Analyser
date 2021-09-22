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
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals(mood, "SAD");
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Use case 2- returns happy when the message has happy
	 */
	@Test
	public void WhenMoodIsHappyDisplaysHAPPY() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I'm feeling happy. ");
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals(mood, "HAPPY");
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Use case 3- returns happy when the message has no occurence of the word 'sad'
	 */
	@Test
	public void WhenMoodIsAnythingElseDisplaysHAPPY() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I'm feeling okay.");
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals(mood, "HAPPY");
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Use Case 4 -when mood entered is Null, displays exception message
	 */
	@Test
	public void WhenMoodIsNullDisplaysExceptionMessage() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Please Enter a Valid message.", e.getMessage());
		}
	}

	/**
	 * Use Case 5 -when mood entered is empty, displays exception message
	 */
	@Test
	public void WhenMoodIsEmptyDisplaysExceptionMessage() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(" ");
		try {
			moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Please Enter a Valid message.", e.getMessage());
		}
	}
}
