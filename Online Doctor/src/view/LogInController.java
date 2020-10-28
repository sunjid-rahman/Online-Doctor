package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogInController {
	private Stage primaryStage2;
    public void setPrimaryStage(Stage primaryStage){
               this.primaryStage2 = primaryStage;
     }
    public void logOutPerformed(ActionEvent ev) {
    	try {
			FXMLLoader loader =new  FXMLLoader(getClass().getResource("LogInOverview.fxml"));
			Stage primaryStage=new Stage();
			AnchorPane root = (AnchorPane) loader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			primaryStage2.close();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    	
    }
    public void treatmentPerformed(ActionEvent ev) {
    		try {
    			FXMLLoader loader =new  FXMLLoader(getClass().getResource("Treatment.fxml"));
    			Stage primaryStage=new Stage();
    			AnchorPane root = (AnchorPane) loader.load();
    			Scene scene = new Scene(root);
    			primaryStage.setScene(scene);
    			primaryStage.setResizable(false);
    			primaryStage.show();
    			TreatmentController controller = (TreatmentController) loader.getController();
    			controller.setPrimaryStage(primaryStage);
    			//primaryStage2.close();
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
		}
    public void appointmentPerformed(ActionEvent e) {
    	try {
			FXMLLoader loader =new  FXMLLoader(getClass().getResource("Doctorlist2.fxml"));
			Stage primaryStage=new Stage();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			AppointmentController controller = (AppointmentController) loader.getController();
			controller.setPrimaryStage(primaryStage);
			//primaryStage2.close();
			
		} catch(Exception ev) {
			ev.printStackTrace();
		}
    }
    
}
