package controllers;

import algorithms.Task_12;
import algorithms.Task_13;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Task13_Controller implements NewScene {

    @FXML
    private Button btn_Cancel;

    @FXML
    private Button btn_Execute;

    @FXML
    private Label lbMatrix1;

    @FXML
    private Label lbMatrix1_;

    @FXML
    private Label lbMatrix2_;

    @FXML
    private Label lbMatrix2;

    @FXML
    private Label lbSumRes;

    @FXML
    private Label lbMulRes;

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
        Task_13 task_13 = new Task_13();
        lbMatrix1.setText(task_13.getMatrix1());
        lbMatrix1_.setText(task_13.getMatrix1());
        lbMatrix2.setText(task_13.getMatrix2());
        lbMatrix2_.setText(task_13.getMatrix2());
        lbSumRes.setText(task_13.getSumMatrix());
        lbMulRes.setText(task_13.getMulMatrix());
    }
}
