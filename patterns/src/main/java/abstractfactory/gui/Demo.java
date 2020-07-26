package abstractfactory.gui;

import abstractfactory.gui.mac.MacGUIFactory;
import abstractfactory.gui.win.WinGUIFactory;

public class Demo {

    private static  Application application;
    public static void main(String[] args) {
        config(args);
        application.createUI();//

    }
    private static void config(String args[]) {
        if (args[0].equals("win"))
            application = new Application(new WinGUIFactory());
        else
            application = new Application(new MacGUIFactory());
    }
}
