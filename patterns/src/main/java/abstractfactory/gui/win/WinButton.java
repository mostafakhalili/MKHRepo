package abstractfactory.gui.win;

import abstractfactory.gui.Button;

public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("win Button rendered");
    }
}
