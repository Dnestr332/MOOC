package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane firstLayout = new BorderPane();
        Label firstView = new Label("First view!");
        Button toSecond = new Button("To the second view!");
        firstLayout.setTop(firstView);
        firstLayout.setCenter(toSecond);

        VBox secondLayout = new VBox();
        Button toThird = new Button("To the third view!");
        Label secondView = new Label("Second view!");
        secondLayout.getChildren().add(toThird);
        secondLayout.getChildren().add(secondView);

        GridPane thirdLayout = new GridPane();
        Label thirdView = new Label("Third view!");
        Button toFirst = new Button("To the first view!");
        thirdLayout.add(thirdView, 0, 0);
        thirdLayout.add(toFirst, 1, 1);

        Scene first = new Scene(firstLayout);
        Scene second = new Scene(secondLayout);
        Scene third = new Scene(thirdLayout);

        toSecond.setOnAction((event) -> stage.setScene(second));
        toThird.setOnAction((event) -> stage.setScene(third));
        toFirst.setOnAction((event) -> stage.setScene(first));
        
        stage.setScene(first);
        stage.show();
    }
}
