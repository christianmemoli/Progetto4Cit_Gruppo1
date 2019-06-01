package application;

public class EccezioneException extends Exception{
	String message;
	public EccezioneException(String s)
	{
		message = s;
	}
	public String getMessage()
	{
		return message;
	}
}
