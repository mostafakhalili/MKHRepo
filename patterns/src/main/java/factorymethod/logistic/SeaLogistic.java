package factorymethod.logistic;

import factorymethod.logistic.transport.Ship;
import factorymethod.logistic.transport.Transport;

public class SeaLogistic extends Logistic {
    public Transport createTransport() {
        return new Ship();
    }
}
