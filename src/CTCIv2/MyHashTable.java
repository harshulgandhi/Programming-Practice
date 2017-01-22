package CTCIv2;

public class MyHashTable<K, V> {
	private MyArrayList<Node> index[];
	private int INITIAL_CAPACITY = 16;
	MyHashTable() {
	}
	
	private class Node<K, V> {
		private K key;
		private V value;
		
		Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		
		
	}
}
