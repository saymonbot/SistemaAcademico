package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JanelaPopUpController {

	@FXML
	private Label label2;
	
    @FXML
    void fecharJanela() {
    	
    	try {
    		Stage stage = (Stage) label2.getScene().getWindow();
    		stage.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
