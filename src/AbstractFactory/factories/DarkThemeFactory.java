package AbstractFactory.factories;

import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.Checkbox;
import AbstractFactory.interfaces.TextField;
import AbstractFactory.interfaces.UIComponentFactory;
import AbstractFactory.themes.DarkButton;
import AbstractFactory.themes.DarkCheckbox;
import AbstractFactory.themes.DarkTextField;

public class DarkThemeFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
