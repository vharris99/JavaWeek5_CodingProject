package week5CodingProject;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger logger = new AsteriskLogger();
		SpacedLogger logger2 = new SpacedLogger();
		
		System.out.println("AsteriskLogger Log & Error: " + "\n" + "-------------------------");
		logger.log("Hello");
		logger.error("Hello");
		
		System.out.println();
		
		System.out.println("SpacedLogger Log & Error: " + "\n" + "-------------------------");
		logger2.log("Hello");
		logger2.error("Hello");

	}

}
