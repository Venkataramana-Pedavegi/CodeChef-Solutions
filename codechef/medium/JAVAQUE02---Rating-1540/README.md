# JAVAQUE02 - Rating 1540

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Emergency Patient Processing Using PriorityQueue

A hospital emergency department receives patients with different severity levels. Patients with a higher priority must be treated before patients with a lower priority.

Each patient is represented by:

- name — the patient's name
- priority — severity of the condition
- arrivalOrder — the order in which the patient arrived

A smaller priority value indicates a more critical patient. For example, priority $1$ is more urgent than priority $2$.

If two patients have the same priority, the patient who arrived earlier must be treated first.

### Task

Complete the program so that patients are inserted into a `PriorityQueue` and removed according to their treatment priority.

A custom ordering must be defined using either a `Comparator` or the `Comparable` interface.

### Input Format
- The first line contains an integer $N$, the number of patients.
- The next $N$ lines contain: a string name an integer priority

The arrival order is determined by the order in which patients appear in the input.

### Output Format

Print the patients in the order in which they should be treated.

For each patient, print: `<name> <priority>`

### Sample 1:
Input
Output

```
6
Aman 3
Riya 1
Karan 2
Neha 1
Arjun 4
Meera 2
```

```
Riya 1
Neha 1
Karan 2
Meera 2
Aman 3
Arjun 4
```

### Explanation:

Riya and Neha both have priority $1$, so they are treated first. Since Riya arrived before Neha, she is processed first.

Similarly, Karan and Meera both have priority $2$, and Karan is processed first because he arrived earlier.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:17:43.038Z  

```java
import java.util.*;

class Patient
{
    String name;
    int priority;
    int arrivalOrder;

    Patient(String name, int priority, int arrivalOrder)
    {
        this.name = name;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }
}

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Patient> queue =
                new PriorityQueue<>(
                    (p1, p2) ->
                    {
                        if (p1.priority != p2.priority)
                        {
                            return Integer.compare(
                                    p1.priority,
                                    p2.priority
                            );
                        }

                        return Integer.compare(
                                p1.arrivalOrder,
                                p2.arrivalOrder
                        );
                    }
                );

        for (int i = 0; i < n; i++)
        {
            String name = sc.next();
            int priority = sc.nextInt();

            queue.offer(
                    new Patient(
                            name,
                            priority,
                            i
                    )
            );
        }

        while (!queue.isEmpty())
        {
            Patient patient = queue.poll();

            System.out.println(
                    patient.name + " " +
                    patient.priority
            );
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAQUE02)