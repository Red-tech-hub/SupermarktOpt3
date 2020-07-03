package Controller;

import Code.Sterren;
import Code.Werknemer;
import Transitions.TransitionManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class WerknemerController {
    public Button BackButton;
    public TableView WerknemerTabel;
    public TableColumn WerknemerColom;
    public TableColumn UrenColom;
    public TableColumn LeeftijdColom;
    public TableColumn Uurloon;

    public void Backbutton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/HomeOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }

    @FXML
    private void initialize() {

        ObservableList<Werknemer> werknemerlijst = FXCollections.observableArrayList();

        WerknemerColom.setCellValueFactory(new PropertyValueFactory<>("werknemer"));
        UrenColom.setCellValueFactory(new PropertyValueFactory<>("uren"));
        LeeftijdColom.setCellValueFactory(new PropertyValueFactory<>("leeftijd"));
        Uurloon.setCellValueFactory(new PropertyValueFactory<>("uurloon"));

        WerknemerTabel.setItems(werknemerlijst);

        werknemerlijst.add(new Werknemer("Aaron", 5, 19, 6.60));
        werknemerlijst.add(new Werknemer("Petra", 2, 15, 4.30));
        werknemerlijst.add(new Werknemer("Harry", 3, 16, 4.80));
        werknemerlijst.add(new Werknemer("Annabel", 4, 21, 6.60));
    }
}
