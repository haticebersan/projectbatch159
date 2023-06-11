package exercisesfromquestionbook;

import java.util.ArrayList;
import java.util.List;

public class Switch01 {
    public static void main(String[] args) {

        //Example 3:Type a code which prints the all month names starting with the given month numbers.
        // Example: If the month number is 9 output will be September October November December

        List<String> futureMonths = new ArrayList<>();
        int month= 10;
        switch (month) {
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else{
            for (String monthName : futureMonths) {
                System.out.print(monthName + " ");
            }
        }

        System.out.println();

        //Example 4 : Print "Boy" if the gender is "Male" (Ignore cases)
        // Print "Girl" if the gender is "Female" (Ignore cases)
        //Print "Others" if the gender is different from "Male" and "Female"

        String gender = "Female";
        switch (gender.toLowerCase()){
            case "female":
                System.out.println("Girl");
                break;
            case "male":
                System.out.println("Boy");
                break;
            default:
                System.out.println("Others");
        }

        //Example 5: Type a code to display the number of days in a given month of a given year.
        // Example: The number of days in February of 2000 was 29.

        int month1 = 2;
        int year = 2000;
        int numDays = 0;

        switch (month1) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                }else {
                    numDays = 28;
                }
                break; default:
                System.out.println("Invalid month.");
                break; }
        System.out.println("Number of Days = " + numDays);
    }
}

