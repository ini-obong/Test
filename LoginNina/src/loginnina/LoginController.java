/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginnina;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author franc
 */
public class LoginController implements Initializable {
    
    static ObservableList list = FXCollections.observableArrayList();
    
    String UserName = "Nipsey";
    String Password = "roaddash";
    
    static String uName = "";
    
    @FXML
    private TextField txtUser;
    
    @FXML 
    private PasswordField txtPass;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public static String getVariable(){
        return uName;
    }
    
    
    @FXML
    private void loginUser(ActionEvent event) throws IOException{
        String name = txtUser.getText();
        String password = txtPass.getText();
        
        if(name.isEmpty() || password.isEmpty()){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please fill all required fields");
            alert.showAndWait();
        }
        else {
            if(name.equals(UserName) && password.equals(Password)){
                LoginController.uName = name;
                ((Node)event.getSource()).getScene().getWindow().hide();
                loadWindow("/NewPage/NewPage.fxml", "Login Successful");
                
            }
            else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Sorry! Please enter the right credentials");
            alert.showAndWait();
                
            }
        }
        
    }
    
    private void loadWindow(String location, String title) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource(location));
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }  
    
}
