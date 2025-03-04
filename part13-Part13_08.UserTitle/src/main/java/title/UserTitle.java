package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage stage) {
        Parameters params = getParameters();
        String title = params.getNamed().get("Title");
        stage.setTitle(title);
        stage.show();
    }
}
