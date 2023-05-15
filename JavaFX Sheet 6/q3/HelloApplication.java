package com.example.q3;

import javafx.application.Application;

import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox h = new HBox();
        Random r = new Random();
        h.setPadding(new Insets(15));

        Text[] textArray= new Text[5];
        for(int i=0;i<5;i++)
        {
            textArray[i]= new Text("Java");
        }
        for (Text text : textArray){
            text.setFill(new Color(r.nextDouble(),r.nextDouble(),r.nextDouble(),r.nextDouble()));
            text.setRotate(90);
            text.setFont(Font.font("Serif", FontWeight.BOLD,FontPosture.ITALIC,22));
            h.getChildren().add(text);
        }
        Scene scene = new Scene(h);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}