package DataStructure;

class HashMapNode <K, V> {
    K key;
    V value;
    HashMapNode<K,V> next;

    HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

public class HashMap<K,V> {
    private final int INITIAL_CAPACITY = 16; // Initial capacity of the hashmap
    private final float LOAD_FACTOR = 1.5f; // Load factor for resizing
    private HashMapNode<K, V>[] hashMapArray; // Array of Entry objects
    private int size = 0;

    public HashMap() {
        hashMapArray = new HashMapNode[INITIAL_CAPACITY];
    }

    private int hash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode()) % INITIAL_CAPACITY;
    }

    public void put(K key, V value) {
        HashMapNode<K,V> newNode = new HashMapNode<>(key, value);
        int index = hash(key);
        HashMapNode<K,V> current = hashMapArray[index];

        if(current == null) {
            hashMapArray[index] = newNode;
            return;
        }

        HashMapNode<K, V> prev = null;
        while (current != null) {
            if(current.key.equals(key)) {
                current.value = value;
                return;
            }
            prev = current;
            current = current.next;
        }
        prev.next = newNode;
        return;
    }

    public V get(K key) {
        int index = hash(key);
        HashMapNode<K,V> current = hashMapArray[index];

        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }

        return null;

    }



}
