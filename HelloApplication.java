package com.example.assignment3a;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Stop;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;



import java.io.IOException;

public class HelloApplication extends Application {
    private Label label;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Thuto's Airforce!");
        BorderPane root=new BorderPane();
        Scene scene = new Scene(root,800,600);
        scene.getStylesheets().add("sTYLER.css");

        //Setting background color



        /*
        Stop[] stops = new Stop[]{
                new Stop(0.0, Color.LIGHTBLUE),
                new Stop(0.25, Color.SKYBLUE),
                new Stop(0.50, Color.LIGHTBLUE),
                new Stop(0.65, Color.SKYBLUE),
                new Stop(0.69, Color.LIGHTBLUE),
                new Stop(0.70, Color.SKYBLUE),
                new Stop(0.91, Color.SKYBLUE),
                new Stop(0.92, Color.RED.brighter().saturate().deriveColor(10,10,10,10)),
                new Stop(0.93, Color.ORANGE.brighter().saturate().deriveColor(10,10,10,10)),
                new Stop(0.94, Color.YELLOW.brighter().saturate().deriveColor(10,10,10,10)),
                new Stop(0.95, Color.GREEN.brighter().saturate().deriveColor(10,10,10,10)),
                new Stop(0.96, Color.BLUE.brighter().saturate().deriveColor(10,10,10,10)),
                new Stop(0.97, Color.INDIGO.brighter().saturate().deriveColor(10,10,10,10)),
                new Stop(0.98, Color.VIOLET.brighter().saturate().deriveColor(1,1,1,1)),
                new Stop(0.99, Color.SKYBLUE),
                new Stop(1.0,Color.TRANSPARENT)
        };*/


