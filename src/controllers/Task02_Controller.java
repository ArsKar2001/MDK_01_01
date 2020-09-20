package controllers;

import launching.Main;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Task02_Controller implements NewScene {

    @FXML
    private Button btn_Cancel;

    @FXML
    void initialize() {
        BtnClickCancel();
    }
    private void BtnClickCancel() {
        btn_Cancel.setOnAction(event -> {
            SetScene("../sample/MainScene.fxml", btn_Cancel);
        });
    }
    @Override
    public void SetScene(String str, Button button) {
        try {
            Stage primaryStage = (Stage) button.getScene().getWindow();
            Parent root = FXMLLoader.load(Main.class.getResource(str));
            primaryStage.setScene(new Scene(root,700, 500));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
