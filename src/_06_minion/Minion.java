package _06_minion;

public class Minion {
	private String name;
	private int eyes; 
	private String color; 
	Minion(String name, int eyes, String color) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
	}
		public String getName() {
			return "My name is " + name + "!";
		
	}
		public String getEyes() {
			return "I have " + eyes + "!";
		
		}
		public String getColor() {
			return "I have " + eyes + "!";
		}
}
