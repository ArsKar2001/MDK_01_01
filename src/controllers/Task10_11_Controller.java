package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import algorithms.Task_10_11;
import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Task10_11_Controller implements NewScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Cancel;

    @FXML
    private Button btn_Execute;

    @FXML
    private Label lbA;

    @FXML
    private Label lbB;

    @FXML
    private Label lbC;

    @FXML
    private Label lbP;

    @FXML
    private Label lbS;

    @FXML
    private Label lbA1;

    @FXML
    private Label lbB1;

    @FXML
    private Label lbC1;

    @FXML
    private Label lbP1;

    @FXML
    private Label lbS1;

    @FXML
    private Label lbA11;

    @FXML
    private Label lbB11;

    @FXML
    private Label lbC11;

    @FXML
    private Label lbP11;

    @FXML
    private Label lbS11;

    @FXML
    private Label lbMaxP;

    @FXML
    private Label lbMaxS;


    @FXML
    void initialize() {
        BtnClick();
        execute();
    }

    private void BtnClick() {
        btn_Cancel.setOnAction(event -> {
            load("/display/MainScene.fxml", btn_Cancel);
        });
        btn_Execute.setOnAction(actionEvent -> {
            execute();
        });
    }

    private void execute() {
        Task_10_11 task_10 = new Task_10_11();

        lbA.setText(String.valueOf(task_10.getTriangles().get(0).getA()));
        lbB.setText(String.valueOf(task_10.getTriangles().get(0).getB()));
        lbC.setText(String.valueOf(task_10.getTriangles().get(0).getC()));
        lbP.setText(String.valueOf(task_10.getTriangles().get(0).getPerimeter()));
        lbS.setText(String.valueOf(task_10.getTriangles().get(0).getArea()));

        lbA1.setText(String.valueOf(task_10.getTriangles().get(1).getA()));
        lbB1.setText(String.valueOf(task_10.getTriangles().get(1).getB()));
        lbC1.setText(String.valueOf(task_10.getTriangles().get(1).getC()));
        lbP1.setText(String.valueOf(task_10.getTriangles().get(1).getPerimeter()));
        lbS1.setText(String.valueOf(task_10.getTriangles().get(1).getArea()));

        lbA11.setText(String.valueOf(task_10.getTriangles().get(2).getA()));
        lbB11.setText(String.valueOf(task_10.getTriangles().get(2).getB()));
        lbC11.setText(String.valueOf(task_10.getTriangles().get(2).getC()));
        lbP11.setText(String.valueOf(task_10.getTriangles().get(2).getPerimeter()));
        lbS11.setText(String.valueOf(task_10.getTriangles().get(2).getArea()));

        lbMaxP.setText("Треугольник с наибольшим P: "+task_10.getRandomTriangleWithMaxPerimeter().getId());
        lbMaxS.setText("Треугольник с наибольшим S: "+task_10.getRandomTriangleWithMaxArea().getId());
    }
}
