package application;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;


public class ControladorJanelaPrincipal {
	
	private Scene scene;
	private Stage stage;
	private Parent root;
	
	public void trocaJanela (ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("tipoCliente.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
