package factory.buttons;

import factory.interfaces.Button;

public class DrawButton implements Button {
    public void render() {
        System.out.println("NACISNIJ OK");
        onClick();
    }

    public void onClick() {
        System.out.println("Przycisk zostal nacisniety");
    }
}
