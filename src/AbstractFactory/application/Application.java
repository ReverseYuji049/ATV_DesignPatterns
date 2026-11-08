package AbstractFactory.application;

import AbstractFactory.factories.DarkThemeFactory;
import AbstractFactory.factories.LightThemeFactory;
import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.Checkbox;
import AbstractFactory.interfaces.TextField;
import AbstractFactory.interfaces.UIComponentFactory;

public class Application {
    static void main() {
        System.out.println("=== Tema Claro ===");
        UIComponentFactory lightTheme = new LightThemeFactory();
        renderizar(lightTheme);
        System.out.println("=== Tema Escuro ===");
        UIComponentFactory darkTheme = new DarkThemeFactory();
        renderizar(darkTheme);
    }
    public static void renderizar(UIComponentFactory factory) {
        Button button = factory.createButton();
        button.render();
        TextField textField = factory.createTextField();
        textField.render();
        Checkbox checkbox = factory.createCheckbox();
        checkbox.render();
    }
}

