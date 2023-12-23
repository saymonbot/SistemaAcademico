package view;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import util.Mensagens;

public class Tela1Controller {

    @FXML
    void msgAviso( ) {
    	Mensagens.msgAviso("Aviso", "Esta é uma msg de aviso");
    }

    @FXML
    void msgConfirma( ) {
    	Mensagens.msgAviso("Confirmação", "Esta é uma msg de Confirmação");

    }

    @FXML
    void msgErro( ) {
    	Mensagens.msgAviso("Erro", "Esta é uma msg de Erro");
    }

    @FXML
    void msgInfo( ) {
    	Mensagens.msgAviso("Informação", "Esta é uma msg de Informação");
    }

    @FXML
    void msgOkCancel( ) {
    	ButtonType ret = Mensagens.msgOkCancel("Confirmação", "Deseja excluir?");
    	if (ret==ButtonType.OK)
    		System.out.println("Excluir");
    	else
    		System.out.println("Cancelou");
    }
    
}
