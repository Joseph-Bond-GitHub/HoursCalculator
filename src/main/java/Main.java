import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane rootPane = new Pane();
        //changes the size of the pane from default to this value
        rootPane.setPrefSize(400, 500);
        Scene scene = new Scene(rootPane);
        primaryStage.setScene(scene);
        primaryStage.show();

        Button showButton = new Button("Enter new hours");
        showButton.setLayoutX(20);
        showButton.setLayoutY(20);
        rootPane.getChildren().add(showButton);

        Button printText = new Button("Submit data");
        printText.setLayoutX(140);
        printText.setLayoutY(20);
        rootPane.getChildren().add(printText);

        Label hourslbl = new Label();
        hourslbl.setText("Hours");
        hourslbl.setLayoutX(21);
        hourslbl.setLayoutY(60);
        rootPane.getChildren().add(hourslbl);
        hourslbl.setVisible(false);

        TextField hoursfld = new TextField();
        hoursfld.setLayoutX(20);
        hoursfld.setLayoutY(80);
        rootPane.getChildren().add(hoursfld);
        hoursfld.setVisible(false);

        Label descriplbl = new Label();
        descriplbl.setText("Description");
        descriplbl.setLayoutX(21);
        descriplbl.setLayoutY(110);
        rootPane.getChildren().add(descriplbl);
        descriplbl.setVisible(false);

        TextField descripfld = new TextField();
        descripfld.setLayoutX(20);
        descripfld.setLayoutY(130);
        rootPane.getChildren().add(descripfld);
        descripfld.setVisible(false);
        descripfld.setMaxSize(1000,1000);

        showButton.setOnAction(event -> {
            hoursfld.setVisible(true);
            descripfld.setVisible(true);
            hourslbl.setVisible(true);
            descriplbl.setVisible(true);
        });

        printText.setOnAction(ActionEvent ->{
            System.out.println(hoursfld.getText());
            System.out.println(descripfld.getText());
        });
    }
}
