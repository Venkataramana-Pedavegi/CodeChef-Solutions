# BLOCKQUEMCQ

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### BlockingQueue

Which statement about BlockingQueue in Java is correct?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:18:31.461Z  

```cpp
import java.util.*;

class CircularQueue
{
    private int[] queue;
    private int front;
    private int rear;
    private int currentSize;
    private int maxSize;

    CircularQueue(int capacity)
    {
        maxSize = capacity;
        queue = new int[maxSize];

        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int value)
    {
        if (isFull())
        {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % maxSize;

        queue[rear] = value;
        currentSize++;
    }

    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue Underflow");
            return;
        }

        int value = queue[front];

        front = (front + 1) % maxSize;
        currentSize--;

        System.out.println(
                "Dequeued: " + value
        );
    }

    public void front()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(
                "Front: " + queue[front]
        );
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    public boolean isFull()
    {
        return currentSize == maxSize;
    }

    public int size()
    {
        return currentSize;
    }

    public void display()
    {
        System.out.print("Queue: [");

        for (int i = 0; i < currentSize; i++)
        {
            int index =
                    (front + i) % maxSize;

            if (i > 0)
            {
                System.out.print(", ");
            }

            System.out.print(queue[index]);
        }

        System.out.println("]");
    }
}



class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int q = sc.nextInt();

        CircularQueue queue =
                new CircularQueue(capacity);

        for (int i = 0; i < q; i++)
        {
            String operation = sc.next();

            if (operation.equals("ENQUEUE"))
            {
                int value = sc.nextInt();
                queue.enqueue(value);
            }
            else if (operation.equals("DEQUEUE"))
            {
                queue.dequeue();
            }
            else if (operation.equals("FRONT"))
            {
                queue.front();
            }
            else if (operation.equals("SIZE"))
            {
                System.out.println(
                        "Size: " + queue.size()
                );
            }
            else if (operation.equals("ISEMPTY"))
            {
                System.out.println(
                        "Is Empty: " +
                        queue.isEmpty()
                );
            }
            else if (operation.equals("ISFULL"))
            {
                System.out.println(
                        "Is Full: " +
                        queue.isFull()
                );
            }
            else if (operation.equals("DISPLAY"))
            {
                queue.display();
            }
        }

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BLOCKQUEMCQ)