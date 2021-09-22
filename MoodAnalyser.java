package com.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
		this.message = null;
	}


	/**
	 * Constructor to initialise
	 * 
	 * @param message
	 * @throws MoodAnalysisException 
	 */
	public  MoodAnalyser(String message){
		this.message = message;
	}
		
	

	public String analyseMood() throws MoodAnalysisException {

		try
		{
			if(message.length() == 0)
			{
				throw new MoodAnalysisException("Please Enter a Valid message.",MoodAnalysisException.ExceptionType.EMPTY_MESSAGE);
			}
			else if (message.contains("sad")) 
			{
				return "SAD";
			} 
			else 
			{
				return "HAPPY";
			}
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalysisException("Please Enter a Valid message.",MoodAnalysisException.ExceptionType.NULL_MESSAGE);
		}
	}
}	

