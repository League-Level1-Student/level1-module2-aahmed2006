package _04_tea_maker;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.JOptionPane;

import _04_tea_maker.Kettle.Water;

public class TeaMaker {

	/*
	 * Figure out how to make a cup of tea in this runner class, using the other
	 * classes below
	 */
	public static void main(String[] args) {
Kettle kettle = new Kettle();
Water water = kettle.getWater();
kettle.boil();
String tea = JOptionPane.showInputDialog("what flavor of tea would you like (green, mint, chamomile, passion fruit)?");
if(tea.equalsIgnoreCase("green")) {
	TeaBag teabag = new TeaBag("Green");
	System.out.println(teabag.getFlavor());
	Cup cup = new Cup();
	cup.makeTea(teabag, water);
} else if (tea.equalsIgnoreCase("mint")) {
	TeaBag teabag = new TeaBag("Mint");
	System.out.println(teabag.getFlavor());
	Cup cup = new Cup();
	cup.makeTea(teabag, water);
} else if (tea.equalsIgnoreCase("chamomile")) {
	TeaBag teabag = new TeaBag("Chamomile");
	System.out.println(teabag.getFlavor());
	Cup cup = new Cup();
	cup.makeTea(teabag, water);
} else if (tea.equalsIgnoreCase("passion fruit")) {
	TeaBag teabag = new TeaBag("Passion Fruit");
	System.out.println(teabag.getFlavor());
	Cup cup = new Cup();
	cup.makeTea(teabag, water);
}
	}

}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
