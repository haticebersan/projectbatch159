package day27encapsulationabstraction;
/*
1)method without body is called "abstract method"
2)Sometimes no child uses the body od a method in the parent class so
no need to put body for the method.
If you do not put body for the method it means you are creating "abstract method"
3)To create an abstract method
i)Do not type the body of the method.
ii)Use "abstract" keyword between "access modifier" and "return type"
iii)Make the class abstract
4)What is the difference between "abstract method"s and regular(concrete) method"s?
"abstract method"s focus on "what to do", concrete method"s focus on "what to do" and "how to do"
5)"abstract method"s must be overridden y the child classes, otherwise Java complains.
Because of that, if we want some functionalities to be mandatory for the child classes
we make them abstract.
6)An "abstract class" can have "abstract method"s, can an abstract class have "concrete method"?
Yes, "abstract class" can have both "abstract method"s and "concrete method"s

 */

public abstract class Courses {
    public abstract void math();

    public  void art(){
        System.out.println("Learn painting");
    }
}
