package FactoryDesignPattern;

public class PC extends Computer{

	private String RAM;
	
	private String Memory;
	
	private String Hdd;

	public PC(String rAM, String memory, String hdd) {
		super();
		RAM = rAM;
		Memory = memory;
		Hdd = hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMemory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
