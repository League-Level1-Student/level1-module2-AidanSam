package _04_tea_maker;

public class TeaMake {
public static void main(String[] args) {
	TeaBag bag = new TeaBag("GREEN");
	bag.getFlavor();
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(bag, null);
}
}
