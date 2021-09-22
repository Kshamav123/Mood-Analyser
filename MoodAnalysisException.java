package com.moodanalyser;

@SuppressWarnings("serial")
public class MoodAnalysisException extends Exception{
	
	public enum ExceptionType 
	{
        NULL_MESSAGE,EMPTY_MESSAGE
        
    }
	
	public ExceptionType type;
	
	//Parameterized constructor which takes the exception message and initializes the exception type
	
	public MoodAnalysisException( String message,ExceptionType type)
	{
		super(message);
		this.type=type;
	}
	

}
