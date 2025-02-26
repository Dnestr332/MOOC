package hurraa;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
//javafx.scene.media.AudioClip WAS DECOUPLED FROM JDK SINCE JAVA 11
//AND NO LONGER SUPPORTED. I HAD TO USE javax.sound.sampled.Clip instead.

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

        nappi.setOnAction((event) -> playSound("Applause-Yannick_Lemieux.wav"));

        Scene scene = new Scene(pane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    private void playSound(String filePath) {
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
