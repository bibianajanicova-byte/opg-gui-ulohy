package sk.spse.uloha4.declarative;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.util.Random;

public class Controller {

    @FXML
    private VBox vbox1, vbox2, vbox3, vbox4;

    @FXML
    private ImageView img1, img2, img3, img4;

    private Random random = new Random();

    @FXML
    public void handleClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void randomize() {
        VBox[] boxes = {vbox1, vbox2, vbox3, vbox4};
        ImageView[] images = {img1, img2, img3, img4};

        for (int i = 0; i < 4; i++) {
            // Farba pozadia pre VBox
            boxes[i].setStyle("-fx-background-color: " + getRandomColor());

            // Náhodné štýly pre ImageView (plechovku)
            double size = 60 + random.nextDouble() * 120;
            double rotate = -45 + random.nextDouble() * 90;
            double opacity = 0.3 + random.nextDouble() * 0.7;

            images[i].setStyle(
                    "-fx-fit-height: " + size + ";" +
                            "-fx-rotate: " + rotate + ";" +
                            "-fx-opacity: " + opacity + ";"
            );
        }
    }

    private String getRandomColor() {
        return String.format("#%02x%02x%02x", random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}