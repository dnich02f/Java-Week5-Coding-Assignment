package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger spaceLogger1 = new SpacedLogger();
		spaceLogger1.Log("Coffee time!");
		spaceLogger1.Error("No Coffee!");
		
		Logger asteriskLogger1 = new AsteriskLogger();
		asteriskLogger1.Log("Creamer, please!");
		asteriskLogger1.Error("No Creamer!");
	}

}
