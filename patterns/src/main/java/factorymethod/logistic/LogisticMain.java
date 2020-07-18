package factorymethod.logistic;

public class LogisticMain {

    private static Logistic logistic;

    public static void main(String[] args) {
        config(args);
        runBusiness();
    }

    private static void config(String args[]) {
        if (args[0].equals("sea")) {
            logistic = new SeaLogistic();
        } else
            logistic = new RoadLogistic();
    }

    private static void runBusiness() {
        logistic.deliver();
    }
}
