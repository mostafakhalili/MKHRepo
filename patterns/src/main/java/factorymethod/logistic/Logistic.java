package factorymethod.logistic;

import factorymethod.logistic.transport.Transport;


/*
--creating an interface for instantiating objects but allows subclasses for type selection(**alter) for concrete object
  so we can alter type of class anytime just by altering one place (subclass in this example RoadLogistic and SeaLogistic);

--when we dont know type of concrete classes that we work with

--***in transportation example we can add other type of transportation later.
*/

public abstract class Logistic {


    public void deliver() {
        Transport transport = this.createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();

}
