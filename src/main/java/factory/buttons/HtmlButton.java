package factory.buttons;

import factory.interfaces.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>TO JEST PRZYCISK </button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Przycisk klikniety");

    }
}
