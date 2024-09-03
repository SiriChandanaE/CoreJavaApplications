package com.evergent.CoreJAVA.Sirichandana.Application2;

import java.io.IOException;

import java.util.Scanner;

public class ElectronicGadgets_SIRI 
{
    enum MainModule { 
    	O, P, R, E 
    	}
    
    enum OrderModule { 
    	G, C, M 
    	}
    
    enum GadgetsModule { 
    	L, T, TA, MP, M 
    	}
    
    enum PaymentModule { 
    	D, T, M 
    	}
    
    enum ReportModule { 
    	I, S, M 
    	}

    static int laptopCost = 1000;
    static int televisionCost = 800;
    static int tabletCost = 500;
    static int mobileCost = 200;
    
    static int gadgetCost = 0;
    static int complementaryGoodsCost = 0;
    static int totalAmount = 0;
    static int discount = 0;

    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n\t\t\t\t==================================");
        System.out.print("\n\t\t\t\tWELCOME TO ELECTRONIC GADGETS SIRI");
        System.out.print("\n\t\t\t\t==================================");
        
        while (true) {
        
        	System.out.println("\nElectronics Gadgets Main Menu");
            System.out.println("O Order Module");
            System.out.println("P Payment Module");
            System.out.println("R Report Module");
            System.out.println("E Exit Module");
            System.out.print("Enter your Module code (O, P, R, E): ");
           
            String moduleInput = scanner.nextLine().toUpperCase();

            switch (MainModule.valueOf(moduleInput)) {

                case O:
                    System.out.println("\nOrder Module");
                    System.out.println("G Gadgets");
                    System.out.println("C Complementary Goods");
                    System.out.println("M Main Menu");
                    System.out.print("Enter your Module code (G, C, M): ");       

                    String moduleInput1 = scanner.nextLine().toUpperCase();

                    
                    switch (OrderModule.valueOf(moduleInput1)) {

                        case G:
                            System.out.println("\nGadgets Module");
                            System.out.println("L Laptop (INR1000 each)");
                            System.out.println("T Television (INR800 each)");
                            System.out.println("Ta Tablet (INR500 each)");
                            System.out.println("Mp Mobile Phone (INR200 each)");
                            System.out.println("M Main Menu");
                            System.out.print("Enter your Gadget code (L, T, TA, MP, M): ");                           

                            String moduleInput2 = scanner.nextLine().toUpperCase();

                            
                            switch (GadgetsModule.valueOf(moduleInput2)) {

                                case L:
                                    System.out.print("Enter quantity of Laptops: ");
                                    int laptopQuantity = Integer.parseInt(scanner.nextLine());
                                    gadgetCost += laptopQuantity * laptopCost;
                                    System.out.println("Added " + laptopQuantity + " Laptops to cart.");
                                   
                                    break;

                                case T:
                                    System.out.print("Enter quantity of Televisions: ");
                                    int televisionQuantity = Integer.parseInt(scanner.nextLine());
                                    gadgetCost += televisionQuantity * televisionCost;
                                    System.out.println("Added " + televisionQuantity + " Televisions to cart.");
                                    
                                    break;

                                case TA:
                                    System.out.print("Enter quantity of Tablets: ");
                                    int tabletQuantity = Integer.parseInt(scanner.nextLine());
                                    gadgetCost += tabletQuantity * tabletCost;
                                    System.out.println("Added " + tabletQuantity + " Tablets to cart.");
                                    
                                    break;

                                case MP:
                                    System.out.print("Enter quantity of Mobile Phones: ");
                                    int mobileQuantity = Integer.parseInt(scanner.nextLine());
                                    gadgetCost += mobileQuantity * mobileCost;
                                    System.out.println("Added " + mobileQuantity + " Mobile Phones to cart.");
                                    
                                    break;

                                case M:
                                   
                                	break;
                                    
                                default:
                                    System.out.println("Invalid input. Please try again.");
                            }

                            break;


                        case C:
                            System.out.println("\nComplementary Goods Module");
                            System.out.println("1 Headphones (INR100 each)");
                            System.out.println("2 Mouse (INR50 each)");
                            System.out.println("3 Keyboard (INR75 each)");
                            System.out.println("M Main Menu");
                            System.out.print("Enter your choice (1, 2, 3, M): ");

                            String choice = scanner.nextLine().toUpperCase();

                            
                            switch (choice) {

                                case "1":
                                    System.out.print("Enter quantity of Headphones: ");
                                    int headphonesQuantity = Integer.parseInt(scanner.nextLine());
                                    complementaryGoodsCost += headphonesQuantity * 100;
                                    System.out.println("Added " + headphonesQuantity + " Headphones to cart.");
                                   
                                    break;

                                case "2":
                                    System.out.print("Enter quantity of Mouse: ");
                                    int mouseQuantity = Integer.parseInt(scanner.nextLine());
                                    complementaryGoodsCost += mouseQuantity * 50;
                                    System.out.println("Added " + mouseQuantity + " Mice to cart.");
                                    
                                    break;

                                case "3":
                                    System.out.print("Enter quantity of Keyboards: ");
                                    int keyboardQuantity = Integer.parseInt(scanner.nextLine());
                                    complementaryGoodsCost += keyboardQuantity * 75;
                                    System.out.println("Added " + keyboardQuantity + " Keyboards to cart.");
                                    
                                    break;

                                case "M":
                                    
                                	break;
                                    
                                default:
                                    System.out.println("Invalid input. Please try again.");
                            }

                            break;

                        case M:
                            
                        	break;
                            
                        default:
                            System.out.println("Invalid input. Please try again.");
                    }

                    break;

                case P:
                    totalAmount = gadgetCost + complementaryGoodsCost;
                    if (totalAmount > 2000) {
                        discount = (int) (totalAmount * 0.10); // 10% discount
                    } else if (totalAmount > 1000) {
                        discount = (int) (totalAmount * 0.05); // 5% discount
                    } else {
                        discount = 0; // No discount
                    }

                    int finalAmount = totalAmount - discount;

                    System.out.println("\nPayment Module");
                    System.out.println("D Display total amount");
                    System.out.println("T Display total amount with discount");
                    System.out.println("M Main Menu");
                    System.out.print("Enter your Module code (D, T, M): ");                  

                    String moduleInput3 = scanner.nextLine().toUpperCase();

                    
                    switch (PaymentModule.valueOf(moduleInput3)) {

                        case D:
                        	System.out.println("Total Amount before Disocunt: INR" + totalAmount);
                        	System.out.println("Total Amount after Discount: INR" + finalAmount);
                           
                        	break;

                        case T:
                            System.out.println("Total Amount with Discount: INR" + finalAmount);
                            
                            break;

                        case M:
                            
                        	break;
                            
                        default:
                            System.out.println("Invalid input. Please try again.");
                    }

                    break;


                case R:
                    System.out.println("\nReport Module");
                    System.out.println("I Display invoice");
                    System.out.println("S Display summary of orders and payments");
                    System.out.println("M Main Menu");
                    System.out.print("Enter your Module code (I, S, M): ");                   

                    String moduleInput4 = scanner.nextLine().toUpperCase();

                    
                    switch (ReportModule.valueOf(moduleInput4)) {

                        case I:
                            System.out.println("Invoice:");
                            System.out.println("Gadget Cost: INR" + gadgetCost);
                            System.out.println("Complementary Goods Cost: INR" + complementaryGoodsCost);
                            System.out.println("Total Cost before Discount: INR" + totalAmount);
                            System.out.println("Discount: INR" + discount);
                            System.out.println("Total Cost after Discount: INR" + (totalAmount - discount));
                           
                            break;

                        case S:
                            System.out.println("Summary:");
                            System.out.println("Gadget Cost: INR" + gadgetCost);
                            System.out.println("Complementary Goods Cost: INR" + complementaryGoodsCost);
                            System.out.println("Total Cost before Discount: INR" + totalAmount);
                            System.out.println("Discount: INR" + discount);
                            System.out.println("Total Cost after Discount: INR" + (totalAmount - discount));
                            
                            break;

                        case M:
                           
                        	break;

                        default:
                            System.out.println("Invalid input. Please try again.");
                    }

                    break;

                case E:
                    System.out.println("THANK YOU FOR SHOPPING WITH US. PLEASE VISIT OUR WEBSITE AGAIN!");
                    System.exit(0);
                    
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }

        }

    }
}
