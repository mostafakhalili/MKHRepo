package factorymethod.dioalog;

import factorymethod.dioalog.button.Button;

public abstract class Dialog {

    public void render(){
        Button button = createWindow();
        button.render();
    }

    protected abstract Button createWindow();
}
