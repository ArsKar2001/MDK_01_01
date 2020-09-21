package controllers;

import algorithms.Task_06;
import algorithms.Task_07;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task07_Controller implements NewScene {

    @FXML
    private Button btn_Cancel;

    @FXML
    private TextField strField;

    @FXML
    private TextField charField;

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
        Task_07 task_07 = new Task_07(strField.getText());
        lbResult.setText(task_07.IsChecked(charField.getText()));
    }
}
