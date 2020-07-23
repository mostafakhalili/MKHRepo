package factorymethod.dioalog;

import factorymethod.dioalog.button.Button;
import factorymethod.dioalog.button.WindowsButton;

public class WindowsDialog extends Dialog{
    protected Button createWindow() {
        return new WindowsButton();
    }
}
