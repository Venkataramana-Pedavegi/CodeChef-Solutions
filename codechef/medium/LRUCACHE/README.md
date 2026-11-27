# LRUCACHE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### LRU Cache

Design and implement a Least Recently Used (LRU) Cache that supports the following operations in O(1) time complexity:

- GET key: Retrieves the value associated with key if it exists in the cache. If the key is not present, returns -1.
- PUT key value: Inserts or updates the value for key. If the cache exceeds its capacity, evict the least recently used key-value pair to make space for the new entry.
### Input Format
- The first line contains an integer T, the number of test cases.
- For each test case: The first line contains two space-separated integers n and c — representing the number of operations and the capacity of the LRU cache, respectively. The next n lines each contain an operation in one of the following formats: PUT k v : Inserts or updates key k with value v. GET k : Retrieves the value associated with key k.
### Output Format
- For each GET operation, output the value of the key if it exists in the cache.
- If the key does not exist, output -1.
- The results of multiple test cases should be separated by a newline.
### Constraints
- 1 <= T <= 10
- 1 <= n <= 10
- 1 <= c <= 10
- -10^5 <= k, v <= 10^5
### Sample 1:
Input
Output

```
2
5 2
PUT 1 1
PUT 2 2
GET 1
PUT 3 3
GET 2
4 1
PUT 2 2
GET 2
PUT 3 3
GET 2
```

```
1
-1
2
-1
```

### Explanation:

Sample 1 Case 1: Capacity = 2

Operations:

- PUT 1 1: Insert key 1 with value 1. Cache: {1=1}
- PUT 2 2: Insert key 2 with value 2. Cache: {1=1, 2=2}
- GET 1: Key 1 exists. Return 1. Cache: {2=2, 1=1} (Key 1 becomes the most recently used)
- PUT 3 3: Capacity reached. Evict the least recently used key (2) and insert key 3 with value 3. Cache: {1=1, 3=3}
- GET 2: Key 2 is not present in the cache. Return -1.

Sample 1 Case 2: Capacity = 1

Operations:

- PUT 2 2: Insert key 2 with value 2. Cache: {2=2}
- GET 2: Key 2 exists. Return 2.
- PUT 3 3: Capacity reached. Evict key 2 and insert key 3 with value 3. Cache: {3=3}
- GET 2: Key 2 is not present in the cache. Return -1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:57:39.949Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/LRUCACHE)