package controllers;

import algorithms.Task_01;
import algorithms.Task_02;
import javafx.scene.control.Label;
import launching.Main;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Task02_Controller implements NewScene {

    @FXML
    private Button btn_Cancel;

    @FXML
    private Button btn_Execute;

    @FXML
    private Label lbMatrix;

    @FXML
    private Label lbResSum;

    @FXML
    private Label lbResMul;

    @FXML
    private Label lbResNum;


    @FXML
    void initialize() {
        BtnClickCancel();
        Execute();
    }
    private void BtnClickCancel() {
        btn_Cancel.setOnAction(event -> {
            SetScene("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(actionEvent -> {
            Execute();
        });
    }
    private void Execute() {
        Task_02 task02 = new Task_02();
        lbMatrix.setText(task02.OutputMatrix());
        lbResSum.setText(task02.OutputSumRows());
        lbResMul.setText(task02.OutputMulColumns());
        lbResNum.setText(task02.OutputNumberOfMainDiagonal());
    }
    @Override
    public void SetScene(String str, Button button) {
        try {
            Stage primaryStage = (Stage) button.getScene().getWindow();
            Parent root = FXMLLoader.load(Main.class.getResource(str));
            primaryStage.setScene(new Scene(root,700, 500));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
