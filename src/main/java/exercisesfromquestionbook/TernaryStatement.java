package exercisesfromquestionbook;

public class TernaryStatement {

        public static void main(String[] args) {
            //Example 1: Use ternary to print "Valid Password" if the password has at least 8 characters different from space characters.
            // "Invalid Password" if the password has less than 8 characters different from space character

            String psw = "123 ABcdE";
            psw = psw.toLowerCase();
            String validPsw = psw.replaceAll("\\s","").length()>7 ? "Valid password" : "Invalid password";
            System.out.println(validPsw);

            //Example 2: Use ternary to print
            //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
            //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
            //c) "Neither isosceles'', nor equilateral" if a and b conditions are not satisfied

            int a = 3;
            int b = 3;
            int c = 3;

            String typeOfTriangle = a==b && b==c ? "Equilateral Triangle" :
                    (a==b && b!=c || a==c && b!=c || b==c && a!=c ? "Isosceles Triangle" : "Neither isosceles");
            System.out.println(typeOfTriangle);


            //Example 3:Use ternary to print
            //a) "Round up by last digit" and print the rounded value if the last digit of an integer is
            // greater than or equal to 5
            //b) "Round down by last digit" and print the rounded value if the last digit of an integer is less than 5
            //For example; 127 will be rounded up and the value will be 130 125 will be rounded up and the value will be 130
            //123 will be rounded down and the value will be 120

            int d = 123;
            String result = d%10>=5  ?  ("Round up : " + (d/10 + 1)*10) : ("Round down : " + (d/10)*10);
            System.out.println(result);


            //Example 4:Type Apex code by using nested ternary.
            //Write a program to check if a year is a leap year or not.
            //If the year is divisible by 100 then it must be divisible by 400.
            // If a year is not divisible by 100 then it must be divisible by 4.

            int year = 2000;
            String isChangeYear= (year%100==0) ? ((year%400==0) ? ("Leap year") : ("Not Leap Year")) : ((year%4==0) ? ("Leap year") : ("Not Leap Year"));
            System.out.println(isChangeYear);


            //Example 5: Type code to check the password
            //If it has more than 8 characters, initial should be 'i'
            //If it does not have more than 8 characters initial should be 'K'
            // Solve the task by using nested-ternary

            String e =  "KXXXXkX";
            String f =  e.length()>8 ? (e.startsWith("i") ? "Valid password" : "Invalid password") : (e.startsWith("K") ? "Valid password" : "Invalid password");
            System.out.println(f);

            //Example 6: Type code to calculate the absolute value of a number
            //For positive numbers and zero absolute value is the same with the number
            //For negative numbers to find absolute value multiply the number by -1

            int g = -15;
            int result1 = g<0 ? -1*g : g;
            System.out.println(result1);

            //Example 7:Write a program to print the minimum of 2 integers on the console by using ternary.

            int h = 14, j=17;
            int result2 = h<j ? h:j;
            System.out.println(result2);


            //Example 8: If the number has 3 digits, the output will be "This number has 3 digits.
            // " Otherwise, the output will be "This number has no 3 digits."

            int k = 98;
            k = Math.abs(k);
            String l = (k>99 && k<1000 ) ?"This number has 3 digits" : "This number has no 3 digits";
            System.out.println(l);


            //Example 9: Print 'Even' for even integers, print 'Odd' for odd integers by using ternary

            int m = -15;
            m =Math.abs(m);
            String newM = m%2==0 ? "Even" : "Odd";
            System.out.println(newM);


            //Example 10:If the number is positive print 'Positive', otherwise print
            // 'Not positive' on the console by using ternary.

            int p = -9;
            String newP = p>0 ? "Positive" : "Negative";
            System.out.println(newP);









        }

    }



