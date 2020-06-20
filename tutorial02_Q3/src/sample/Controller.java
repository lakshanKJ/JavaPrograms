package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private Label lb1;

    public void addition(){
        try{
            int v1 = Integer.parseInt(tf1.getText());
            int v2 = Integer.parseInt(tf2.getText());

            int v3 = v1 + v2;

            lb1.setText("The sum is: "+v3);

        } catch (Exception ex) {
            System.out.println("Oops! Something went wrong!");
        }
    }
}
