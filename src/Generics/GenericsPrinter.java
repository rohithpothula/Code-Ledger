package Generics;

public class GenericsPrinter<T> {
	
	private T data;

	public GenericsPrinter(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
