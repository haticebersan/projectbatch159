package day28interfacecollections;

public interface Engine extends Details {
    void run();

    int volume=6;

    int weight();

    default void eco(){
        System.out.println("Honda engines are economic");
    }
    private void hybridEco(){
        System.out.println("Honda uses hybrid eco engines");
    }

}
