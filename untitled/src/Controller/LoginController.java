package Controller;

import Transitions.TransitionManager;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import java.io.IOException;

public class LoginController {
    public TextField Username;
    public PasswordField Password;
    public Button LoginButton;

    public void LoginAsBoss(ActionEvent actionEvent) throws IOException {
        if(checkCredentials(Username.getText(), Password.getText())){
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("../FXML/HomeOpt3.fxml"));
            TransitionManager.show(home_page_parent, actionEvent);
        }
    }

    public boolean checkCredentials(String user, String password) {
        return user.equals("r") && password.equals("r");
    }


}
