package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;
import model.UserInfo;

public class UserInfoController {
	@FXML TextField tfn ;
	@FXML TextField tln;
	//@FXML TextField tem;
	@FXML TextField tbgp;
	@FXML TextField tage;
	@FXML TextField tun;
	@FXML PasswordField pass;
	@FXML Label msg;
	@FXML Label usn;
	private Stage primaryStage1;
    public void setPrimaryStage(Stage primaryStage){
               this.primaryStage1 = primaryStage;
     }
	public void saveUserInfo(ActionEvent ev) {
			String fn=tfn.getText();
			String ln=tln.getText();
			//String em=tem.getText();
			String bgp=tbgp.getText();
			String un=tun.getText();
			String ages=tage.getText();
			String pas=pass.getText();
			UserInfo as=new UserInfo();
			User up=new User();
			if(!fn.equals("")&&!ln.equals("")&&!bgp.equals("")&&!un.equals("")&&!ages.equals("")&&!pas.equals("")) {
				msg.setText("");
				as.setFirstName(fn);
				Integer ag=Integer.parseInt(ages);
				as.setLastName(ln);
				//as.setEmail(em);
				as.setUserName(un);
				as.setBloodgroup(bgp);
				as.setAge(ag);
				as.setPassWord(pas);
				up.setUserName(un);
				up.setPassWord(pas);
				try {
					FileInputStream fr=new FileInputStream("Userinfo.obj");
					ObjectInputStream os=new ObjectInputStream(fr);
					ArrayList<UserInfo> uill = (ArrayList<UserInfo>) os.readObject();
					FileOutputStream fos=new FileOutputStream("Userinfo.obj");
					ObjectOutputStream oss=new ObjectOutputStream(fos);
					uill.add(as);
					oss.writeObject(Main.uil);
					oss.flush();
					oss.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					FileInputStream fis=new FileInputStream("User.obj");
					ObjectInputStream oos=new ObjectInputStream(fis);
					HashSet<User>lset=(HashSet<User>)oos.readObject();
					if(lset.contains(up)==false) {
						lset.add(up);
						Main.us.add(up);
						FileOutputStream frr=new FileOutputStream("User.obj");
						ObjectOutputStream ous=new ObjectOutputStream(frr);
						ous.writeObject(lset);
						ous.flush();
						ous.close();
						}
					else {
						msg.setText("Username is already been exist");
					}
					
				}
				catch(IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					AnchorPane lO;
					Stage primaryStage2=new Stage();
					FXMLLoader loader =new  FXMLLoader(getClass().getResource("Home.fxml"));
					AnchorPane root = (AnchorPane) loader.load();
					Scene scene = new Scene(root);
					primaryStage2.setScene(scene);
					primaryStage2.setResizable(false);
					//usn.setText("@"+up.getUserName());
					primaryStage2.show();
					primaryStage1.close();
					LogInController controller = (LogInController) loader.getController();
					controller.setPrimaryStage(primaryStage2);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			else {
				msg.setText("Please fill up the form");
			}
			
			
	}
	public void cancelPerformed(ActionEvent ce) {
		try {
			FXMLLoader loader =new  FXMLLoader(getClass().getResource("LogInOverview.fxml"));
			Stage primaryStage=new Stage();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			primaryStage1.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}