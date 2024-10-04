package ObserverDesignPattern;

public class Subscriber implements Observer{

	@Override
	public void update() {
		System.out.println("This is the update method in Subscriber observer");
	}

}
