package controllers;

import algorithms.Task_08;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Task08_Controller implements NewScene {
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
        btnClicks();
        execute();
    }

    private void btnClicks() {
        btn_Cancel.setOnAction(event -> {
            load("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(actionEvent -> {
            execute();
        });
    }

    private void execute() {
        Task_08 task_08 = new Task_08();
        lbArray.setText(task_08.outputArray());
        lbResult.setText(task_08.getMaxValue() + ", " + task_08.getMinValue() + ";");
    }
}
