package FactoryDesignPattern;

public class ComputerFactory {
	
	private Computer computer;
	
	public static Computer getComputer(String type,String ram, String memory, String Hdd) {
		if(type.equals("PC")) {
			return new PC(ram, memory, Hdd);
		}
		else if(type.equals("server")) {
			return new Server(ram, memory, Hdd);
		}
		else {
			return new Server(ram, memory, Hdd);
		}
	}


}
