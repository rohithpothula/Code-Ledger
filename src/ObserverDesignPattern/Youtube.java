package ObserverDesignPattern;

public class Youtube {

	public static void main(String[] args) {
		
		Observer s1 = new Subscriber();
		Observer s2 = new Subscriber();
		
		Subject channel = new Channel();
		channel.registerObserver(s1);
		channel.registerObserver(s2);
		channel.notifyObservers();

	}

}
