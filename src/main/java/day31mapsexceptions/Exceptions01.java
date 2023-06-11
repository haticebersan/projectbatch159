package day31mapsexceptions;




public class Exceptions01 {

    public static void main(String[] args) {

        System.out.println(divide1(6, 2));
        System.out.println(divide1(0, 2));
        System.out.println(divide1(5, 0));
        System.out.println("I am here");

        System.out.println(divide2(5, 0));

    }

    //Example 1: Create a method divides two integers
    //1.Way: Not recommended
    public static int divide1(int a, int b){
        if(b==0){
            System.out.println("Do not divide a number by zero");
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Recommended
    public static int divide2(int a, int b){

        int result = 0;

        try{
            result = a/b;
        }catch(ArithmeticException e){
            System.out.println("Do not divide a number by zero");
        }
        return result;
    }

}