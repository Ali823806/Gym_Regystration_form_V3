package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;

public class AfterLogin {
    @FXML
    private Button logout;

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }
}
