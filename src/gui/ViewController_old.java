package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController_old {

	@FXML
	public Button btTest;
		
	@FXML
	public void onBtTestAction() {
			Alerts.showAlert("Titulo do Alerta","Cabeçalho do Alerta","Voce Clicou no Botão", AlertType.INFORMATION);
		}
		
	}

