package Threater;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TheaterBoxOfficeGUI extends Application {
    private TheaterBoxOffice boxOffice;

    @Override
    public void start(Stage primaryStage) {
        boxOffice = new TheaterBoxOffice(20, 28);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        Label titleLabel = new Label("Theater Box Office");
        GridPane.setConstraints(titleLabel, 0, 0, 2, 1);

        Button showEmptySeatsButton = new Button("Show Empty Seats");
        showEmptySeatsButton.setOnAction(e -> showEmptySeats());
        GridPane.setConstraints(showEmptySeatsButton, 0, 1);

        Button showReservedSeatsButton = new Button("Show Reserved Seats");
        showReservedSeatsButton.setOnAction(e -> showReservedSeats());
        GridPane.setConstraints(showReservedSeatsButton, 1, 1);

        Button reserveSeatButton = new Button("Reserve Seat");
        reserveSeatButton.setOnAction(e -> reserveSeat());
        GridPane.setConstraints(reserveSeatButton, 0, 2);

        Button unreserveSeatButton = new Button("Unreserve Seat");
        unreserveSeatButton.setOnAction(e -> unreserveSeat());
        GridPane.setConstraints(unreserveSeatButton, 1, 2);

        Button emptyAllSeatsButton = new Button("Empty All Seats");
        emptyAllSeatsButton.setOnAction(e -> emptyAllSeats());
        GridPane.setConstraints(emptyAllSeatsButton, 0, 3);

        Button reserveAllSeatsButton = new Button("Reserve All Seats");
        reserveAllSeatsButton.setOnAction(e -> reserveAllSeats());
        GridPane.setConstraints(reserveAllSeatsButton, 1, 3);

        gridPane.getChildren().addAll(
                titleLabel,
                showEmptySeatsButton,
                showReservedSeatsButton,
                reserveSeatButton,
                unreserveSeatButton,
                emptyAllSeatsButton,
                reserveAllSeatsButton
        );

        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Theater Box Office");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showEmptySeats() {
        // Implement logic to show empty seats
    }

    private void showReservedSeats() {
        // Implement logic to show reserved seats
    }

    private void reserveSeat() {
        // Implement logic to reserve a seat
    }

    private void unreserveSeat() {
        // Implement logic to unreserve a seat
    }

    private void emptyAllSeats() {
        // Implement logic to empty all seats
    }

    private void reserveAllSeats() {
        // Implement logic to reserve all seats
    }

    public static void main(String[] args) {
        launch(args);
    }
}

