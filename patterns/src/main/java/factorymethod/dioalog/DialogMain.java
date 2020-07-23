package factorymethod.dioalog;

import factorymethod.logistic.RoadLogistic;
import factorymethod.logistic.SeaLogistic;

public class DialogMain {

    private static Dialog dialog;

    public static void main(String[] args) {
        config(args);
        runBusiness();
    }

    private static void config(String args[]) {
        if (args[0].equals("windows")) {
            dialog = new WindowsDialog();
        } else if (args[0].equals("HTML"))
            dialog = new HTMLDialog();
        else
            dialog = new StrangeDialog();
    }

    private static void runBusiness() {
        dialog.render();
    }
}
