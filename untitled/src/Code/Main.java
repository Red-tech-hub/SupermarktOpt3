package Code;
import Controller.LoginController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Main extends Application{

    public static void main(String[] args) {
        ObservableList<Sterren> reviewLijst = FXCollections.observableArrayList();
        reviewLijst.add(new Sterren(3));
        reviewLijst.add(new Sterren(1));
        reviewLijst.add(new Sterren(1));
        reviewLijst.add(new Sterren(5));
        System.out.println(new Sterren().getGemiddelde(reviewLijst));
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/LoginOpt3.fxml"));
        stage.setTitle("Opt3");
        stage.setScene(new Scene(root, stage.getWidth(), stage.getHeight()));
        stage.show();
        stage.setResizable(false);
    }
}