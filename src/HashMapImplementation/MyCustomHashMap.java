package HashMapImplementation;

public class MyCustomHashMap {
	
	private static final int INITIAL_SIZE = 16;
	
	private static final int MAXIMUM_CAPACITY_SIZE = 1 << 30;
	
	public Entry[] hashtable;
	
	public MyCustomHashMap() {
		hashtable = new Entry[INITIAL_SIZE];
	}
	public MyCustomHashMap(int capacity) {
		int tableSize = tableSizeFor(capacity);
		hashtable = new Entry[tableSize];
	}
	
	final int tableSizeFor(int capacity) {
		int n = capacity-1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY_SIZE) ? MAXIMUM_CAPACITY_SIZE : n+1;
	}
	
//	public void put(K key, V value) {
//		int hashcode = key.hashCode();
//		Entry node = hashtable[];
//		
//		
//	}
	
	
	class Entry<K,V>{
		public K key;
		public V value;
		public Entry next;
		Entry(K k,V v){
			this.key=k;
			this.value=v;
		}
	}
	
}
