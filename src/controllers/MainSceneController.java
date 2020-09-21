package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import interfaces.NewScene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MainSceneController implements NewScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_task1;

    @FXML
    private Button btn_task2;

    @FXML
    private Button btn_task3;

    @FXML
    private Button btn_task5;

    @FXML
    private Button btn_task6;

    @FXML
    private Button btn_task7;

    @FXML
    private Button btn_task4;

    @FXML
    private Button btn_task8;

    @FXML
    private Button btn_task9;

    @FXML
    private Button btn_task10;

    @FXML
    private Button btn_task11;

    @FXML
    private Button btn_task12;

    @FXML
    private Button btn_task13;

    @FXML
    private Button btn_task14;

    @FXML
    private Button btn_task15;

    @FXML
    void initialize() {
        BtnClicks();
    }

    private void BtnClicks() {
        btn_task1.setOnAction(event -> {
            Load("/display/task_01.fxml", btn_task1);
        });
        btn_task2.setOnAction(event -> {
            Load("/display/task_02.fxml", btn_task2);
        });
        btn_task3.setOnAction(event -> {
            Load("/display/task_03.fxml", btn_task3);
        });
        btn_task4.setOnAction(event -> {
            Load("/display/task_04.fxml", btn_task4);
        });
        btn_task5.setOnAction(event -> {
            Load("/display/task_05.fxml", btn_task5);
        });
        btn_task6.setOnAction(event -> {
            Load("/display/task_06.fxml", btn_task6);
        });
        btn_task7.setOnAction(event -> {
            Load("/display/task_07.fxml", btn_task7);
        });
    }
}
