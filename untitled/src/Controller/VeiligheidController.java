package Controller;

import Code.Sterren;
import Code.Veiligheid;
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

public class VeiligheidController {
    public Button BackButton;
    public TableView VeiligheidTabel;
    public TableColumn WerknemerColom;
    public TableColumn HandschoenenColom;

    public void Backbutton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/HomeOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }

    @FXML
    private void initialize() {

        ObservableList<Veiligheid> veiligheidlijst = FXCollections.observableArrayList();

        WerknemerColom.setCellValueFactory(new PropertyValueFactory<>("Werknemer"));
        HandschoenenColom.setCellValueFactory(new PropertyValueFactory<>("Handschoenen"));

        VeiligheidTabel.setItems(veiligheidlijst);

        veiligheidlijst.add(new Veiligheid("Aaron", 3));
        veiligheidlijst.add(new Veiligheid("Petra", 1));
        veiligheidlijst.add(new Veiligheid("Harry", 2));
        veiligheidlijst.add(new Veiligheid("Annabel", 2));
    }
}
