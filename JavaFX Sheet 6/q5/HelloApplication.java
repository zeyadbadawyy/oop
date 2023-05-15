package com.example.q5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Rectangle[] r = new Rectangle[4];
        r[0] = new Rectangle(78,3*20);
        r[1] = new Rectangle(78,3*10);
        r[2] = new Rectangle(78,3*30);
        r[3] = new Rectangle(78,3*40);
        r[0].setFill(Color.RED);
        r[1].setFill(Color.BLUE);
        r[2].setFill(Color.GREEN);
        r[3].setFill(Color.ORANGE);

        Text[] text = new Text[4];
        text[0] =new Text("Project -- 20%");
        text[1]= new Text("Quiz -- 10%");
        text[2] = new Text("Midterm -- 30%");
        text[3] = new Text("Final -- 40%");


        VBox[] bars = {new VBox(),new VBox(),new VBox(),new VBox()};
        for(int i=0;i< bars.length;i++){
            bars[i].getChildren().add(text[i]);
            bars[i].getChildren().add(r[i]);
        }


        for(VBox v:bars){
            v.setAlignment(Pos.BOTTOM_CENTER);
            v.setSpacing(10);
        }
        HBox h = new HBox();
        h.getChildren().addAll(bars);
        h.setSpacing(10);
        h.setAlignment(Pos.BOTTOM_CENTER);
        h.setPadding(new Insets(10));
        Scene scene = new Scene(h);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}