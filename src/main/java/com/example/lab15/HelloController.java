package com.example.lab15;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label label;

    @FXML
    private TextField textField;

    @FXML
    protected void handleButtonAction(javafx.event.ActionEvent actionEvent) {
        String input = textField.getText().trim().replace(" ", "");
        label.setText("There are " + input.length() + " characters in what you typed.");
    }
}
