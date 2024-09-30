package FactoryDesignPattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		ComputerFactory computerFactory = new ComputerFactory();
		Computer computer = computerFactory.getComputer("PC", "2GB", "500MB", "2.4Ghz");
	}

}
