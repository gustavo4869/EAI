package Controller;

import javafx.fxml.FXML;
import application.Main;
import javafx.event.ActionEvent;

public class LoginController {
	
	@FXML
	protected void btnEntrar(ActionEvent e) {
		System.out.println("Entry Point");
		
		Main.trocaTela("home");
		Main.trocaTitulo("Home");
	}
}
