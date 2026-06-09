
package br.com.willian.controlegastos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label("Controle de Gastos");

        //StackPane root = new StackPane(label);
        Parent parent = FXMLLoader.load(
                getClass().getResource("/gui/TelaDeLogin.fxml"));
        Scene scene = new Scene(parent);

        stage.setTitle("Controle de Gastos");
        stage.setScene(scene);
        stage.show();
    }
    
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }
}