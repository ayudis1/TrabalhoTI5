package application;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class controladorTelaPrincipal implements Initializable {

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnEntrar;
    
    @FXML
    private void entraTipoCliente (ActionEvent event) {
    	System.out.println("Botão Clicado");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
