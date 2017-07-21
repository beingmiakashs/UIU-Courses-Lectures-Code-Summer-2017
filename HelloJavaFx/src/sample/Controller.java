package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label statusLabel;

    public void clickMeFunc(ActionEvent actionEvent) {

        statusLabel.setText("Click event occured.");
    }
}
