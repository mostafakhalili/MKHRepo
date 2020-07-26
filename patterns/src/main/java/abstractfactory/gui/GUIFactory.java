package abstractfactory.gui;

//Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
public interface GUIFactory {

    public Button createButton();
    public CheckBox createCheckBox();
}
