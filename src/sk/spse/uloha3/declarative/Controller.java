package sk.spse.uloha3.declarative;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import java.awt.Desktop;
import java.net.URI;

public class Controller {

    @FXML
    public ImageView obrazok;

    @FXML
    public void handleClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void openWeb(ActionEvent event) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI("https://www.spse-po.sk"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}