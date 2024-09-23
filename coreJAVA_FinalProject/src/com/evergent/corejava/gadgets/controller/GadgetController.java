package com.evergent.corejava.gadgets.controller;

import com.evergent.corejava.gadgets.bean.CustomerBean;
import com.evergent.corejava.gadgets.bean.GadgetBean;
import com.evergent.corejava.gadgets.service.CustomerService;
import com.evergent.corejava.gadgets.service.GadgetService;
import com.evergent.corejava.gadgets.service.PurchaseService;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GadgetController {
    private static final Scanner scanner = new Scanner(System.in);
    private static GadgetService gadgetService = new GadgetService();
    private static CustomerService customerService = new CustomerService();
    private static PurchaseService purchaseService = new PurchaseService();

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("\nElectronic Gadgets and Customer Management System");
            System.out.println("1. Manage Customers");
            System.out.println("2. Manage Gadgets");
            System.out.println("3. Record Purchase");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        manageCustomers();
                        break;
                    case 2:
                        manageGadgets();
                        break;
                    case 3:
                        recordPurchase();
                        break;
                    case 4:
                        System.out.println("Thank you for using the system!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        } while (choice != 4);
        scanner.close();
    }

    private static void manageCustomers() {
        int choice = 0;
        do {
            System.out.println("\nCustomer Management");
            System.out.println("1. Add Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Get Customer Details");
            System.out.println("4. View All Customers");
            System.out.println("5. Delete Customer");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        addCustomer();
                        break;
                    case 2:
                        updateCustomer();
                        break;
                    case 3:
                        getCustomer();
                        break;
                    case 4:
                        viewAllCustomers();
                        break;
                    case 5:
                        deleteCustomer();
                        break;
                    case 6:
                        return; // Go back to the main menu
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        } while (choice != 6);
    }

    private static void manageGadgets() {
        int choice = 0;
        do {
            System.out.println("\nGadget Management");
            System.out.println("1. Add Gadget");
            System.out.println("2. Update Gadget");
            System.out.println("3. Get Gadget Details");
            System.out.println("4. View All Gadgets");
            System.out.println("5. Delete Gadget");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        addGadget();
                        break;
                    case 2:
                        updateGadget();
                        break;
                    case 3:
                        getGadget();
                        break;
                    case 4:
                        viewAllGadgets();
                        break;
                    case 5:
                        deleteGadget();
                        break;
                    case 6:
                        return; // Go back to the main menu
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        } while (choice != 6);
    }

    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        System.out.print("Enter customer phone: ");
        String phone = scanner.nextLine();

        CustomerBean customer = new CustomerBean();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPhone(phone);

        int customerId = customerService.addCustomer(customer);
        if (customerId > 0) {
            System.out.println("Customer added successfully with ID: " + customerId);
        } else {
            System.out.println("Failed to add customer.");
        }
    }

    private static void updateCustomer() {
        System.out.print("Enter customer ID to update: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        CustomerBean customer = customerService.getCustomer(customerId);
        if (customer != null) {
            System.out.print("Enter new name (current: " + customer.getName() + "): ");
            String name = scanner.nextLine();
            System.out.print("Enter new email (current: " + customer.getEmail() + "): ");
            String email = scanner.nextLine();
            System.out.print("Enter new phone (current: " + customer.getPhone() + "): ");
            String phone = scanner.nextLine();

            customer.setName(name);
            customer.setEmail(email);
            customer.setPhone(phone);

            if (customerService.updateCustomer(customer) > 0) {
                System.out.println("Customer updated successfully!");
            } else {
                System.out.println("Failed to update customer.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void getCustomer() {
        System.out.print("Enter customer ID to get details: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        CustomerBean customer = customerService.getCustomer(customerId);
        if (customer != null) {
            System.out.println("Customer Details:");
            System.out.println("ID: " + customer.getCustomerId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void viewAllCustomers() {
        List<CustomerBean> customers = customerService.getAllCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            System.out.println("All Customers:");
            for (CustomerBean customer : customers) {
                System.out.println("ID: " + customer.getCustomerId() + ", Name: " + customer.getName() +
                        ", Email: " + customer.getEmail() + ", Phone: " + customer.getPhone());
            }
        }
    }

    private static void deleteCustomer() {
        System.out.print("Enter customer ID to delete: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (customerService.deleteCustomer(customerId) > 0) {
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Failed to delete customer or customer not found.");
        }
    }

    private static void addGadget() {
        System.out.print("Enter gadget type: ");
        String type = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter cost: ");
        int cost = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        GadgetBean gadget = new GadgetBean();
        gadget.setType(type);
        gadget.setQuantity(quantity);
        gadget.setCost(cost);

        int gadgetId = gadgetService.addGadget(gadget);
        if (gadgetId > 0) {
            System.out.println("Gadget added successfully with ID: " + gadgetId);
        } else {
            System.out.println("Failed to add gadget.");
        }
    }

    private static void updateGadget() {
        System.out.print("Enter gadget ID to update: ");
        int gadgetId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        GadgetBean gadget = gadgetService.getGadget(gadgetId);
        if (gadget != null) {
            System.out.print("Enter new quantity (current: " + gadget.getQuantity() + "): ");
            int quantity = scanner.nextInt();
            System.out.print("Enter new cost (current: " + gadget.getCost() + "): ");
            int cost = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            gadget.setQuantity(quantity);
            gadget.setCost(cost);

            if (gadgetService.updateGadget(gadget) > 0) {
                System.out.println("Gadget updated successfully!");
            } else {
                System.out.println("Failed to update gadget.");
            }
        } else {
            System.out.println("Gadget not found.");
        }
    }

    private static void getGadget() {
        System.out.print("Enter gadget ID to get details: ");
        int gadgetId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        GadgetBean gadget = gadgetService.getGadget(gadgetId);
        if (gadget != null) {
            System.out.println("Gadget Details:");
            System.out.println("ID: " + gadget.getGadgetId());
            System.out.println("Type: " + gadget.getType());
            System.out.println("Quantity: " + gadget.getQuantity());
            System.out.println("Cost: " + gadget.getCost());
        } else {
            System.out.println("Gadget not found.");
        }
    }

    private static void viewAllGadgets() {
        List<GadgetBean> gadgets = gadgetService.getAllGadgets();
        if (gadgets.isEmpty()) {
            System.out.println("No gadgets found.");
        } else {
            System.out.println("All Gadgets:");
            for (GadgetBean gadget : gadgets) {
                System.out.println("ID: " + gadget.getGadgetId() + ", Type: " + gadget.getType() +
                        ", Quantity: " + gadget.getQuantity() + ", Cost: " + gadget.getCost());
            }
        }
    }

    private static void deleteGadget() {
        System.out.print("Enter gadget ID to delete: ");
        int gadgetId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (gadgetService.deleteGadget(gadgetId) > 0) {
            System.out.println("Gadget deleted successfully.");
        } else {
            System.out.println("Failed to delete gadget or gadget not found.");
        }
    }

    private static void recordPurchase() {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter gadget ID: ");
        int gadgetId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (purchaseService.addPurchase(customerId, gadgetId, quantity) > 0) {
            System.out.println("Purchase recorded successfully.");
        } else {
            System.out.println("Failed to record purchase.");
        }
    }
}
