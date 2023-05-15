package com.example.q2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(15));
        Random rndm = new Random();
        for(int i = 0 ; i < 3 ;i++) {
            for(int j = 0 ; j <  3 ;  j++){
                int cell;
                cell = rndm.nextInt(3);
                switch(cell){
                    case 0: break;
                    case 1:pane.add(new ImageView(new Image("x.png")),j,i); break;
                    case 2:pane.add(new ImageView("o.png"),j,i); break;
                }
            }
        }


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}