package q5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Class Email.
 * <p>
 * Develops a JavaFX GUI application that implements a prototype 
 * user interface for composing an email message.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class Email extends Application {

    /**
     * Creates and presents the program window.
     * 
     * @param primaryStage
     *                    a Stage
     */
    public void start(Stage primaryStage) {
        final int appWidth = 700;
        final int appHeight = 500;
        Scene scene = new Scene(new EmailPane(), appWidth, appHeight);

        primaryStage.setTitle("Email");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
