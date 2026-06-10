package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	
	public void onBtLogin() throws IOException {
		 Parent parent = FXMLLoader.load(
	                getClass().getResource("/gui/TelaCriarConta.fxml"));

	        Scene scene = new Scene(parent);

	        Stage stage = (Stage) btLogin.getScene().getWindow();

	        stage.setScene(scene);
	        stage.show();
	}
}
