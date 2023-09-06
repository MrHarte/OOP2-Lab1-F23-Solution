package com.champlain.oop2lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main application class to run JavaFX.
 */
public class PersonViewApplication extends Application {
    /**
     * Starts JavaFX, loads and shows stage in scene.
     * @param stage Stage to be displayed.
     * @throws IOException In case of input or output flaw.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PersonViewApplication.class.getResource("person-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 350);
        stage.setTitle("Person View");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Runs main application.
     * @param args Additional program arguments, currently unused.
     */
    public static void main(String[] args) {
        launch();
    }
}