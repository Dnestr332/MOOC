package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {

        launch(ButtonAndLabelApplication.class);

    }

    @Override
    public void start(Stage window){
        Label label = new Label("This is a label");
        Button button = new Button("This is a button");
        
        FlowPane comGroup = new FlowPane();
        comGroup.getChildren().add(label);
        comGroup.getChildren().add(button);
        
        Scene scene = new Scene(comGroup);
        
        window.setScene(scene);
        window.show();
        
            
    }

}
