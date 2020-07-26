package abstractfactory.gui.win;

import abstractfactory.gui.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("win CheckBox rendered");
    }
}
