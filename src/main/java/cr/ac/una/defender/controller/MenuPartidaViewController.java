/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Haymara
 */
public class MenuPartidaViewController extends Controller implements Initializable {

    @FXML
    private JFXButton btnNuevaPartida;
    @FXML
    private JFXButton btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionBtnNuevaPartida(ActionEvent event) {
         getStage().close();
    }

    @FXML
    private void onActionBtnCancelar(ActionEvent event) {
    }

    @Override
    public void initialize() {
     }
    
}
