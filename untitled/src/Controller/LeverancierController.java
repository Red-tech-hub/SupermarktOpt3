package Controller;

import Code.Leverancier;
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

public class LeverancierController {
    public Button Backbutton;
    public TableView LeverancierTabel;
    public TableColumn LeverancierColom;
    public TableColumn GoederenColom;
    public TableColumn HoeveelheidColom;
    public TableColumn TijdColom;

    public void Backbutton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/HomeOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }
    
    @FXML
    private void initialize() {

        ObservableList<Leverancier> leveranciers = FXCollections.observableArrayList();

        LeverancierColom.setCellValueFactory(new PropertyValueFactory<>("Leverancier"));
        GoederenColom.setCellValueFactory(new PropertyValueFactory<>("Goederen"));
        HoeveelheidColom.setCellValueFactory(new PropertyValueFactory<>("Hoeveelheid"));
        TijdColom.setCellValueFactory(new PropertyValueFactory<>("Tijd"));

        LeverancierTabel.setItems(leveranciers);

        leveranciers.add(new Leverancier("Verstrade", "Groente", "50 Kg", "18 juli 15:30"));
        leveranciers.add(new Leverancier("Elite Snacks Neede B.V.", "Snacks", "20 Kg", "12 juli 14:00"));
    }
}
