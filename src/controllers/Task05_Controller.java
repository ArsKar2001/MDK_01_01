package controllers;

import algorithms.Task_05;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Task05_Controller implements NewScene {

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
        Task_05 task_05 = new Task_05();
        lbArray.setText(task_05.OutputArray());
        lbResult.setText(Task_05.maxValue + " - " + Task_05.minValue + " = " + task_05.Difference());
    }
}
