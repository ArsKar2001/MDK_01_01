package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import algorithms.Task_04;
import algorithms.Task_06;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Task06_Controller implements NewScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Cancel;

    @FXML
    private Button btn_Execute;

    @FXML
    private Label lbArray;

    @FXML
    private Label lbResult;

    @FXML
    void initialize() {
        BtnClick();
        Execute();
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
        Task_06 task_06 = new Task_06();
        lbResult.setText(task_06.GetResult());
        lbArray.setText(task_06.OutputArray());
    }
}
