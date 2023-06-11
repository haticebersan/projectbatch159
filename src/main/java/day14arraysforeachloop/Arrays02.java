package day14arraysforeachloop;


import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1 : Type code lets user enter many students names into an array
        //     Whenever user wants he should be able to quit
        //  When I quit or complete I should be able to see all elements on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students you want to add...");
        int n = input.nextInt();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter" + (i + 1) + ". student name, to quit press 'q'");

            String stdName = input.next();
            if (!stdName.equalsIgnoreCase("Q")) {
                names[i] = stdName;
            } else {
                break;
            }
        }
        for (String w : names) {
            if (w == null) {
                System.out.println(w + " ");
            }
        }
    }
}
