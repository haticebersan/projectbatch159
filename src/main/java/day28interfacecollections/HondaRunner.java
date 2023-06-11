package day28interfacecollections;

public class HondaRunner {
    /*
    What is the difference between "abstract classes" and interfaces?
    1)"interface" can have just "abstract classes" but "abstract classes" can have both "abstract" and
    "concrete" methods.
    In Java 8, Java lets us create "methods with body" by using "default" and "static" keywords
    In Java 9, Java lets us create "method with body" using "private" keyword as well

    2)"Interfaces" have "public", "static" and "final" variables, but "abstract" classes can have every type of variables
    3) A class can have just a single  "abstract class parent" but a class can have many "interface parents"
    4)Both "abstract" class and "interface" cannot have give you an object but "abstract" class have constructor "interface"
    does not have.
    5) To make an "abstract class" parent of a concrete class we use "extends" keyword
    6) To make an "interface" parent of a concrete class we use "implements" keyword

     */
    public static void main(String[] args) {
        System.out.println(Engine.volume);


        System.out.println(Brake.volume);

        System.out.println(AC.volume);

        Honda myHonda=new Honda();

        myHonda.eco();

        Brake.secure();

    }
}
