package view;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;

public class SignUpController  {
	 private Stage primaryStage;
	 
     public void setPrimaryStage(Stage primaryStage){
                this.primaryStage = primaryStage;
      }
     @FXML TextField tf1;
     @FXML PasswordField pf;
     @FXML Label msg;
	public void signUpAction(ActionEvent event) {
		try {
			AnchorPane lo;
			Stage primaryStage1=new Stage();
			FXMLLoader loader =new  FXMLLoader(getClass().getResource("SignUpOverview.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			primaryStage1.setScene(scene);
			primaryStage1.setResizable(false);
			primaryStage1.show();
			primaryStage.close();
			UserInfoController controller = (UserInfoController) loader.getController();
			controller.setPrimaryStage(primaryStage1);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loginAction(ActionEvent ev) {
		try {
			AnchorPane lO;
			Stage primaryStage2=new Stage();
			FXMLLoader loader =new  FXMLLoader(getClass().getResource("Home.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			primaryStage2.setScene(scene);
			primaryStage2.setResizable(false);
			
			String txtf=tf1.getText();
			String psw=pf.getText();
			User lin=new User();
			if(!txtf.equals("")&&!psw.equals("")) {
				lin.setUserName(txtf);
				lin.setPassWord(psw);
				try {
					FileInputStream fis=new FileInputStream("User.obj");
					ObjectInputStream oos=new ObjectInputStream(fis);
					Set<User>lset=(HashSet<User>)oos.readObject();
					
					if(Main.us.contains(lin)==true) {
						primaryStage2.show();
						primaryStage.close();
					}
					else if(lset.contains(lin)==false) {
						msg.setText("Username or Password is incorrect");
					}
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			else if(txtf.equals("")||psw.equals("")){
				msg.setText("Enter Valid Username and Password");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		
		}
		
	}
}
