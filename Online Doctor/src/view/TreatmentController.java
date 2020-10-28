package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TreatmentController {
	private Stage primaryStage3;
    public void setPrimaryStage(Stage primaryStage){
               this.primaryStage3 = primaryStage;
     }
    public void feverAction(ActionEvent e) {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setTitle("Primary Treatment");
    	alert.setHeaderText("Medicine for Fever"); 	
    	alert.setContentText("Sinapol(125mg/5mg-Suspension:(1+0+1) After Eating)"+"\n"+"tamen(500mg/tablet):(1+1+1) After Eating"+"\n"+"Losectil(10mg/tablet):(1+0+1) Before Eating");
    	alert.showAndWait();
    }
    public void coldAction(ActionEvent e) {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setTitle("Primary Treatment");
    	alert.setHeaderText("Medicine for Cold"); 	
    	alert.setContentText("Brofex(10mg/5ml)Syrup (1+0+1) After Eating)"+"\n"+"DEXTROMETHORPHAN(10mg/5ml):(1+0+1) After Eating"+"\n"+"PPI20(20mg/tablet):(1+0+1) Before Eating");
    	alert.showAndWait();
    }
    public void headAction(ActionEvent e) {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setTitle("Primary Treatment");
    	alert.setHeaderText("Medicine for Headache"); 	
    	alert.setContentText("Seclo(20mg-tablet:(1+0+1) Before Eating)"+"\n"+"Topriva(25mg/tablet):(1+1+1) After Eating"+"\n"+"Altrip(6.25mg/tablet):(1+0+1) After Eating");
    	alert.showAndWait();
    }
    
    
}
