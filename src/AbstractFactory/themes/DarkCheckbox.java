package AbstractFactory.themes;

import AbstractFactory.interfaces.Checkbox;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema escuro");
    }
}
