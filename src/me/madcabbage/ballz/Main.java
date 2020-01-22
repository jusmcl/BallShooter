package me.madcabbage.ballz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import me.madcabbage.ballz.game.Game;

import static me.madcabbage.ballz.game.Game.HEIGHT;
import static me.madcabbage.ballz.game.Game.WIDTH;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("style.fxml"));

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("MAD Balls!");
        primaryStage.setResizable(false);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
