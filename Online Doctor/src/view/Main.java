package view;
	
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.User;
import model.UserInfo;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
public class Main extends Application {
	
	private Stage primaryStage;
	static ArrayList<UserInfo> uil=new ArrayList<>();
    static HashSet<User> us=new HashSet<>();
    public void setPrimaryStage(Stage primaryStage){
               this.primaryStage = primaryStage;
     }
    @Override
	public void start(Stage primaryStage){
		try {
			FXMLLoader loader =new  FXMLLoader(getClass().getResource("LogInOverview.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			createFile();
		} catch(Exception e) {
			System.out.println("This is main controller");
			e.printStackTrace();
		}
	}
    public void createFile() {
	     try {
				FileOutputStream fr=new FileOutputStream("Userinfo.obj");
				ObjectOutputStream os=new ObjectOutputStream(fr);
				uil.add(null);
				os.writeObject(uil);
				os.flush();
				os.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream frr=new FileOutputStream("User.obj");
					ObjectOutputStream oos=new ObjectOutputStream(frr);
					us.add(null);
					oos.writeObject(us);
					oos.flush();
					oos.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
