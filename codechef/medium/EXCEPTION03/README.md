# EXCEPTION03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Safe Bank Transfer Processor

A banking system maintains multiple accounts and processes transfer requests between them.

Each account has:

- a unique account number
- a current balance

For every transfer request, the system receives a source account, a destination account, and an amount.

A transfer is successful only when:

- both accounts exist;
- source and destination accounts are different;
- the amount is greater than $0$;
- the source account has sufficient balance.

If a transfer fails, the balances of all accounts must remain unchanged. Processing must continue with the remaining transactions.

### Task

Implement the required exception classes and complete the `transfer()` method in the `BankSystem` class.

The following errors must be represented using exceptions:

- InvalidAccountException — source or destination account does not exist.
- InvalidTransactionException — source and destination are the same, or the amount is not positive.
- InsufficientBalanceException — source account does not contain enough balance.

The provided driver code catches these exceptions and prints the corresponding result.

### Sample 1:
Input
Output

```
3
101 5000
102 3000
103 1000
5
101 102 1500
103 101 2000
102 102 500
999 101 100
102 103 -200
```

```
Transfer Successful
Insufficient Balance
Invalid Transaction
Invalid Account
Invalid Transaction
Final Balances:
101 3500
102 4500
103 1000
```

### Explanation:

The first transfer succeeds and moves $1500$ from account `101` to account `102`.

The remaining requests fail because of insufficient balance, identical source and destination accounts, an invalid account number, and a negative transfer amount.

Only successful transfers modify account balances.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:57:32.261Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/EXCEPTION03)