package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Label welcome = new Label("Enter your name and start.");
        TextField text = new TextField();
        Button start = new Button("Start");

        GridPane firstLayout = new GridPane();
        firstLayout.add(welcome, 0, 0);
        firstLayout.add(text, 0, 1);
        firstLayout.add(start, 0, 2);

        firstLayout.setPrefSize(300, 180);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene first = new Scene(firstLayout);
        
        BorderPane secondLayout = new BorderPane();
        Label greetings = new Label();
        secondLayout.setCenter(greetings);
        
        Scene second = new Scene(secondLayout);
        
        start.setOnAction((event) -> {
            greetings.setText("Welcome " + text.getText() + "!");
            stage.setScene(second);
        });  
        
        stage.setScene(first);
        stage.show();
    }
}
