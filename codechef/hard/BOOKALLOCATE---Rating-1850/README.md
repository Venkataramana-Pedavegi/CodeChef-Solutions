# BOOKALLOCATE - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Book Allocation

You have  **N books**, where the `i-th` book has `A[i]` pages. There are  **M students**.

You need to distribute all books to the students with these rules:

- Each student must get at least one book.
- Each book can be given to only one student.
- The books given to a student must be next to each other (contiguous).

Your task is to distribute the books so that the  **maximum pages any student gets is as small as possible**.

If it is not possible to distribute the books, print -1.

### Input Format
- First line: two integers N (number of books) and M (number of students).
- Second line: N integers, where A[i] = pages in the i-th book.
### Output Format
- Print the minimum possible value of the maximum pages assigned to a student.
- If distribution is not possible, print -1.
### Constraints

1 ≤ N, M ≤ 10⁴
1 ≤ A[i] ≤ 10⁵

### Sample 1:
Input
Output

```
4 2
12 34 67 90
```

```
113

```

### Explanation:

Student 1: 12 + 34 + 67 = 113 Student 2: 90 Maximum = 113

### Sample 2:
Input
Output

```
5 4
25 46 28 49 24

```

```
71

```

### Explanation:

Student 1: 25 + 46 = 71 Student 2: 28 Student 3: 49 Student 4: 24 Maximum = 71

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T17:07:13.376Z  

```java
static long allocateBooks(long[] books, int N, int M) {
    if (M > N) {
        return -1;
    }

    long low = 0;
    long high = 0;

    for (int i = 0; i < N; i++) {
        low = Math.max(low, books[i]);
        high += books[i];
    }

    long ans = high;

    while (low <= high) {
        long mid = low + (high - low) / 2;

        if (canAllocate(books, N, M, mid)) {
            ans = mid;
            high = mid - 1; // Try for a smaller maximum
        } else {
            low = mid + 1;  // Increase the capacity
        }
    }

    return ans;
}

private static boolean canAllocate(long[] books, int N, int M, long maxPages) {
    int studentsRequired = 1;
    long currentPages = 0;

    for (int i = 0; i < N; i++) {
        if (books[i] > maxPages) {
            return false;
        }

        if (currentPages + books[i] > maxPages) {
            studentsRequired++;
            currentPages = books[i];

            if (studentsRequired > M) {
                return false;
            }
        } else {
            currentPages += books[i];
        }
    }

    return true;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BOOKALLOCATE)