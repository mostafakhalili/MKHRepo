package abstractfactory.gui;

import abstractfactory.gui.mac.MacGUIFactory;
import abstractfactory.gui.win.WinGUIFactory;

public class Application {


    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }


    public void createUI() {
        button.render();
        checkBox.render();
    }








}
