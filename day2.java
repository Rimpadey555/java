// Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

// Example
// meal_cost=100;
// tip_percent=15;
// tax_percent=8
// A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value and return from the function.

// Function Description
// Complete the solve function in the editor below.

// solve has the following parameters:

//     int meal_cost: the cost of food before tip and tax
//     int tip_percent: the tip percentage
//     int tax_percent: the tax percentage

// Returns The function returns nothing. Print the calculated value, rounded to the nearest integer. 

import java.util.Scanner;

class calculation {
    public static void total_cost(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;
        double cost = (meal_cost + tip + tax);
        int final_cost = (int) (cost);
        System.out.println(final_cost);

    }

}

public class day2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meal cost:");
        double meal_cost = sc.nextDouble();
        System.out.print("Enter tip percentage:");
        int tip_percent = sc.nextInt();
        System.out.print("Enter tax percentage:");
        int tax_percent = sc.nextInt();

        calculation.total_cost(meal_cost, tip_percent, tax_percent);
        sc.close();

    }

}