package abstractfactory.gui.mac;

import abstractfactory.gui.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("mac CheckBox rendered");
    }
}
