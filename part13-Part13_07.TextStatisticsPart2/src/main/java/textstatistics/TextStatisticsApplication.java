package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        TextArea centerText = new TextArea();
        Label lettersLabel = new Label();
        Label wordsLabel = new Label();
        Label longestLabel = new Label();
        
        centerText.textProperty().addListener((change, oldValue, newValue) -> {
            int letters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            lettersLabel.setText("Letters: " + letters);
            wordsLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);
            
        });

        HBox box = new HBox();
        box.setSpacing(20);
       
        box.getChildren().add(lettersLabel);
        box.getChildren().add(wordsLabel);
        box.getChildren().add(longestLabel);

        layout.setCenter(centerText);
        layout.setBottom(box);

        Scene view = new Scene(layout);
        stage.setTitle("ОТВЕТЫ ДАШЕНЬКЕ");
        stage.setScene(view);
        stage.show();
    }
}
