package Que_05;

import java.util.Scanner;

public class MyJavaLoFatBurgers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

        String[] sides = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

        String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};


        System.out.println("Choose an Entree:");
        displayMenu(entrees, entreePrices);
        int entreeChoice = scanner.nextInt();

        System.out.println("Choose a Side Dish:");
        displayMenu(sides, sidePrices);
        int sideChoice = scanner.nextInt();


        System.out.println("Choose a Drink:");
        displayMenu(drinks, drinkPrices);
        int drinkChoice = scanner.nextInt();


        double total = entreePrices[entreeChoice - 1] + sidePrices[sideChoice - 1] + drinkPrices[drinkChoice - 1];


        System.out.println("\nYour Order Summary:");
        System.out.println("Entree: " + entrees[entreeChoice - 1] + " - $" + entreePrices[entreeChoice - 1]);
        System.out.println("Side Dish: " + sides[sideChoice - 1] + " - $" + sidePrices[sideChoice - 1]);
        System.out.println("Drink: " + drinks[drinkChoice - 1] + " - $" + drinkPrices[drinkChoice - 1]);
        System.out.printf("Total Price: $%.2f\n", total);

        scanner.close();
    }


    public static void displayMenu(String[] items, double[] prices) {
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i + 1, items[i], prices[i]);
        }
        System.out.print("Enter your choice (1-" + items.length + "): ");
    }
}
