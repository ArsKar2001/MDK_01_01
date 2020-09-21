package controllers;

import algorithms.Task_02;
import interfaces.NewScene;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
        Task_02 task02 = new Task_02();
        lbMatrix.setText(task02.OutputMatrix());
        lbResSum.setText(task02.OutputSumRows());
        lbResMul.setText(task02.OutputMulColumns());
        lbResNum.setText(task02.OutputNumberOfMainDiagonal());
    }
}
