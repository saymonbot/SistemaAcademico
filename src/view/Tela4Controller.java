package view;

import domain.Trabalhador;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class Tela4Controller {

	@FXML TextField txtNome1;
	@FXML TextField txtNome2;
	@FXML TextField txtQt1;	 
	@FXML TextField txtQt2;
	@FXML TextField txtTempo1;
	@FXML TextField txtTempo2;
	@FXML ProgressBar prg1;
	@FXML ProgressBar prg2;
	
	@FXML
	public void cadastrar() {
		
		Trabalhador t1 = new Trabalhador(
				txtNome1.getText(),
				Integer.parseInt(txtQt1.getText()),
				Integer.parseInt(txtTempo1.getText()),
				prg1);
		
		Trabalhador t2 = new Trabalhador(
				txtNome2.getText(),
				Integer.parseInt(txtQt2.getText()),
				Integer.parseInt(txtTempo2.getText()),
				prg2);
		
	new Thread(t1).start();
	new Thread(t2).start();
	}
}