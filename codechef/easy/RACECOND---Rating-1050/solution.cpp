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
