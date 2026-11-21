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