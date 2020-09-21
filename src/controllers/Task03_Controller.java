package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import algorithms.Task_03;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task03_Controller implements NewScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Cancel;

    @FXML
    private TextField strField;

    @FXML
    private Button btn_Execute;

    @FXML
    private Label lbResult;

    @FXML
    void initialize() {
        BtnClick();
    }

    private void BtnClick() {
        btn_Cancel.setOnAction(event -> {
            Load("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(actionEvent -> {
            Execute();
        });
    }

    private void Execute() {
        if(strField.getText() != null) {
            Task_03 task03 = new Task_03(strField.getText());
            lbResult.setText(task03.getCount());
        } else
            lbResult.setText("");
    }
}
