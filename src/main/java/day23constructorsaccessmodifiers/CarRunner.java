package day23constructorsaccessmodifiers;

public class CarRunner {
    public static void main(String[] args) {
        Car car1= new Car();
        System.out.println(car1.model);

        Car car2= new Car();
        System.out.println(car2.make);

        Car car3= new Car("Honda", "CRV",2023, 35000);
        System.out.println(car3.price);
    }
}
