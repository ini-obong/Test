/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import loginnina.LoginController;

/**
 * FXML Controller class
 *
 * @author franc
 */
public class NewPageController implements Initializable {

    @FXML
    private Text names;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String txtUser = LoginController.getVariable();
        names.setText("Welcome " + txtUser);
    }    
    
}
