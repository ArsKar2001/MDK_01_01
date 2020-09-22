/**
 * Sample Skeleton for 'task_12.fxml' Controller Class
 */

package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import algorithms.Task_09;
import algorithms.Task_12;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task12_Controller implements NewScene {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btn_Cancel"
    private Button btn_Cancel; // Value injected by FXMLLoader

    @FXML // fx:id="strField"
    private TextField strField; // Value injected by FXMLLoader

    @FXML // fx:id="btn_Execute"
    private Button btn_Execute; // Value injected by FXMLLoader

    @FXML // fx:id="lbResult"
    private Label lbResult; // Value injected by FXMLLoader

    @FXML
    void initialize() {
        btnClick();
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
        Task_12 task_12 = new Task_12(strField.getText());
        lbResult.setText(task_12.outputArray() + "\n" + task_12.outputSortStringCode());
    }
}

