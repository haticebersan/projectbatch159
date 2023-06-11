package day27encapsulationabstraction;
/*
 Interview Questions
         1)What is the difference between "Method Overloading" and "Method Overriding"?
         i) "Method Overriding" needs "inheritance" but "Method Overloading" does not need "inheritance"
         "inheritance" is prerequisite for "Method Overriding"
         ii) "Method Overriding" does not change method signature, but "Method Overloading" changes
         "Method Overriding" changes the body of the method, "Method Overloading" changes the parameter.
         iii) "private method"s can be Overloaded, but cannot be Overridden.
         Because "Method Overloading" happens in a single class, to be private if you are in a single class does not affect anything.
        "Method Overriding" happens in different classes so to be private matters.
        iv)"static method"s cannot be overridden but can be overloaded.
        Because "static method"s are common for all objects, if you change the implementation by using a single object, other objects will be affected as well
        this can create issue in our application, that is why Java does not let us override static methods.

        Can you override "main method"?
        No because it is static.

        Note 1: Other name of "Method Overloading" is "Static Polymorphism"
        Other name of "Method Overriding" is "Dynamic Polymorphism"

        Note 2: Could you explain "final" keyword?
        "final" keyword can be used for i)variables  ii)Methods  iii)Classes
        i)If you use "final" keyword for a variable
        a)You have to initialize(Assign value) the variable
        b)You cannot change the initial value
        ii)If you use "final" keyword for a method, its body cannot be updated
        Because of that "final methods" cannot be overridden.
        iii)If you use "final" keyword for a class, the class cannot have a child class.
        "final class" can be a child class, but it cannot have a child class.
        v) "final method"s cannot be overridden but can be overloaded.
        Because, in overriding we change the method body, but final methods do not let us change the method body.
        */



public class Student {
    private String stdId = "TH2023FL";
    private boolean success=true;

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }


public boolean isSuccess(){
        return isSuccess();
}
}
//2.Way

