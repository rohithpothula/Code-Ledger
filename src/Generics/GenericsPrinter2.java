package Generics;

public class GenericsPrinter2<T,V> {
	
	private T data1;
	private V data2;
	
	public GenericsPrinter2(T data1, V data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}
	public T getData1() {
		return data1;
	}
	public V getData2() {
		return data2;
	}
	
	
}
