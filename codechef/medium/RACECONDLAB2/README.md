# RACECONDLAB2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coordinated Odd-Even Number Printing

A multithreaded application uses two worker threads to print numbers from `1` to `N`.

- The OddThread must print odd numbers.
- The EvenThread must print even numbers.
- The final output must always remain in increasing order:

```
1 2 3 4 5 6...

```

Since both threads execute concurrently, simply allowing each thread to print independently may produce numbers in the wrong order.

Your task is to synchronize the two threads so that they take turns correctly.

#### Task

Complete only `NumberCoordinator.java`.

- Implement: public void printOdd(int number) and public void printEven(int number)
- Requirements: Only the odd thread may print when it is the odd thread's turn. Only the even thread may print when it is the even thread's turn. A thread must wait if it is not its turn. After printing, wake the waiting thread. Use: synchronized wait() notifyAll()
- Do not modify OddThread.java, EvenThread.java, or Main.java files.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:05:32.312Z  

```cpp

        while (!oddTurn) {
            wait();
        }

        System.out.print(number + " ");

        oddTurn = false;
        notifyAll();
    }

    public synchronized void printEven(int number)
            throws InterruptedException {

        while (oddTurn) {
            wait();
        }

        System.out.print(number + " ");

        oddTurn = true;
        notifyAll();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RACECONDLAB2)