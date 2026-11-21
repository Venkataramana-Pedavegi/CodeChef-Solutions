# OOPSFUND21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Library Membership Management

A university library manages two categories of members: Regular Members and Premium Members. Both categories can borrow books, but their borrowing limits and overdue fine calculations differ.

The library needs to calculate each member's overdue fine and determine whether they are eligible to borrow another book.

Your task is to implement a library membership system using abstraction, inheritance, method overriding, and runtime polymorphism.

 **1. LibraryMember Interface** 

- Create an abstract type named LibraryMember that declares the following public methods: MethodReturn typeDescriptionCalculate_Fine()64-bit integerReturn the member's overdue fineBorrowing_Status()StringReturn Eligible or Not Eligible
- The LibraryMember type must define a common contract without implementing the fine calculation or borrowing eligibility rules. It must not be instantiated directly.

 **2. RegularMember Class** 

- Create a class named RegularMember that implements the LibraryMember contract.
- The class must contain two private integer data members: borrowed — Number of books currently borrowed. late — Number of days overdue.
- Implement the constructor RegularMember(borrowed, late) to initialize both members.
- Fine calculation Regular members are charged 2 units for each overdue day. $\text{Fine} = 2 \times \text{late}$
- Borrowing eligibility Return Eligible only when both conditions are satisfied: The member currently has fewer than 5 borrowed books. The overdue fine is zero. Otherwise, return Not Eligible.

 **3. PremiumMember Class** 

- Create a class named PremiumMember that implements the LibraryMember contract.
- The class must contain two private integer data members: borrowed — Number of books currently borrowed. late — Number of days overdue.
- Implement the constructor PremiumMember(borrowed, late) to initialize both members.
- Fine calculation Premium members receive the first 3 overdue days without a fine. Starting from the fourth overdue day, each additional day costs 1 unit. $\text{Fine} = \max(0, \text{late} - 3)$
- Borrowing eligibility Return Eligible only when both conditions are satisfied: The member currently has fewer than 10 borrowed books. The overdue fine is zero. Otherwise, return Not Eligible.

 **Implementation Requirements** 

- Implement the complete LibraryMember, RegularMember, and PremiumMember types.
- Keep the specified data members private and methods public.
- Use an interface or abstract base class to define the shared contract.
- Use inheritance or interface implementation and method overriding for the two member categories.
- Ensure both methods support runtime polymorphism through the common LibraryMember type.
- Use Calculate_Fine() within Borrowing_Status() to determine whether the member has an outstanding fine.
- Both methods must return values without printing output.
- Implement all required types in a single source file, above the locked main function.
### Input Format
- The first line contains an integer T, denoting the number of members.
- Each of the next T lines contains three space-separated values:

`type borrowed late`

Where `type` is either `REGULAR` or `PREMIUM`, `borrowed` is the number of books currently borrowed, and `late` is the number of overdue days.

### Output Format

For each member, print exactly one line:

`type Fine: F Borrowing: S`

Where `F` is the overdue fine and `S` is either `Eligible` or `Not Eligible`.

### Constraints
- $1 \le T \le 500$
- $0 \le \text{borrowed} \le 20$
- $0 \le \text{late} \le 30$
- type is either REGULAR or PREMIUM.
### Sample 1:
Input
Output

```
6
REGULAR 5 2
PREMIUM 5 2
REGULAR 8 0
PREMIUM 12 5
REGULAR 3 4
PREMIUM 15 0
```

```
REGULAR Fine: 4 Borrowing: Not Eligible
PREMIUM Fine: 0 Borrowing: Eligible
REGULAR Fine: 0 Borrowing: Not Eligible
PREMIUM Fine: 2 Borrowing: Not Eligible
REGULAR Fine: 8 Borrowing: Not Eligible
PREMIUM Fine: 0 Borrowing: Not Eligible
```

### Explanation:

For the first member, the regular fine is $2 \times 2 = 4$, and the member has reached the 5-book limit.

For the second member, the premium membership allows 3 overdue days without a fine. With only 5 books borrowed, the member is eligible.

For the fourth member, the fine is $5 - 3 = 2$, and the member has exceeded the borrowing limit of 10 books.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:33:57.845Z  

```java
import java.util.*;

// Implement the following types:
// 1. LibraryMember
// 2. RegularMember
// 3. PremiumMember
interface LibraryMember {
    long Calculate_Fine();
    String Borrowing_Status();
}

class RegularMember implements LibraryMember {
    private int borrowed;
    private int late;

    public RegularMember(int borrowed, int late) {
        this.borrowed = borrowed;
        this.late = late;
    }

    @Override
    public long Calculate_Fine() {
        return 2L * late;
    }

    @Override
    public String Borrowing_Status() {
        if (borrowed < 5 && Calculate_Fine() == 0) {
            return "Eligible";
        }
        return "Not Eligible";
    }
}

class PremiumMember implements LibraryMember {
    private int borrowed;
    private int late;

    public PremiumMember(int borrowed, int late) {
        this.borrowed = borrowed;
        this.late = late;
    }

    @Override
    public long Calculate_Fine() {
        return Math.max(0L, late - 3L);
    }

    @Override
    public String Borrowing_Status() {
        if (borrowed < 10 && Calculate_Fine() == 0) {
            return "Eligible";
        }
        return "Not Eligible";
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            String type = sc.next();
            int borrowed = sc.nextInt();
            int late = sc.nextInt();

            LibraryMember member = type.equals("REGULAR")
                ? new RegularMember(borrowed, late)
                : new PremiumMember(borrowed, late);

            result.append(type)
                  .append(" Fine: ")
                  .append(member.Calculate_Fine())
                  .append(" Borrowing: ")
                  .append(member.Borrowing_Status())
                  .append('\n');
        }

        System.out.print(result);
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND21)