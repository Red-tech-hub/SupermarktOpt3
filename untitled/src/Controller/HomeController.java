package Controller;

import Transitions.TransitionManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomeController {


    public Button Sterren;
    public Button Veiligheid;
    public Button Werknemers;
    public Button Leverancier;


    public void WerknemersButton(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/FXML/WerknemersOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }

    public void LeverancierButton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/FXML/LeverancierOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }

    public void VeiligheidButton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/VeiligheidOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }

    public void SterrenButton(ActionEvent actionEvent) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/SterrenOpt3.fxml"));
        TransitionManager.show(home_page_parent, actionEvent);
    }
}
