package factorymethod.logistic.transport;

public class Ship implements Transport {
    public void deliver() {
        System.out.println("delivering by Ship");
    }
}
