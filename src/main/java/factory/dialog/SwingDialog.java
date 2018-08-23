package factory.dialog;

import factory.Dialog;
import factory.buttons.SwingButton;
import factory.interfaces.Button;

public class SwingDialog extends Dialog {
    public Button createButton() {
        return new SwingButton();
    }
}
