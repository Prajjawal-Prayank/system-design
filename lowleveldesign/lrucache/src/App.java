import lru.LRU;

public class App {
    public static void main(String[] args) throws Exception {
        LRU lru = new LRU(2);
        lru.put(2, 6);
        lru.put(4, 7);
        System.out.println(lru.get(2));         // 6
        lru.put(8, 11);
        lru.put(8, 10);
        System.out.println(lru.get(2));         // 6
        System.out.println(lru.get(4));         // null
        System.out.println(lru.get(8));         // 10
        lru.put(5, 6);
        System.out.println(lru.get(7));         // null
        lru.put(5, 7);
        System.out.println(lru.get(5));         // 7
    }
}
