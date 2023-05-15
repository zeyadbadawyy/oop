package com.example.q1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
            GridPane pane = new GridPane();
            StackPane pane2 = new StackPane();
            pane.setPadding(new Insets(5));
            pane.setHgap(5);
            pane.setVgap(5);

            pane.add(new ImageView(new Image("UK.png")),0,0);
        pane.add(new ImageView(new Image("Canada.png")),0,1);
        pane.add(new ImageView(new Image("China.png")),1,0);
        pane.add(new ImageView(new Image("USA.png")),1,1);

            pane2.getChildren().add(pane);
            pane2.setPadding(new Insets(15));
            Scene scene = new Scene(pane2);
            stage.setScene(scene);
            stage.show();
        }



    public static void main(String[] args) {
        launch();
    }
}