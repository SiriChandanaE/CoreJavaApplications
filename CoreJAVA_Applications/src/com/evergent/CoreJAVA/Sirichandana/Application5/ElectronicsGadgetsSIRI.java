package com.evergent.CoreJAVA.Sirichandana.Application5;
public class ElectronicsGadgetsSIRI extends GadgetsBaseClass implements ElectronicsGadgetsInterface {
    private static final int LAPTOP_COST = 1000;
    private static final int TELEVISION_COST = 800;
    private static final int TABLET_COST = 500;
    private static final int MOBILE_COST = 200;
    @Override
    public void AddGadegts(String type, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        switch (type.toUpperCase()) {
            case "L":
                gadgetCost += quantity * LAPTOP_COST;
                System.out.println("Added " + quantity + " Laptops to cart.");
                break;
            case "T":
                gadgetCost += quantity * TELEVISION_COST;
                System.out.println("Added " + quantity + " Televisions to cart.");
                break;
            case "TA":
                gadgetCost += quantity * TABLET_COST;
                System.out.println("Added " + quantity + " Tablets to cart.");
                break;
            case "MP":
                gadgetCost += quantity * MOBILE_COST;
                System.out.println("Added " + quantity + " Mobile Phones to cart.");
                break;
            default:
                System.out.println("Invalid gadget type.");
        }
    }
    @Override
    public void DisplayGadgetsCost() {
        System.out.println("Total Gadget Cost: INR " + gadgetCost);
    }
    @Override
    public void DisplayTotalCost() {
        int totalAmount = CalculationTotalCost();
        int discount = 0;
        if (totalAmount > 2000) {
            discount = (int) (totalAmount * 0.10); // 10% discount
        } else if (totalAmount > 1000) {
            discount = (int) (totalAmount * 0.05); // 5% discount
        }
        int finalAmount = totalAmount - discount;
        System.out.println("Total Cost: INR " + totalAmount);
        System.out.println("Total Cost after Discount: INR " + finalAmount);
    }
    @Override
    public void AddComplementaryGoods(String type, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
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
    @Override
    public void AddComplementaryGoodsCost() {
        System.out.println("Total Complementary Goods Cost: INR " + complementaryGoodsCost);
    }
}