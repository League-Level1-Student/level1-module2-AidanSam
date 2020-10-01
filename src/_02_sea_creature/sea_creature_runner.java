package _02_sea_creature;

public class sea_creature_runner {
public static void main(String[] args) {
	SeaCreature patric = new SeaCreature("patrick");
	patric.eat();
	patric.laugh();
	patric.getName();
	SeaCreature squid = new SeaCreature("squidward");
	squid.laugh();
	squid.getName();
	squid.eat();
}
}
