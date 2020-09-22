package interfaces;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import launching.Main;

import java.io.IOException;

public interface NewScene {
    default void load(String str, Node node) {
        try {
            Stage primaryStage = (Stage) node.getScene().getWindow();
            Parent root = FXMLLoader.load(Main.class.getResource(str));
            primaryStage.setScene(new Scene(root, node.getScene().getWidth(), node.getScene().getHeight()));
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }
}
