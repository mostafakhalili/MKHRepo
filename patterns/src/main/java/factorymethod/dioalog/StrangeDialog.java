package factorymethod.dioalog;

import factorymethod.dioalog.button.Button;
import factorymethod.dioalog.button.StrangeButton;

public class StrangeDialog extends Dialog{
    @Override
    protected Button createWindow() {
        return new StrangeButton();
    }
}
