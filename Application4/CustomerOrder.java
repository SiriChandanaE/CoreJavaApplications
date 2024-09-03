package com.evergent.CoreJAVA.Sirichandana.Application4;
import java.util.Scanner;

public class CustomerOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectronicsGadgetsSIRI siri = new ElectronicsGadgetsSIRI(); // HAS_A relationship
        System.out.print("\n\t\t\t\t==================================");
        System.out.print("\n\t\t\t\tWELCOME TO ELECTRONIC GADGETS SIRI");
        System.out.print("\n\t\t\t\t==================================");
        while (true) {
            System.out.println("\nElectronics Gadgets Main Menu");
            System.out.println("O Order Gadgets");
            System.out.println("C Complementary Goods");
            System.out.println("P Payment Module");
            System.out.println("R Report Module");
            System.out.println("E Exit Module");
            System.out.print("Enter your choice (O, C, P, R, E): ");
            String moduleInput = scanner.nextLine().toUpperCase();
            switch (moduleInput) {
                case "O":
                	System.out.println("\nGadgets Available with price");
                    System.out.println("L Laptop (INR1000 each)");
                    System.out.println("T Television (INR800 each)");
                    System.out.println("Ta Tablet (INR500 each)");
                    System.out.println("Mp Mobile Phone (INR200 each)");
                    System.out.print("Enter your Gadget code (L, T, TA, MP): ");
                    String gadgetCode = scanner.nextLine().toUpperCase();
                    System.out.print("Enter quantity: ");
                    int gadgetQuantity = Integer.parseInt(scanner.nextLine());
                    siri.AddGadegts(gadgetCode, gadgetQuantity);
                    break;
                case "C":
                    System.out.println("\nComplementary Goods with price");
                    System.out.println("1 Headphones (INR100 each)");
                    System.out.println("2 Mouse (INR50 each)");
                    System.out.println("3 Keyboard (INR75 each)");
                    System.out.print("Enter your Complementary Goods code (1, 2, 3): ");
                    String compCode = scanner.nextLine().toUpperCase();
                    System.out.print("Enter quantity: ");
                    int compQuantity = Integer.parseInt(scanner.nextLine());
                    siri.AddComplementaryGoods(compCode, compQuantity);
                    break;
                case "P":
                	System.out.println("\nPayment Module");
                    System.out.println("D Display total amount");
                    System.out.println("M Main Menu");
                    System.out.print("Enter your Module code (D, T, M): "); 
                    String moduleInput2 = scanner.nextLine().toUpperCase();
                    switch (moduleInput2) {
        
	                    case "D":
	                    	siri.DisplayTotalCost();
	                       
	                    	break;
	
	                    case "M":
	                    	break;
	                        
	                    default:
	                        System.out.println("Invalid input. Please try again.");
	                }
	                break;
                case "R":
                    System.out.println("\nReport of the purchased goods");
                    System.out.println("I Display invoice");
                    System.out.println("S Display summary of orders and payments");
                    System.out.println("M Main Menu");
                    System.out.print("Enter your Module code (I, S, M): ");   
                    String moduleInput3 = scanner.nextLine().toUpperCase();
                    switch (moduleInput3) {
        
	                    case "I":
	                        siri.DisplayGadgetsCost();
	                        siri.AddComplementaryGoodsCost();
	                        siri.DisplayTotalCost();
	                       
	                    	break;
	
	                    case "S":
	                        siri.DisplayGadgetsCost();
	                        siri.AddComplementaryGoodsCost();
	                        siri.DisplayTotalCost();
	                        
	                        break;
	
	                    case "M":
	                    	break;
	                        
	                    default:
	                        System.out.println("Invalid input. Please try again.");
	                }
 
                    break;
                case "E":
                    System.out.println("THANK YOU FOR SHOPPING WITH US. PLEASE VISIT OUR WEBSITE AGAIN!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
