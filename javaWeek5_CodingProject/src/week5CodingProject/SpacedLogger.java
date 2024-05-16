package week5CodingProject;

public class SpacedLogger implements Logger {
	
	public void log (String word) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(word.charAt(i));
		}
		System.out.println(result.toString());
	}
	
	public void error (String word) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(word.charAt(i));
		}
		System.out.println("Error: " + result.toString());
	}
}
