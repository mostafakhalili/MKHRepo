package factorymethod.dioalog;

import factorymethod.dioalog.button.Button;
import factorymethod.dioalog.button.HTMLButton;

public class HTMLDialog extends Dialog{
    protected Button createWindow() {
        return new HTMLButton();
    }
}
