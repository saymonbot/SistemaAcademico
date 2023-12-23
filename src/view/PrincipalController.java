package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class PrincipalController {
	
	
    @FXML
    private Label lblData;

    
    public void initialize() {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	Date data = new Date();
    	lblData.setText("Data atual: " + df.format(data));
    }
    
    
    @FXML
    void abreTela1() {
    	abreTab ("Tela 1", "Tela1.fxml");
    }

    @FXML
    void abreTela2() {
    	abreTab ("Cadastro de Clientes", "Tela2.fxml");
    }

    @FXML
    void abreTela3() {
    	abreTab ("Relatório Gerencial", "Tela3.fxml");
    }

    @FXML
    void abreTela4() {
    	abreTab ("Tela 4", "Tela4.fxml");
    }

    private void abreTab(String titulo, String path) {
    	try {
    		Tab tab = tabAberta(titulo);
    		if (tab == null) {
    			tab = new Tab(titulo);
    			tab.setClosable(true);
    			tabPane.getTabs().add(tab);
    			FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
    			Parent root = loader.load();
    			tab.setContent((Node)root);
    		}
    		selecionaTab(tab);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    private Tab tabAberta(String titulo) {
    	for (Tab tb : tabPane.getTabs()) {
    		if(!(tb.getText()==null) && tb.getText().contentEquals(titulo))
    			return tb;
    	}
    	return null;
    }
    
    private void selecionaTab(Tab tab) {
    	tabPane.getSelectionModel().select(tab);
    }
    
    @FXML
    private TabPane tabPane;
}
