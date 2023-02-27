package com.mycompany.authenticating;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button primaryButton;
    @FXML
    private Label label;

    @FXML
    private void switchToSecondary() throws IOException {
        
        String user = username.getText();
        String pass = password.getText();
        
        if(user.equals("admin") && pass.equals("123"))
        {
            App.setRoot("secondary");
        }
        else
        {
            label.setText("Invalid Entry");
        }
    }
}
