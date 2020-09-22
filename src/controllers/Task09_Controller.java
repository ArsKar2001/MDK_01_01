package controllers;

import algorithms.Task_09;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Task09_Controller implements NewScene {
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
        Task_09 task_09 = new Task_09();
        lbArray.setText(task_09.outputArrayStr());
        lbResult.setText(task_09.outputMaxString());
    }
}
