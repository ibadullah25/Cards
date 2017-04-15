package Game;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GetStuck extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Place nodes in the pane
        pane.add(new Label("Player1:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Player2:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btn = new Button("Start Game");
        pane.add(btn, 1, 6);
        GridPane.setHalignment(btn, HPos.CENTER);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Deck.main(null);
                } catch (IOException ex) {
                  System.out.println( "Something is wrong");
                }

            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 350);
        primaryStage.setTitle("Get Stuck, Let's Play"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
