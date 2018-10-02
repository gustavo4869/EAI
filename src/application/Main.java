package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	private static Stage stage;
	
	private static Scene loginScene;
	private static Scene homeScene;
	private static Scene listaOcorrenciaScene;
	private static Scene ocorrenciaScene;
	private static Scene cadastroOcorrenciaScene;
	private static Scene usuarioScene;
	private static Scene pesquisarScene;
	private static Scene graficoScene;
	private static Scene alteracaoOcorrenciaScene;
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		try {
			stage.setTitle("Login");
			
			Parent fxmlLogin = FXMLLoader.load(getClass().getResource("login.fxml"));
			loginScene = new Scene(fxmlLogin,335,600);
			
			Parent fxmlHome = FXMLLoader.load(getClass().getResource("home.fxml"));
			homeScene = new Scene(fxmlHome,335,600);			
			
			Parent fxmlListaOcorrencia = FXMLLoader.load(getClass().getResource("listaOcorrencias.fxml"));
			listaOcorrenciaScene = new Scene(fxmlListaOcorrencia,335,600);
			
			Parent fxmlOcorrencia = FXMLLoader.load(getClass().getResource("ocorrencia.fxml"));
			ocorrenciaScene = new Scene(fxmlOcorrencia,335,600);
			
			Parent fxmlCadastrarOcorrencia = FXMLLoader.load(getClass().getResource("cadastrarOcorrencia.fxml"));
			cadastroOcorrenciaScene = new Scene(fxmlCadastrarOcorrencia,335,600);
			
			Parent fxmlUsuario = FXMLLoader.load(getClass().getResource("usuario.fxml"));
			usuarioScene = new Scene(fxmlUsuario,335,600);
			
			Parent fxmlPesquisar = FXMLLoader.load(getClass().getResource("pesquisar.fxml"));
			pesquisarScene = new Scene(fxmlPesquisar,335,600);
			
			Parent fxmlGrafico = FXMLLoader.load(getClass().getResource("grafico.fxml"));
			graficoScene = new Scene(fxmlGrafico,335,600);
			
			Parent fxmlAlterarOcorrencia = FXMLLoader.load(getClass().getResource("alterarOcorrencia.fxml"));
			alteracaoOcorrenciaScene = new Scene(fxmlAlterarOcorrencia,335,600);
			
			stage.setScene(loginScene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void trocaTela(String nomeTela) {
		switch(nomeTela) {
			case "home":
				stage.setScene(homeScene);
				trocaTitulo("Home");
				break;
			
			case "listaOcorrencia":
				stage.setScene(listaOcorrenciaScene);
				trocaTitulo("Lista de Ocorrências");
				break;
			
			case "ocorrencia":
				stage.setScene(ocorrenciaScene);
				trocaTitulo("Ocorrência");
				break;
				
			case "usuario":
				stage.setScene(usuarioScene);
				trocaTitulo("Detalhes do Usuário");
				break;
				
			case "pesquisar":
				stage.setScene(pesquisarScene);
				trocaTitulo("Pesquisa");
				break;
			
			case "grafico":
				stage.setScene(graficoScene);
				trocaTitulo("Detalhes");
				break;
			
			case "cadastroOcorrencia":
				stage.setScene(cadastroOcorrenciaScene);
				trocaTitulo("Cadastro de Ocorrência");
				break;
				
			case "alterarOcorrencia":
				stage.setScene(alteracaoOcorrenciaScene);
				trocaTitulo("Edição de Ocorrência");
				break;						
				
			default:
				stage.setScene(homeScene);
				break;
		}		
	}
	
	public static void trocaTitulo(String titulo) {
		stage.setTitle(titulo);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
