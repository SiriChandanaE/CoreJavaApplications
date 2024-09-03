package casestudy2;
/*
import java.util.ArrayDeque;
import java.util.Deque;
public class CustomerSupportTicketSystem {
    private Deque<String> ticketQueue = new ArrayDeque<>();

    public static void main(String[] args) {
    	CustomerSupportTicketSystem system = new CustomerSupportTicketSystem();

        // Adding some tickets
        system.addTicket("Ticket 1: Login issue");
        system.addTicket("Ticket 2: Password reset");
        system.addTicket("Ticket 3: Account recovery");

        // Displaying the queue
        system.displayQueue();

        // Processing tickets
        system.processNextTicket();
        system.processNextTicket();
        system.processNextTicket();

        // Displaying the queue after processing
        system.displayQueue();
    }

    // 3. Create Methods for Different Operations:

    // Add a new ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
    }

    // Process the next ticket in the queue
    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            String ticket = ticketQueue.poll();
            System.out.println("Processing: " + ticket);
        }
    }

    // Peek at the next ticket without removing it
    public void peekNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            String ticket = ticketQueue.peek();
            System.out.println("Next ticket: " + ticket);
        }
    }

    // Display all tickets currently in the queue
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Current tickets in the queue:");
            for (String ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }
}





/*

import java.util.ArrayDeque;
import java.util.Deque;
public class SupportTicketSystem {
    // Initializing ticketQueue directly
    private Deque<String> ticketQueue = new ArrayDeque<>();
    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
    }
    // Method to process the next ticket
    public void processNextTicket() {
        String ticket = ticketQueue.poll();
        if (ticket != null) {
            System.out.println("Processed: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }
    // Method to peek at the next ticket without removing it
    public void peekNextTicket() {
        String ticket = ticketQueue.peek();
        if (ticket != null) {
            System.out.println("Next ticket: " + ticket);
        } else {
            System.out.println("No tickets in the queue.");
        }
    }
    // Method to display all tickets currently in the queue
    public void displayQueue() {
        System.out.println("Current queue: " + ticketQueue);
    }
    // Main method (entry point)
    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        // Using the methods
        system.addTicket("Ticket 1: Issue with login");
        system.addTicket("Ticket 2: Password reset needed");
        system.addTicket("Ticket 3: Error during checkout");
        system.displayQueue();
        system.processNextTicket();
        system.peekNextTicket();
        system.displayQueue();
        system.processNextTicket();
        system.processNextTicket();
        system.processNextTicket();  // Handling empty queue gracefully
    }
}

*/



import java.util.ArrayDeque;
import java.util.Queue;
public class SupportTicketSystem {
    private Queue<String> ticketQueue; // Queue to store tickets
    public SupportTicketSystem() {
        // Initialize the ticket queue as an ArrayDeque
        this.ticketQueue = new ArrayDeque<>();
    }
    // Main method to test the ticketing system
    public static void main(String[] args) {
        SupportTicketSystem supportSystem = new SupportTicketSystem();
        // Simulating adding tickets to the queue
        supportSystem.addTicket("Ticket 1: Unable to access account");
        supportSystem.addTicket("Ticket 2: Payment issue");
        supportSystem.addTicket("Ticket 3: Software bug");
        // Display current state of the queue
        supportSystem.displayQueue();
        // Peek the next ticket to be processed
        System.out.println("Next ticket to process: " + supportSystem.peekNextTicket());
        // Process tickets in the queue
        supportSystem.processNextTicket();
        supportSystem.processNextTicket();
        // Display current state of the queue after processing some tickets
        supportSystem.displayQueue();
        // Try to process the next ticket in the queue
        supportSystem.processNextTicket();
        // Attempt to process a ticket when the queue is empty
        supportSystem.processNextTicket();
    }
    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.offer(ticket); // Adds the ticket to the end of the queue
        System.out.println("Added ticket: " + ticket);
    }
    // Method to process the next ticket in the queue
    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) { // Check if the queue is not empty
            String ticket = ticketQueue.poll(); // Retrieves and removes the head of the queue
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process. The queue is empty.");
        }
    }
    // Method to check the next ticket without removing it from the queue
    public String peekNextTicket() {
        if (!ticketQueue.isEmpty()) { // Check if the queue is not empty
            return ticketQueue.peek(); // Retrieves the head of the queue without removing it
        } else {
            return "No tickets in the queue.";
        }
    }
    // Method to display all tickets currently in the queue
    public void displayQueue() {
        if (!ticketQueue.isEmpty()) { // Check if the queue is not empty
            System.out.println("Current tickets in queue: " + ticketQueue);
        } else {
            System.out.println("The queue is empty.");
        }
    }
}