package view;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import util.Mensagens;

public class Tela1Controller {

    @FXML
    void msgAviso( ) {
    	Mensagens.msgAviso("Aviso", "Esta � uma msg de aviso");
    }

    @FXML
    void msgConfirma( ) {
    	Mensagens.msgAviso("Confirma��o", "Esta � uma msg de Confirma��o");

    }

    @FXML
    void msgErro( ) {
    	Mensagens.msgAviso("Erro", "Esta � uma msg de Erro");
    }

    @FXML
    void msgInfo( ) {
    	Mensagens.msgAviso("Informa��o", "Esta � uma msg de Informa��o");
    }

    @FXML
    void msgOkCancel( ) {
    	ButtonType ret = Mensagens.msgOkCancel("Confirma��o", "Deseja excluir?");
    	if (ret==ButtonType.OK)
    		System.out.println("Excluir");
    	else
    		System.out.println("Cancelou");
    }
}