package day28interfacecollections;

public interface Brake {


    int price();

    int volume=7;

    int weight();

    static void secure(){
        System.out.println("Brakes work securely");
    }
}
