package controllers;

import algorithms.Task_13;
import algorithms.Task_14;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Task14_Controller implements NewScene {

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
        btnClick();
        execute();
    }

    private void btnClick() {
        btn_Cancel.setOnAction(event -> {
            load("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(actionEvent -> {
            execute();
        });
    }

    private void execute() {
        Task_14 task_14 = new Task_14();
        lbArray.setText(task_14.outputStrings());
        lbResult.setText(task_14.outputSortStrings());
    }
}
