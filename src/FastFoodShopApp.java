package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class FastFoodShopApp {
    public static void main(String agrs[]) {
//        Date
        Date date = new Date();
//        Menu Items
        ArrayList <MenuItem> menu = new ArrayList<>();
        menu.add(new Burger());
        menu.add(new Pizza());
        menu.add(new Drinks());

//      Customer detail
        String customerName, contactNumber;
//        Customer order
        ArrayList <OrderItem> order = new ArrayList<>();

//        Get Cutomer Details
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the FastFood Shop");
        System.out.println("Enter Your Name Sir : ");
        customerName = sc.nextLine();
        System.out.println("Enter your phone number ");
        contactNumber = sc.nextLine();

        displayMenu(menu);
        takeOrder(menu,order);
        printOrder(customerName,contactNumber, date,order);

    }


    private static void takeOrder(ArrayList <MenuItem> menu, ArrayList <OrderItem> order) {
        Scanner sc = new Scanner(System.in);
        for (MenuItem menuItem : menu){
            System.out.println("Enter Quantity for "+ menuItem.getName()+ ":");
            int quantity = sc.nextInt();
            order.add(new OrderItem(menuItem,quantity));
        }
    }

    private static void displayMenu(ArrayList <MenuItem> menu){
        System.out.println("Menu:");
        for (MenuItem menuItem :menu){
            System.out.println(menuItem);
        }
    }

    private static void printOrder(String customerName, String contactNumber, Date date, ArrayList <OrderItem> order){

        System.out.println("WELCOME TO FASTFOOD X");
        System.out.println("\nOrder Slip:");
        System.out.println("Date: " + date);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Phone : " + contactNumber);

        double total = 0.0;

        for (OrderItem orderItem:order){
            System.out.println(orderItem);
            total += orderItem.getItemTotal();
        }

        System.out.println("Total : $" + total);
    }
}
