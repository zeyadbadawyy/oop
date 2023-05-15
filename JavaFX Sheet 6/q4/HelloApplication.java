package com.example.q4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    double x = 60;
        Pane pane = new Pane();
        StackPane pane2 = new StackPane();
        String[] s = "WELCOME TO JAVA ".split("");

        for (int i = 0; i < s.length; i++) {
            double angle=(2*Math.PI)*i/s.length;
            Text text = new Text(x*(1+Math.cos(angle)), x*(1+Math.sin(angle)), s[i]);
            text.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,22));
            text.setRotate(Math.toDegrees(angle)+90);
            pane.getChildren().add(text);
        }
        
        pane2.getChildren().add(pane);
        pane2.setPadding(new Insets(20));
        Scene scene = new Scene(pane2);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}