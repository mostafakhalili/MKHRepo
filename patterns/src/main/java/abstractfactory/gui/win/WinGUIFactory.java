package abstractfactory.gui.win;

import abstractfactory.gui.Button;
import abstractfactory.gui.CheckBox;
import abstractfactory.gui.GUIFactory;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
