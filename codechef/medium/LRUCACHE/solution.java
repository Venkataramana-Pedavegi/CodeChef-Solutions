import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int key;
        int value;
        Node previous;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class LRUCache {
        private final int capacity;
        private final Map<Integer, Node> cache;

        // Dummy nodes simplify insertion and removal.
        private final Node head;
        private final Node tail;

        LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<>();

            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.previous = head;
        }

        int get(int key) {
            Node node = cache.get(key);

            if (node == null) {
                return -1;
            }

            // The accessed node becomes most recently used.
            removeNode(node);
            addAfterHead(node);

            return node.value;
        }

        void put(int key, int value) {
            Node existingNode = cache.get(key);

            if (existingNode != null) {
                // Update the value and mark the key as recently used.
                existingNode.value = value;

                removeNode(existingNode);
                addAfterHead(existingNode);

                return;
            }

            Node newNode = new Node(key, value);

            cache.put(key, newNode);
            addAfterHead(newNode);

            // Remove the least recently used entry.
            if (cache.size() > capacity) {
                Node leastRecentlyUsed = tail.previous;

                removeNode(leastRecentlyUsed);
                cache.remove(leastRecentlyUsed.key);
            }
        }

        private void removeNode(Node node) {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }

        private void addAfterHead(Node node) {
            node.next = head.next;
            node.previous = head;

            head.next.previous = node;
            head.next = node;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(System.in);

        int testCases = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        for (int testCase = 0; testCase < testCases; testCase++) {
            int operations = scanner.nextInt();
            int capacity = scanner.nextInt();

            LRUCache lruCache = new LRUCache(capacity);

            for (int i = 0; i < operations; i++) {
                String operation = scanner.next();

                if (operation.equals("PUT")) {
                    int key = scanner.nextInt();
                    int value = scanner.nextInt();

                    lruCache.put(key, value);
                } else {
                    int key = scanner.nextInt();

                    output.append(lruCache.get(key)).append('\n');
                }
            }
        }

        System.out.print(output);
    }

    static class FastScanner {
        private final InputStream input;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int bytesRead = 0;

        FastScanner(InputStream input) {
            this.input = input;
        }

        private int read() throws IOException {
            if (pointer >= bytesRead) {
                bytesRead = input.read(buffer);
                pointer = 0;

                if (bytesRead == -1) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        String next() throws IOException {
            StringBuilder token = new StringBuilder();
            int character;

            do {
                character = read();
            } while (character <= ' ' && character != -1);

            while (character > ' ') {
                token.append((char) character);
                character = read();
            }

            return token.toString();
        }

        int nextInt() throws IOException {
            int character;

            do {
                character = read();
            } while (character <= ' ' && character != -1);

            int sign = 1;

            if (character == '-') {
                sign = -1;
                character = read();
            }

            int number = 0;

            while (character > ' ') {
                number = number * 10 + character - '0';
                character = read();
            }

            return number * sign;
        }
    }
}