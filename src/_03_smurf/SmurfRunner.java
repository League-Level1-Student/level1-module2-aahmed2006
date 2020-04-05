package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Handy");
	System.out.println(handySmurf.getName());
	handySmurf.eat();
	Smurf papaSmurf = new Smurf("papaSmurf");
	System.out.println(papaSmurf.getName());
	System.out.println(papaSmurf.getHatColor());
	System.out.println(papaSmurf.isGirlOrBoy());
	Smurf smurfette = new Smurf("smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
