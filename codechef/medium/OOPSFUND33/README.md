# OOPSFUND33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Array Exception Handling

This coding lab evaluates your understanding of  **Java arrays**  and  **exception handling mechanisms**. You will implement a program that manages student data using arrays while gracefully catching and handling runtime boundary errors.

### Environment & File Structure

You are provided with a single source file:

- Codechef.java: Contains the Codechef class with the pre-defined entry point (main method).

 **Important:**  Complete the implementation inside `Codechef.java`. This is the only file required for evaluation.

### Detailed Requirements
### 1. Data Structures
- Declare a String array named name with a fixed size of 10.
- Declare an int array named roll with a fixed size of 10.
### 2. Processing & Output Logic
- Wrap your array processing logic inside a try block.
- Populate the arrays using a loop:
- Store student names as Student0, Student1,..., up to Student9.
- Store corresponding roll numbers from 1 to 10.
- Print each student record sequentially in the format: [Name] [RollNumber] (e.g., Student0 1).
### 3. Exception Triggering & Handling
- Immediately after printing all 10 student records (still within the try block), intentionally attempt to access an invalid array index (e.g., index 10 or greater) to trigger an ArrayIndexOutOfBoundsException.
- Implement a corresponding catch block to intercept the ArrayIndexOutOfBoundsException.
- Inside the catch block, print the exact message:

```
Array Index Out Of Bounds Exception Handled

```

### Constraints & Evaluation Guidelines
- Strict Naming: The array identifiers must be named name and roll respectively.
- Array Capacity: Both arrays must maintain a size of 10.
- Output Exactness: The printed output format must precisely match the expected format below; extra characters, missing spaces, or modified exception messages will lead to automated test failures.
### Expected Output

```
Student0 1
Student1 2
Student2 3
Student3 4
Student4 5
Student5 6
Student6 7
Student7 8
Student8 9
Student9 10
Array Index Out Of Bounds Exception Handled

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:57:59.502Z  

```cpp
import java.util.*;

class InvalidAccountException extends Exception {
    InvalidAccountException() {
        super();
    }
}

class InvalidTransactionException extends Exception {
    InvalidTransactionException() {
        super();
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        super();
    }
}


class Account {
    private int accountNumber;
    private long balance;

    Account(int accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

class BankSystem {
    private Map<Integer, Account> accounts;

    BankSystem() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(
                account.getAccountNumber(),
                account);
    }

    public void transfer(
            int source,
            int destination,
            long amount)
            throws InvalidAccountException,
            InvalidTransactionException,
            InsufficientBalanceException {
                
        if (!accounts.containsKey(source) || !accounts.containsKey(destination)) {
            throw new InvalidAccountException();
        }

        if (source == destination || amount <= 0) {
            throw new InvalidTransactionException();
        }

        Account sourceAccount = accounts.get(source);

        Account destinationAccount = accounts.get(destination);

        if (sourceAccount.getBalance() < amount) {
            throw new InsufficientBalanceException();
        }

        sourceAccount.setBalance(
                sourceAccount.getBalance() - amount);

        destinationAccount.setBalance(
                destinationAccount.getBalance() + amount);
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BankSystem bank = new BankSystem();

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            int accountNumber = sc.nextInt();
            long balance = sc.nextLong();

            accounts[i] = new Account(
                    accountNumber,
                    balance);

            bank.addAccount(accounts[i]);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            long amount = sc.nextLong();

            try {
                bank.transfer(
                        source,
                        destination,
                        amount);

                System.out.println(
                        "Transfer Successful");
            } catch (InvalidAccountException e) {
                System.out.println(
                        "Invalid Account");
            } catch (InvalidTransactionException e) {
                System.out.println(
                        "Invalid Transaction");
            } catch (InsufficientBalanceException e) {
                System.out.println(
                        "Insufficient Balance");
            }
        }

        System.out.println("Final Balances:");

        for (Account account : accounts) {
            System.out.println(
                    account.getAccountNumber()
                            + " "
                            + account.getBalance());
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND33)