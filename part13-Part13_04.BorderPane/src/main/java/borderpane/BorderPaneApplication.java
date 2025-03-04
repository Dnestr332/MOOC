package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window) {
        Label north = new Label("NORTH");
        Label east = new Label("EAST");
        Label south = new Label("SOUTH");
        
        BorderPane layout = new BorderPane();
        layout.setTop(north);
        layout.setRight(east);
        layout.setBottom(south);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();       
    }

}
