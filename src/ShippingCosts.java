import java.util.Scanner;

public class ShippingCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";
        System.out.println("What is the price of the item?");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100) {
                shippingCost = 0;
                totalPrice = itemPrice;
                System.out.println("Shipping is free for this item.");
                System.out.println("The shipping cost is " + shippingCost + ".");
                System.out.println("The total cost is " + totalPrice + ".");
            }
            else {
                shippingCost = itemPrice * 0.02;
                totalPrice = itemPrice + shippingCost;
                System.out.println("The shipping cost is " + shippingCost + ".");
                System.out.println("The total cost with shipping is " + totalPrice + ".");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You entered an invalid price: " + trash);
        }
    }
}

