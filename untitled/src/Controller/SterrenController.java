package Controller;

import Code.*;
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
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;

public class SterrenController {
    public Button BackButton;
    public TableView ReviewTabel;
    public TableColumn KlantColumn;
    public TableColumn SterColumn;
    public Text GemiddeldeSterren;
    public TableColumn LeverancierColom;

    public void Backbutton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/HomeOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }

    @FXML
    private void initialize() {

        ObservableList<Sterren> reviewLijst = FXCollections.observableArrayList();

        KlantColumn.setCellValueFactory(new PropertyValueFactory<>("Klant"));
        LeverancierColom.setCellValueFactory(new PropertyValueFactory<>("leverancier"));
        SterColumn.setCellValueFactory(new PropertyValueFactory<>("Ster"));

        ReviewTabel.setItems(reviewLijst);

        reviewLijst.add(new KlantSterren(4, new Klant("Henk")));
        reviewLijst.add(new LeveranciersSterren(new Leverancier("Verstrade", "Groente", "50 Kg", "18 juli 15:30"), 3));

        GemiddeldeSterren.setText("Het gemiddelde aantal sterren is: " + new Sterren().getGemiddelde(reviewLijst).toString());
    }




}

