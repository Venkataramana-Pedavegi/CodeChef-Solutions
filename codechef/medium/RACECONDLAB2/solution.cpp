
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