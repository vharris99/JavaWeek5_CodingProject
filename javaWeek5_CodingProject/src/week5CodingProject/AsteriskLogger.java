package week5CodingProject;

public class AsteriskLogger implements Logger{

	public void log (String word) {
		System.out.println("***" + word + "***");
	}

	
	public void error (String word) {
		
		System.out.println("****************" + "\n" + "***" + "Error: " + word +
							"***" + "\n" + "****************");
		
	}
}
