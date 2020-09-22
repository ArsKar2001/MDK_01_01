package controllers;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import interfaces.NewScene;
import javafx.fxml.FXML;

public class MainSceneController implements NewScene {

    @FXML
    void initialize() {}

    private String getUrlScene(String id) {
        String idTask = id.split("_")[2];
        return "/display/task_"+idTask+".fxml";
    }

    public void MouseClickedButtons(MouseEvent event) {
        var node = (Node) event.getSource();
        load(getUrlScene(node.getId()), node);
    }
}
