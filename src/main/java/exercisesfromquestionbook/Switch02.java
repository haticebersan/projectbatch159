package exercisesfromquestionbook;

public class Switch02 {
    public static void main(String[] args) {

        //Example 6: Use switch statement to create a simple calculator which does
        // addition, subtraction, multiplication, and division with any 2 numbers

        //a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the console
        //b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the console
        //c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the console
        //d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the console
        //e) When user entered 10 and -5 and operation different from +, -, *, / your code should print "That operation cannot be done"


        double a = 10.2;
        double b = 5;
        String operator = "+";
        switch (operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }


        //Example 7: Use switch statement to create a converter which converts mile to km, second to hour, fahrenheit to celsius.
        // Find the formulas for conversions from Google.

        //a) When user entered 10 and mileToKm String, your code should print "16 km" (The number will be dynamic) on the console
        //b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The number will be dynamic) on the console
        //c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333 Celsius"(The number will be dynamic) on the console
        //d) When user entered operation different from mileToKm, secondsToHours, fahrenheitTo- Celsius your code should print "That operation was not defined for that converter"

        double mile = 10;
        double second = 10800;
        double fahrenheit = 85;

        String opr =  "fahrenheitToCelsius";
        switch (opr){
            case "mileToKm":
                System.out.println(mile*1.60934);
                break;
            case "secondToHours":
                System.out.println(second/3600);
                break;
            case "fahrenheitToCelsius":
                System.out.println((fahrenheit-32)*5/9);
                break;
            default:
                System.out.println("That operation was not defined for that converter");

        }

    }
}
