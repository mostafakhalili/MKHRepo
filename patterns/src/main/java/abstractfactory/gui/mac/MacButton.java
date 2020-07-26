package abstractfactory.gui.mac;

import abstractfactory.gui.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("mac Button rendered");
    }
}
