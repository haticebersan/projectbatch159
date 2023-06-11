package day25inheritanceoverriding;

public class Cat extends Animal{

    public int age =14;
    public String name="Tom";

    public boolean old=false;
    public double x=2.3;
    public boolean initial;

    public Cat(){
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
