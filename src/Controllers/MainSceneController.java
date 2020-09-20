package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Classes.Main;
import Classes.NewScene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
            SetScene("../sample/task_01.fxml", btn_task1);
        });
        btn_task2.setOnAction(event -> {
            SetScene("../sample/task_02.fxml", btn_task1);
        });
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
