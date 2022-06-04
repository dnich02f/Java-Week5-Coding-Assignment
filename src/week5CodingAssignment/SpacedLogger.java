package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		String spacedString = new String();
		
		for (int i = 0; i < log.length(); i++) {
			spacedString += log.charAt(i);
			spacedString += " ";
		}
	System.out.println(spacedString);		
		
	}

	@Override
	public void Error(String error) {
		String spacedString = new String();
		spacedString = "ERROR: ";
		for (int i = 0; i < error.length(); i++) {
			spacedString += error.charAt(i);
			spacedString += " ";
		}
		System.out.println(spacedString);
	}

}
