package exercisesfromquestionbook;

public class TypeCasting {
    public static void main(String[] args) {


    //Create a short variable and convert it to an int variable
        short age = 14;
        int newAge=age;



    //Create a long variable and convert it to an int variable
        long age1= 23L;
        int newAge1=(int) age1;
        System.out.println(newAge1);



    //Create a double variable and convert it to a float variable
        double price = 4.99;
        float newPrice=(float) price;
        System.out.println(newPrice);


    //Create a double variable and convert it to a short variable, then print the value of the short
    //variable on the console. Be careful about the output, it will not be a decimal value.
        double number = 56.99;
        short newNumber=(short) number;
        System.out.println(newNumber);//56






    //Create a byte variable and convert it to a double variable, then print the value of the double
    //variable on the console. Be careful about the output, it will be a decimal number
        byte a =14;
        double a1=a;
        System.out.println(a1);//14.0




}
}