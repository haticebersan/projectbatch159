package practice01;

import java.util.Scanner;

public class Q02 {
      /*
   Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
   A perfect number is a positive integer that is equal to the sum of all its proper divisors.
   6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int sum=0;

        int number= input.nextInt();

        for (int i=1; i<number; i++){
            if (number%i ==0){
                sum+=1;

            }
        }
        if (sum==number){
            System.out.println( number + " is Perfect Number ");
        }else {
            System.out.println(number + " is Not Perfect Number");
        }









    }
}