        ImageView ship = createShip(scene);
        ImageView kloud=createCloud(scene);
        ImageView kloud1 =createLeru(scene);
        ImageView kloud2=createLik(scene);
        ImageView kloud3=createMolatsi(scene);
        ImageView kloud4=createCoin(scene);
        ImageView kloud5=createKloud5(scene);
        ImageView kloud6=createKloud6(scene);
        ImageView kloud7=createKloud7(scene);
     /*   ImageView chen=createChen(scene);
        ImageView five=createFive(scene); */
        label = new Label("SCORE : 00");
        label.setLayoutX(500);
        label.setLayoutY(20);
        root.getChildren().addAll(ship,kloud,kloud4,kloud1,kloud2,kloud3,kloud5,label);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double x = ship.getX();
            double y = ship.getY();
            switch (event.getCode()) {
                case LEFT -> ship.setX(x -10);
                case RIGHT -> ship.setX(x +10);
                case UP -> ship.setY(y - 10);
                case DOWN -> ship.setY(y + 10);

            }
            if (ship.getBoundsInParent().intersects(kloud.getBoundsInParent())||ship.getBoundsInParent().intersects(kloud4.getBoundsInParent())||ship.getBoundsInParent().intersects(kloud2.getBoundsInParent())||ship.getBoundsInParent().intersects(kloud3.getBoundsInParent())||ship.getBoundsInParent().intersects(kloud6.getBoundsInParent())||ship.getBoundsInParent().intersects(kloud5.getBoundsInParent())||ship.getBoundsInParent().intersects(kloud7.getBoundsInParent())) {



                System.out.println("Game Over!!");
                ship.setImage(new Image("game over.gif"));

                scene.addEventFilter(KeyEvent.KEY_PRESSED, event1 -> {
                    double x1 = ship.getX();
                    double y1 = ship.getY();

                    switch (event.getCode()) {
                        case UP -> ship.setY(y - 0);
                        case DOWN -> ship.setY(y + 0);
                        case LEFT -> ship.setX(y -0);
                        case RIGHT -> ship.setX(y +0);

                    }
                });

            }

        });


        stage.setScene(scene);
        stage.show();
    }


    private ImageView createCloud(Scene scene){
        ImageView kloud = new ImageView(new Image("kloud.jpg"));
        kloud.setFitWidth(100);
        kloud.setFitHeight(100);
        kloud.setY(300);
        kloud.setX(1800);
        TranslateTransition c = new TranslateTransition(Duration.millis(12000),kloud);
        c.setByX(-2000);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud;

    }
    private ImageView createLeru(Scene scene){
        ImageView kloud1  = new ImageView(new Image("kloud1.jpg"));
        kloud1.setFitWidth(100);
        kloud1.setFitHeight(100);
        kloud1.setY(500);
        kloud1.setX(1500);
        TranslateTransition c = new TranslateTransition(Duration.millis(9800),kloud1);
        c.setByX(-2600);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud1;
    }
    private ImageView createLik(Scene scene){
        ImageView kloud2 = new ImageView(new Image("kloud2.jpg"));
        kloud2.setFitWidth(100);
        kloud2.setFitHeight(100);
        kloud2.setY(300);
        kloud2.setX(1400);
        TranslateTransition c = new TranslateTransition(Duration.millis(15000),kloud2);
        c.setByX(-2200);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud2;
    }
    private ImageView createMolatsi(Scene scene){
        ImageView kloud3 = new ImageView(new Image("kloud3.jpg"));
        kloud3.setFitWidth(100);
        kloud3.setFitHeight(100);
        kloud3.setY(700);
        kloud3.setX(1300);
        TranslateTransition c = new TranslateTransition(Duration.millis(7000),kloud3);
        c.setByX(-1800);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud3;
    }
    private ImageView createCoin(Scene scene){
        ImageView kloud4 = new ImageView(new Image("kloud4.jpg"));
        kloud4.setFitWidth(100);
        kloud4.setFitHeight(100);
        kloud4.setY(500);
        kloud4.setX(1700);
        TranslateTransition c = new TranslateTransition(Duration.millis(15000),kloud4);
        c.setByX(-1800);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud4;
    }

    private ImageView createKloud5(Scene scene) {
        ImageView kloud5= new ImageView(new Image("kloud5.jpg"));
        kloud5.setFitWidth(100);
        kloud5.setFitHeight(100);
        kloud5.setY(100);
        kloud5.setX(1800);
        TranslateTransition c = new TranslateTransition(Duration.millis(18000),kloud5);
        c.setByX(-2000);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud5;
    }

    private ImageView createKloud6(Scene scene) {
        ImageView kloud6 = new ImageView(new Image("kloud6.jpg"));
        kloud6.setFitWidth(100);
        kloud6.setFitHeight(100);
        kloud6.setY(1100);
        kloud6.setX(1900);
        TranslateTransition c = new TranslateTransition(Duration.millis(19000), kloud6);
        c.setByX(-2000);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud6;
    }
    private ImageView createKloud7(Scene scene) {
        ImageView kloud7 = new ImageView(new Image("kloud7.jpg"));
        kloud7.setFitWidth(100);
        kloud7.setFitHeight(100);
        kloud7.setY(100);
        kloud7.setX(1800);
        TranslateTransition c = new TranslateTransition(Duration.millis(25000), kloud7);
        c.setByX(-2000);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return kloud7;
    }
    /*
    private ImageView createChen(Scene scene){
        ImageView chen = new ImageView(new Image("chen.png"));
        chen.setFitWidth(100);
        chen.setFitHeight(100);
        chen.setY(500);
        chen.setX(1500);
        TranslateTransition c = new TranslateTransition(Duration.millis(6000),chen);
        c.setByX(-1800);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return chen;

    private ImageView createFive(Scene scene){
        ImageView five = new ImageView(new Image("5.png"));
        five.setFitWidth(100);
        five.setFitHeight(100);
        five.setY(100);
        five.setX(1500);
        TranslateTransition c = new TranslateTransition(Duration.millis(10000),five);
        c.setByX(-1800);
        c.setCycleCount(Integer.MAX_VALUE);
        c.play();

        return five;
    }*/
    private ImageView createShip(Scene scene) {
        ImageView ship = new ImageView(new Image("ship.png"));
        ship.setFitWidth(100);
        ship.setFitHeight(100);
        ship.setY(scene.getHeight() - ship.getFitHeight());
        return ship;
    }


    public static void main(String[] args) {
        launch();
    }
}