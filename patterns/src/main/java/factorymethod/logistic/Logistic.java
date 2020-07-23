package factorymethod.logistic;

import factorymethod.logistic.transport.Transport;


/*
--creating an interface for instantiating objects but allows subclasses for type selection)(initiate)(**alter) for concrete object
  so we can alter type of class anytime just by altering one place (subclass in this example RoadLogistic and SeaLogistic);

--when we dont know type of concrete classes that we work with

--***in transportation example we can add other type of transportation later.

--in simple factory pattern object initiate only in one place and we retrieve it by passing param(string)
--in factory method we deliver initiating to subclasses by "factory method" [[and we can call target Business(deliver) in only one place(Logistic.deliver) for all objects]]

{
-- when using pattern:
1- Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
2- Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
3- Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.
}
*/

public abstract class Logistic {


    public void deliver() {
        Transport transport = this.createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();

}
