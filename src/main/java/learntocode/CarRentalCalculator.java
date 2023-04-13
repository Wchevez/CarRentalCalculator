package learntocode;

import java.util.Scanner;

public class CarRentalCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for pickup date
        System.out.print("Enter pickup date (mm/dd/yyyy): ");
        String pickupDate = input.nextLine();

        // Prompt user for number of rental days
        System.out.print("Enter number of rental days: ");
        int rentalDays = input.nextInt();

        // Prompt user for electronic toll tag
        System.out.print("Do you want an electronic toll tag (yes/no)? ");
        String tollTag = input.next();

        // Prompt the user for a gps
        System.out.println("Do you want a gps (yes/no)? ");
        String gps = input.next();

        // Prompt the user for roadside assistance
        System.out.println("Do you want roadside assistance (yes/no)? ");
        String roadsideAssistance = input.next();

        //Prompt the user for their current age
        System.out.println("Your current age");
        int age = input.nextInt();

        double baseRentalCost = rentalDays * 29.99; // base rental cost is $29.99 per day
        double optionsCost = 0;

        if (tollTag.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 3.95; // add $3.95 per day for toll tag
        }

        if (gps.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 2.95; // add $2.95 per day for GPS
        }

        if (roadsideAssistance.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 3.95; // add $3.95 per day for roadside assistance
        }

        double totalCost = baseRentalCost + optionsCost;

        if (age < 25) {
            totalCost += baseRentalCost * 0.3; // add 30% surcharge for drivers under 25
        }

        // Print rental details
        System.out.println("\nRental Details:");
        System.out.println("Pickup date: " + pickupDate);
        System.out.println("Rental days: " + rentalDays);
        System.out.println("Electronic toll tag: " + tollTag);
        System.out.println("GPS: " + gps);
        System.out.println("Roadside assistance: " + roadsideAssistance);
        System.out.printf("Base rental cost: $%.2f%n", baseRentalCost);
        System.out.printf("Options cost: $%.2f%n", optionsCost);
        System.out.printf("Underage driver surcharge: $%.2f%n", age < 25 ? baseRentalCost * 0.3 : 0);
        System.out.printf("Total cost: $%.2f%n", totalCost);

    }
}
