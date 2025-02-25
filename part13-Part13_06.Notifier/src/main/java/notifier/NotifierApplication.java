package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        
        TextField text = new TextField();
        Button update = new Button("Update");
        Label label = new Label();
        
        update.setOnAction((event) -> label.setText(text.getText()));
        
        box.getChildren().add(text);
        box.getChildren().add(update);
        box.getChildren().add(label);
        
        Scene scene = new Scene(box);
        stage.setScene(scene);
        stage.show();     
    }
}
