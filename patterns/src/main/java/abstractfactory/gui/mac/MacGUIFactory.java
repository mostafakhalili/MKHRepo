package abstractfactory.gui.mac;

import abstractfactory.gui.Button;
import abstractfactory.gui.CheckBox;
import abstractfactory.gui.GUIFactory;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
