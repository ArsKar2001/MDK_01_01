package launching;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/display/MainScene.fxml"));
        primaryStage.setTitle("МДК 01.01 Разработка программных модулей");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
