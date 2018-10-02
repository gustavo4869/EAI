package Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {
	
	@FXML
	protected void btnLista(ActionEvent e) {
		System.out.println("Event List");
		
		Main.trocaTela("listaOcorrencia");		
	}
	
	@FXML
	protected void btnAddOcorrencia() {
		System.out.println("Cadastrando Ocorrência");
		
		Main.trocaTela("cadastroOcorrencia");		
	}
	
	@FXML
	protected void btnMenu() {
		System.out.println("Menu");
		
		Main.trocaTela("home");		
	}
	
	@FXML
	protected void btnUsuario() {
		System.out.println("Usuário");
		
		Main.trocaTela("usuario");		
	}
	
	@FXML
	protected void btnEditar() {
		System.out.println("Editando");
		
		Main.trocaTela("grafico");		
	}
	
	@FXML
	protected void btnPesquisar() {
		System.out.println("Pesquisando");
		
		Main.trocaTela("pesquisar");		
	}
	
	@FXML	
	protected void btnListaImg() {
		System.out.println("Event List");
		
		Main.trocaTela("listaOcorrencia");		
	}
	
	
}
