package AbstractFactory.themes;

import AbstractFactory.interfaces.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando Botão com fundo branco");
    }
}
