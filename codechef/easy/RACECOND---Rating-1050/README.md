# RACECOND - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Concurrent Ticket Booking

A movie theater has a limited number of tickets. Multiple booking agents work simultaneously, and each agent runs in a separate thread.

All threads share one `TicketInventory` object. Without synchronization, two threads might reserve the same tickets, leading to overbooking.

Your task is to implement a thread-safe ticket booking system using Java multithreading and the `synchronized` keyword.

#### Task

Complete only these four tasks:

- BookingWorker - Fill in the class declaration so it extends Thread.
- bookTickets(int quantity) - Make the method synchronized. Return false if quantity <= 0 or there are insufficient tickets. Otherwise, subtract the requested tickets, increment successfulBookings once, and return true.
- getAvailableTickets() - Make the method synchronized and return the remaining tickets.
- getSuccessfulBookings() - Make the method synchronized and return the number of successful booking requests.

Do not modify the constructor, `run()` method, or `main()` method.

Synchronization ensures that concurrent booking requests cannot reserve more tickets than are available, regardless of the order in which the threads execute.

### Input Format
- The first line contains two space-separated integers T and N, where: T is the total number of available tickets. N is the number of booking workers (threads).
- The next N lines each contain two space-separated integers Q and R, where: Q is the number of tickets requested in each booking attempt. R is the number of booking attempts made by that worker.
### Output Format

Print two lines:

- Tickets Remaining: X, where X is the number of tickets remaining after all workers finish.
- Successful Bookings: Y, where Y is the total number of successful booking attempts.

All booking workers execute concurrently. Each booking request succeeds only if sufficient tickets are available.

### Sample 1:
Input
Output

```
13 3
2 4
2 3
2 2
```

```
Tickets Remaining: 1
Successful Bookings: 6
```

### Explanation:

Initially, the theater has 13 tickets and 3 booking workers.

- Worker 1 attempts to book 2 tickets, 4 times.
- Worker 2 attempts to book 2 tickets, 3 times.
- Worker 3 attempts to book 2 tickets, 2 times.

The workers collectively make $4+3+2=9$ booking attempts.

Each successful booking reserves exactly 2 tickets. Therefore, at most $\lfloor 13/2 \rfloor=6$ bookings can succeed.

- 6 bookings succeed, reserving 12 tickets.
- 3 bookings fail because insufficient tickets remain.
- 1 ticket remains unbooked.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:05:54.750Z  

```cpp
        int n = sc.nextInt();

        TicketInventory inventory = new TicketInventory(totalTickets);
        BookingWorker[] workers = new BookingWorker[n];

        for (int i = 0; i < n; i++) {
            int quantity = sc.nextInt();
            int attempts = sc.nextInt();
            workers[i] = new BookingWorker(inventory, quantity, attempts);
        }

        for (BookingWorker worker : workers) {
            worker.start();
        }
        for (BookingWorker worker : workers) {
            worker.join();
        }

        System.out.println("Tickets Remaining: " + inventory.getAvailableTickets());
        System.out.println("Successful Bookings: " + inventory.getSuccessfulBookings());
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RACECOND)