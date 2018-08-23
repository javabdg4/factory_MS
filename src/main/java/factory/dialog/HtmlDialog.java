package factory.dialog;

import factory.Dialog;
import factory.buttons.HtmlButton;
import factory.interfaces.Button;

public class HtmlDialog extends Dialog {
    public Button createButton() {
        return new HtmlButton();
    }
}
