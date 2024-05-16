package week5CodingProject;

public class MainClass {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		System.out.println("AsteriskLogger Log: " + "\n" + "-----------------");
		asteriskLogger.log("Hello");
		
		System.out.println();
		
		System.out.println("AsteriskLogger Error: " + "\n" + "-------------------");
		asteriskLogger.error("Hello");

		System.out.println();
		
		Logger spacedLogger = new SpacedLogger();
		System.out.println("SpacedLogger Log: " + "\n" + "-----------------");
		spacedLogger.log("Hello");
		
		System.out.println();
		
		System.out.println("SpacedLogger Error: " + "\n" + "-------------------");
		spacedLogger.error("Hello");
	}

}
