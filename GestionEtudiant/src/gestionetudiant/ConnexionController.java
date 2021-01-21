/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class ConnexionController implements Initializable {
    @FXML
    private 
    private Service metier;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblError.setVisible(false);
        metier=new Service();
    }    

    @FXML
    private void handleConnexion(ActionEvent event) {
        String login=txtLogin.getText();
        String pwd=txtPwd.getText();
        Personne pers=metier.seConnecter(login, pwd);
        if(pers==null){
            lblError.setVisible(true);
        }else{
            //Ferme la fénetre de connexion
            txtLogin.getScene().getWindow().hide();
            //Ouvrir le fenetre menu
           AnchorPane view= FXMLLoader
                   .load(getClass()
                           .getResource("vmenu.fxml"));
          Scene scene=new Scene(view);
          Stage stage=new Stage();
             stage.setScene(scene);
             stage.showAndWait();
        }
    }
    
}
