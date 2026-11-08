package AbstractFactory.factories;

import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.Checkbox;
import AbstractFactory.interfaces.TextField;
import AbstractFactory.interfaces.UIComponentFactory;
import AbstractFactory.themes.LightButton;
import AbstractFactory.themes.LightCheckbox;
import AbstractFactory.themes.LightTextField;

public class LightThemeFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
