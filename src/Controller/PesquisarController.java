package Controller;

import application.Main;
import javafx.fxml.FXML;

public class PesquisarController {
	@FXML
	protected void btnOcorrencia() {
		System.out.println("Abrindo Ocorr�ncia");
		
		Main.trocaTela("ocorrencia");
		Main.trocaTitulo("Ocorr�ncia");
	}	
	
	@FXML
	protected void btnMenuImg() {
		System.out.println("Event List");
		
		Main.trocaTela("home");
		Main.trocaTitulo("Home");
	}
	
	@FXML
	protected void btnLista() {
		System.out.println("Event List");
		
		Main.trocaTela("listaOcorrencia");
		Main.trocaTitulo("Lista de Ocorr�ncias");
	}
	
	@FXML	
	protected void btnListaImg() {
		System.out.println("Event List");
		
		Main.trocaTela("listaOcorrencia");		
	}
	
	@FXML
	protected void btnUsuario() {
		System.out.println("Usu�rio");
		
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
}
