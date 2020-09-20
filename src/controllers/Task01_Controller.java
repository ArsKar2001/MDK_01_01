package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import algorithms.Task_01;
import launching.Main;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Task01_Controller implements NewScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField strField;

    @FXML
    private TextField charField;

    @FXML
    private Button btn_Execute;

    @FXML
    private Label lbResult;

    @FXML
    private Button btn_Cancel;

    @FXML
    void initialize() {
        BtnClickCancel();
    }

    private void BtnClickCancel() {
        btn_Cancel.setOnAction(event -> {
            SetScene("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(event -> {
            if(strField.getText() != null && charField != null && charField.getLength() == 1) {
                Task_01 task01 = new Task_01(strField.getText(), charField.getText());
                lbResult.setText(task01.Execute());
            } else
                lbResult.setText("");
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
