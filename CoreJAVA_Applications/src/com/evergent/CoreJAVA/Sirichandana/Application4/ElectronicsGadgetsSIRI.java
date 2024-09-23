package com.evergent.CoreJAVA.Sirichandana.Application4;

public class ElectronicsGadgetsSIRI extends GadgetsBaseClass implements ElectronicsGadgetsInterface {
    static int laptopCost = 1000;
    static int televisionCost = 800;
    static int tabletCost = 500;
    static int mobileCost = 200;
    
    static int gadgetCost = 0;
    static int complementaryGoodsCost = 0;
    static int totalAmount = 0;
    static int discount = 0;

	public void AddGadegts(String type, int quantity) {
        switch (type.toUpperCase()) {
        case "L":
            gadgetCost += quantity * laptopCost;
            System.out.println("Added " + quantity + " Laptops to cart.");
            break;
        case "T":
            gadgetCost += quantity * televisionCost;
            System.out.println("Added " + quantity + " Televisions to cart.");
            break;
        case "TA":
            gadgetCost += quantity * tabletCost;
            System.out.println("Added " + quantity + " Tablets to cart.");
            break;
        case "MP":
            gadgetCost += quantity * mobileCost;
            System.out.println("Added " + quantity + " Mobile Phones to cart.");
            break;
        default:
            System.out.println("Invalid gadget type.");
        }
	}

	public void DisplayGadgetsCost() {
		System.out.println("Total Gadget Cost: INR" + gadgetCost);
	}

	public void DisplayTotalCost() {
        totalAmount = gadgetCost + complementaryGoodsCost;
        if (totalAmount > 2000) {
            discount = (int) (totalAmount * 0.10); // 10% discount
        } else if (totalAmount > 1000) {
            discount = (int) (totalAmount * 0.05); // 5% discount
        } else {
            discount = 0; // No discount
        }

        int finalAmount = totalAmount - discount;
        System.out.println("Total Cost: INR" +totalAmount);
        System.out.println("Total Cost after Discount: INR" +finalAmount);
	}

	public void AddComplementaryGoods(String type, int quantity) {
        switch (type.toUpperCase()) {
        case "1":
            complementaryGoodsCost += quantity * 100; // Headphones
            System.out.println("Added " + quantity + " Headphones to cart.");
            break;
        case "2":
            complementaryGoodsCost += quantity * 50; // Mouse
            System.out.println("Added " + quantity + " Mice to cart.");
            break;
        case "3":
            complementaryGoodsCost += quantity * 75; // Keyboard
            System.out.println("Added " + quantity + " Keyboards to cart.");
            break;
        default:
            System.out.println("Invalid complementary goods type.");
        }
	}

	public void AddComplementaryGoodsCost() {
		System.out.println("Total Complementary Goods Cost: INR" + complementaryGoodsCost);
	}
}