package gui;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/*
 classe responsavel por controlar açoes na tela, como quando clicar em login,
  logar na conta e trocar para a tela principal 
  */
public class TelaDeLoginController {
	@FXML
	private Button btLogin;
	@FXML
	private Button btCriarCOnta;
	@FXML
	private TextField email;
	@FXML
	private TextField senha;
	
	public void onBtCriarConta() throws IOException {
		 Parent parent = FXMLLoader.load(
	                getClass().getResource("/gui/TelaCriarConta.fxml"));

	        Scene scene = new Scene(parent);

	        Stage stage = (Stage) btLogin.getScene().getWindow();

	        stage.setScene(scene);
	        stage.show();
	}
	
	public void onBtLogin() throws IOException {
		String emailTxt = email.getText();
		String senhaTxt = senha.getText();
		if(!emailTxt.isEmpty() && !senhaTxt.isEmpty()) {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/TelaPrincipal.fxml"));
			
			Scene scene = new Scene(parent);
			Stage stage = (Stage) btLogin.getScene().getWindow();
			
			stage.setScene(scene);
			stage.show();
					
			
		}
		
		else {
			System.out.println("Digite email e senha!");
		}
		
		
		
	}
}
