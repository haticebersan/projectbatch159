package day29collections;



import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        /*
        1)Sometimes we need to work first added element should be given out of the queue as the first element.
        For example like in a bank queue the first customer should be called out.
        For that kind of scenarios we prefer to use "Queue"s because "Queue"s are expert for "First In First Out"(FIFO) operations.

        Note 1:When you create a "Queue" if you use LinkedList Constructor, the elements will be in insertion order
        Note 2:When you create a "Queue" if you use "Priority Queue Constructor". the elements will be in an order you can create.
              We will learn how to create our own logic to put elements
       2)Sometimes we need to work with first added element and last added element in a collection
       It means we need to work double ended
       Create Deque(Double Ended Queue) and use methods with double ends like removeFirst() and removeLast().

         */

        Queue<String> food= new LinkedList<>();

        food.add("Milk");
        food.add("Cheese");
        food.add("Meat");
        food.add("Yoghurt");
        food.add("Jam");

        System.out.println(food);//[Milk, Cheese, Meat, Yoghurt, Jam]-->insertion order

        PriorityQueue<String> myFood= new PriorityQueue<>();

        myFood.add("Milk");
        myFood.add("Cheese");
        myFood.add("Meat");
        myFood.add("Yoghurt");
        myFood.add("Jam");

        System.out.println(myFood);

        Deque<String> yourFood= new LinkedList<>();
        yourFood.add("Milk");
        yourFood.add("Cheese");
        yourFood.add("Meat");
        yourFood.add("Yoghurt");
        yourFood.add("Jam");

        System.out.println("yourFood = " + yourFood);





    }


}