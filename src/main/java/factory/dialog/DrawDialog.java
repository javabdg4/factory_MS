package factory.dialog;

import factory.Dialog;
import factory.buttons.DrawButton;
import factory.interfaces.Button;

public class DrawDialog extends Dialog {
    public Button createButton() {
        return new DrawButton();
    }
}
