package src.class29;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIAppPart2 extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button=new Button("Open");
        Label label=new Label("Enter Your Name");
       TextField text=new TextField();
        VBox vBoxlayout=new VBox();//vbox starts from top left, stack pane starts from middle center
        vBoxlayout.getChildren().add(label);
        vBoxlayout.getChildren().add(text);
        vBoxlayout.getChildren().add(button);
        Scene scene= new Scene(vBoxlayout,600,600);
        primaryStage.setTitle("Jen App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
    }
}
