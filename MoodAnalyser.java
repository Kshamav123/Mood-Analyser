package com.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String string) {
		this.message = message;
	}

	/**
	 * Constructor to initialise
	 * 
	 * @param message
	 */
	public String MoodAnalyser(String message) {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() {

		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}

		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
