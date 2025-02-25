package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        TextArea centerText = new TextArea();
        
        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(new Label("Letters: 0"));
        box.getChildren().add(new Label("Words: 0"));
        box.getChildren().add(new Label("The longest word is:"));

        layout.setCenter(centerText);
        layout.setBottom(box);
        
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();       
    }
}
