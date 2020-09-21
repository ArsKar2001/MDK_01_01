package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import algorithms.Task_01;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        BtnClick();
    }

    private void BtnClick() {
        btn_Cancel.setOnAction(event -> {
            Load("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(event -> {
            if(strField.getText() != null && charField != null && charField.getLength() == 1) {
                Task_01 task01 = new Task_01(strField.getText(), charField.getText());
                lbResult.setText(task01.ExecuteTask01());
            } else
                lbResult.setText("");
        });
    }
}
