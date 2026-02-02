import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
    Pane root = new Pane();
    //changes the size of the pane from default to this value
    root.setPrefSize(400, 500);

    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
    }
}