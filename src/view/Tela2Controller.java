package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Tela2Controller {

	@FXML
	public Label label;
	
    @FXML
    void abrepopup() {
    	
    	try { 
    	Stage stagePopup = new Stage();
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("JanelaPopup.fxml"));
       	Parent root = loader.load();
    	stagePopup.setScene(new Scene(root));
    	stagePopup.initOwner(label.getScene().getWindow());
    	stagePopup.initModality(Modality.WINDOW_MODAL);
    	stagePopup.initStyle(StageStyle.UNDECORATED);
    	stagePopup.setResizable(false);
    	stagePopup.show();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

}
