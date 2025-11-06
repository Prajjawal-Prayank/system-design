package lru;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    
    // node of a doubly ended queue
    private class Node {
        Node next, prev;
        Integer key, val;

        Node(Integer key, Integer val) {
            this.key = key;
            this.val = val;
        }
    }

    // map from key to a lru node
    private Map<Integer, Node> map;

    // head and tail of the doubly ended queue
    // these two marker nodes help in maintenance 
    // and easy addition and removal of nodes from queue
    private Node head, tail;

    // maximum number of keys in the lru cach
    private int capacity;

    // constructor
    public LRU(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;

        this.head = new Node(null, null);
        this.tail = new Node(null, null);

        this.head.next = tail;
        this.tail.prev = head;
    }

    // add node to front of the queue
    private void addToFirst(Node node) {
        Node next = head.next;
        this.head.next = node;
        node.prev = this.head;
        node.next = next;
        next.prev = node;
    }

    // remove value from node
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    // get
    public Integer get(int key) {
        if(!this.map.containsKey(key)) return null;
        
        Node node = this.map.get(key);
        Integer value = node.val;
        remove(node);
        addToFirst(node);

        return value;
    }

    // put
    public void put(int key, int value) {
        Node node = null;

        if(this.map.containsKey(key)) {
            node = this.map.get(key);
            node.val = value;
            remove(node);
        } else {
            node = new Node(key, value);

            // if max capacity of keys is reached,
            // remove the least recently used key
            if(this.map.keySet().size()==capacity) {
                Node leastUsedNode = this.tail.prev;
                this.map.remove(leastUsedNode.key);
                remove(leastUsedNode);
            }

            // make an entry for key in the map
            this.map.put(key, node);
        }

        addToFirst(node);
    }

}
