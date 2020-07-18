package factorymethod.logistic;

import factorymethod.logistic.transport.Transport;
import factorymethod.logistic.transport.Truck;

public class RoadLogistic extends Logistic {
    public Transport createTransport() {
        return new Truck();
    }
}
