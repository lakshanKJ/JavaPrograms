package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller {
    @FXML
    private Label lb1;

    @FXML
    private TextField tf1;

    public void clickme(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name");
//        String name = sc.nextLine();

        String ab = tf1.getText();

        lb1.setText("Hello " + ab);

    }

    public void clearContent(){
        lb1.setText("");
        tf1.setText("");
    }
}
