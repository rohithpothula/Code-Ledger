package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
	
	List <Observer> subscribersList = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		subscribersList.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		subscribersList.add(observer);
	}

	@Override
	public void notifyObservers() {
		subscribersList.stream().forEach(observer -> {
			observer.update();
		} );
	}

}
