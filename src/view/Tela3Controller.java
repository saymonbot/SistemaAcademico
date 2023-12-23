package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import util.Mensagens;

public class Tela3Controller {

	@FXML TextField txtTamVetor;
	@FXML TextField txtNr;
	@FXML TextArea txtResult;
	
	private int[] vetor;
	private int pos = 0;
	
	@FXML
	public void instanciaVetor() {		
		try {
		int tam = Integer.parseInt(txtTamVetor.getText());
		if(tam <=0)
			throw new NumberFormatException("Negativo não permitido");
		vetor = new int[tam];
		}catch (NumberFormatException e) {
			Mensagens.msgErro("ERRO", "Número Inválido \n"+e.getMessage());
			txtNr.setAccessibleText("");
			txtNr.requestFocus();
		}catch (Exception e) {
			Mensagens.msgErro("ERRO", "Erro desconhecido");
		}
	}
	
	@FXML
	public void insereNumero() {
		try {
			int nr = Integer.parseInt(txtNr.getText());
			vetor[pos] = nr;
			pos++;
			txtResult.setText(txtResult.getText()+nr+"\n");
		}catch (NullPointerException e) {
			Mensagens.msgErro("ERRO", "Vetor não foi instanciado");
		}catch (ArrayIndexOutOfBoundsException e) {
			Mensagens.msgErro("ERRO", "Vetor lotado");
		}catch (NumberFormatException e) {
			Mensagens.msgErro("ERRO", "Número Inválido");
		}catch (Exception e) {
			Mensagens.msgErro("ERRO", "Erro desconhecido");
		}
		txtNr.setAccessibleText("");
		txtNr.requestFocus();
	}
}
