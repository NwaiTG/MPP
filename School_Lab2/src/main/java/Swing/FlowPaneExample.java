package Swing;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER); // Center-align the content
        flowPane.setHgap(10); // Set horizontal gap between elements

        // Create labels
        Label nameLabel = new Label("Name:");
        Label streetLabel = new Label("Street:");
        Label cityLabel = new Label("City:");
        Label stateLabel = new Label("State:");
        Label zipLabel = new Label("Zip:");

        // Add labels to the FlowPane
        flowPane.getChildren().addAll(nameLabel, streetLabel, cityLabel, stateLabel, zipLabel);

        // Create a scene and add the FlowPane
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setTitle("Address Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

