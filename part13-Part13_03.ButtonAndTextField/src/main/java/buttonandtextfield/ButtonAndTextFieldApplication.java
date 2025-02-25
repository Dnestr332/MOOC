package buttonandtextfield;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("Button");
        TextField text = new TextField("Text field");

        FlowPane layout = new FlowPane();
        layout.getChildren().add(button);
        layout.getChildren().add(text);

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }

}
