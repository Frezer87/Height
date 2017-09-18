import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Optional;

public class Height extends Application  {
    public void start(Stage primaryStage) {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension ScreenDimension = toolkit.getScreenSize();

        double screenWidth = ScreenDimension.getWidth();
        double screenHeight = ScreenDimension.getHeight();

        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Enter value");
        inputDialog.setHeaderText("Height Centimeter to/feet converter");
        inputDialog.setContentText("Enter your height in Centimeter");
        inputDialog.setX(0);
        inputDialog.setY(0);
        Optional<String> result = inputDialog.showAndWait();

        double height = Double.parseDouble(result.get());
        double heightInch = height*0.39370/12;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.getDialogPane().setPrefSize(300, 250);
        alert.setTitle("Height");
        alert.setContentText("Your height is" + decimalFormat.format(heightInch)  + "feet");
        alert.setX(screenWidth-alert.getDialogPane().getPrefWidth());
        alert.setY(screenHeight-alert.getDialogPane().getPrefHeight());
        alert.showAndWait();

    }

    public static void main(String [] args) {
        Application.launch(args);
    }

}