# MULT01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Concurrent Programming

You are given an integer array containing exactly $9$ elements. The array must be processed concurrently using three independent worker threads.

Each `SegmentWorker` worker thread is responsible for computing the sum of one consecutive portion of the array.

Complete the `processArrayAndPrintResults(int[] arr)` method to start the provided worker threads, wait for them to finish, retrieve their results, and print the segment sums along with the total sum.

The `SegmentWorker` class and driver code are provided for your reference. Do  **NOT**  uncomment the code.

 **Segment Division** 
The three segments are defined as follows:

- Segment $0$: Elements at indices $0$ to $2$ (First 3 elements)
- Segment $1$: Elements at indices $3$ to $5$ (Next 3 elements)
- Segment $2$: Elements at indices $6$ to $8$ (Last 3 elements)

 **Task Requirements** 

- Instantiate three SegmentWorker threads corresponding to the three segments.
- Start all worker threads concurrently using.start().
- Wait for all threads to finish execution using.join().
- Retrieve the segment sums, compute the total sum, and print the results in the exact required format.
### Output Format

Print the output in the following format:

```
Segment 0 Sum: <sum0>
Segment 1 Sum: <sum1>
Segment 2 Sum: <sum2>
Total Sum: <totalSum>

```

### Sample 1:
Input
Output

```
 1 2 3 4 5 6 7 8 9
```

```
Segment 0 Sum: 6
Segment 1 Sum: 15
Segment 2 Sum: 24
Total Sum: 45
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:02:39.320Z  

```java
import java.util.*;

class SegmentWorker extends Thread {
    private int[] arr;
    private int start;
    private int end;
    private int sum;

    public SegmentWorker(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

class Codechef {

    public static void processArrayAndPrintResults(int[] arr) throws InterruptedException {
            // Initialize workers for each segment
        SegmentWorker worker0 = new SegmentWorker(arr, 0, 3);
        SegmentWorker worker1 = new SegmentWorker(arr, 3, 6);
        SegmentWorker worker2 = new SegmentWorker(arr, 6, 9);
    
        // Start all threads
        worker0.start();
        worker1.start();
        worker2.start();
    
        // Wait for threads to complete
        worker0.join();
        worker1.join();
        worker2.join();
    
        // Calculate sums
        int sum0 = worker0.getSum();
        int sum1 = worker1.getSum();
        int sum2 = worker2.getSum();
        int totalSum = sum0 + sum1 + sum2;
    
        // Print output
        System.out.println("Segment 0 Sum: " + sum0);
        System.out.println("Segment 1 Sum: " + sum1);
        System.out.println("Segment 2 Sum: " + sum2);
        System.out.println("Total Sum: " + totalSum);
    }

public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Execution delegated to the helper function
        processArrayAndPrintResults(arr);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MULT01)