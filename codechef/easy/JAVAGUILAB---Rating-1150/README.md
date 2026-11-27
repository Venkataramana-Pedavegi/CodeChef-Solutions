# JAVAGUILAB - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Movie Ticket Booking Application Using Java Swing

A cinema needs a small desktop application for booking movie tickets.

The application must allow a customer to:

- Enter their name.
- Select exactly one movie.
- Enter the number of tickets.
- Click Book Tickets.
- View the booking result in the application.

Use the following ticket prices:

Movie	Price per Ticket
Interstellar	250
Inception	200
Avatar	180

For example, if the customer enters:

```
Name: Aman
Movie: Interstellar
Tickets: 2

```

and clicks  **Book Tickets**, display:

```
Booking confirmed for Aman. Total: 500

```

 **Validation Rules** 

If the customer name is empty, no movie is selected, or the ticket field is empty, display:

```
Enter all booking details.

```

If the ticket count is not a valid positive integer, display:

```
Enter a valid ticket count.

```

Examples of invalid ticket counts:

```
0
-2
abc
2.5

```

 **Files You Must Complete** 

 **`TicketBookingPanel.java`** 

This file contains the booking form and booking logic.

You must:

- Add the three movie radio buttons to the provided ButtonGroup so only one movie can be selected.
- Add all provided Swing components to the panel.
- Add an ActionListener to the Book Tickets button.
- Complete handleBooking() to: Read and trim the customer name. Read the ticket count. Check whether all required details are entered. Check whether the ticket count is a positive integer. Determine the price of the selected movie. Calculate price × number of tickets. Display the required result in resultLabel.

 **`TicketBookingFrame.java`** 

This file represents the main application window.

You must:

- Set the title to Movie Ticket Booking.
- Add a new TicketBookingPanel to the frame.
- Set the frame size to 450 × 400.
- Configure the frame to close the application when the window is closed.
- Center the frame on the screen.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T14:06:04.362Z  

```cpp
The Web Tier handles HTTP requests and responses and commonly uses Servlets or JSP.

The Business Tier contains the main business logic and commonly uses Enterprise JavaBeans (EJB).

Keep the web container question for the later Web Container article.
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAGUILAB)