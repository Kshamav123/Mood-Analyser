package com.moodanalyser;

public class MoodAnalyser {
	String message;

	/**
	 * Constructor to initialise
	 * 
	 * @param message
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
