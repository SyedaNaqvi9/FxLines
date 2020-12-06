/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxlines;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author shubh
 */
public class FxLines extends Application {
    Line line1;
    Pane root = new Pane();
    int x1, x2, y1, y2;
    int delta = 60;
    @Override
    public void start(Stage primaryStage) {
        x1 = 10; x2 = 10; y1 =100; y2 = 100;
        Button btn = new Button();        
        btn.setText("Draws 1 line @ time");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               x1 += delta;
                y2 += delta;
                Line line = new Line(y1,x1,y2,x2);
                line.setStroke(Color.NAVY);
               //line.setStrokeWidth(5);
                //line.getStrokeDashArray().addAll(2d, 21d);
                line.getStrokeDashArray().addAll(100d, 20d, 5d, 20d);

                root.getChildren().add(line);
            }
        });             
        
        root.setStyle("-fx-background-color: #CD5C5C");
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 500);
        
        primaryStage.setTitle("Draw lines one at a time");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
