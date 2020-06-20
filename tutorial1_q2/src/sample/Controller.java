package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller {

    @FXML
    private Label lb1;

    private String content;

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's on your mind?");

        content = sc.nextLine();
    }


    public void clickme(){

        lb1.setText(content);
    }

    public void printback(){
        System.out.println(content);
    }

}

