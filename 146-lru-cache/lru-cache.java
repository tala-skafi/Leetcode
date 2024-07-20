class LRUCache {
    Map<Integer, Node> map;
    int LIMIT;
    int counter;
    Node head;
    Node tail;

    class Node {
        int key;
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;

        }
    }

    public LRUCache(int capacity) {
        map = new HashMap<>();
        LIMIT = capacity;
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
        counter = 0;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node temp = map.get(key);
            delete(temp);
            moveToHead(temp);
            return map.get(key).val;
        } else
            return -1;

    }

    public void moveToHead(Node node) {
        Node next = head.next;
        node.next = next;
        head.next = node;
        node.prev = head;
        next.prev = node;

    }

    public void delete(Node node) {
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            delete(node);
            moveToHead(node);
        } else {
            Node newNode = new Node(value);
            newNode.key=key;
            map.put(key, newNode);
            moveToHead(newNode);
            counter++;
        }
        if (map.size() > LIMIT) {
            removeLRU();
        }

    }

    public void removeLRU() {
        Node prev = tail.prev;
        map.remove(prev.key);
        delete(prev);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */