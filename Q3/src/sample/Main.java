package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello World");
        primaryStage.show();
        Label lb1= new Label("Title:");
        lb1.setLayoutX(0);
        lb1.setLayoutY(30);
        TextField tf1= new TextField();
        tf1.setLayoutY(50);
        tf1.setLayoutX(0);

        Label lb2=new Label("First Name:");
        lb2.setLayoutY(80);
        lb2.setLayoutX(0);
        TextField tf2= new TextField();
        tf2.setLayoutY(100);
        tf2.setLayoutX(0);

        Label lb3= new Label("Last Name:");
        lb3.setLayoutX(0);
        lb3.setLayoutY(130);
        TextField tf3= new TextField();
        tf3.setLayoutY(150);
        tf3.setLayoutX(0);


        Button btn = new Button();
        btn.setText("Click Me");
        btn.setLayoutX(200);
        btn.setLayoutY(100);


        Label lb4= new Label();
        lb4.setLayoutY(200);
        lb4.setLayoutX(10);

        btn.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                String t1=tf1.getText();
                String t2=tf2.getText();
                String t3=tf3.getText();
                String a = ""+tf1.getText()+tf2.getText()+tf3.getText();
                lb4.setText(a);
            }
        });

        

        Pane root= new Pane();
        root.getChildren().add(tf1);
        root.getChildren().add(tf2);
        root.getChildren().add(tf3);
        root.getChildren().add(lb1);
        root.getChildren().add(lb2);
        root.getChildren().add(lb3);
        root.getChildren().add(lb4);
        root.getChildren().add(btn);

        primaryStage.setScene(new Scene(root,300,250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
