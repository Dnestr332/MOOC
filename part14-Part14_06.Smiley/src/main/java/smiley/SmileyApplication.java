package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        Canvas canvas = new Canvas(640, 480);
        GraphicsContext painter = canvas.getGraphicsContext2D();

        layout.setCenter(canvas);

        painter.setFill(Color.BLACK);
        painter.fillRect(70, 60, 25, 25);
        painter.fillRect(200, 60, 25, 25);
        painter.fillRect(75, 200, 150, 25);
        painter.fillRect(75, 175, 25, 25);
        painter.fillRect(200, 175, 25, 25);
        
        Scene smiley = new Scene(layout);
        stage.setScene(smiley);
        stage.show();
    }
}
