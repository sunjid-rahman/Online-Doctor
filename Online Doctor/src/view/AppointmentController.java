package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Appointment;
import model.DoctorInfo;
import javafx.scene.control.ToggleGroup;

import javax.naming.Name;
import javax.swing.text.TabableView;
import java.net.URL;
import java.util.ResourceBundle;

public class AppointmentController implements Initializable {
	private Stage primaryStage4;
    public void setPrimaryStage(Stage primaryStage){
               this.primaryStage4 = primaryStage;
     }
    @FXML public TableView<DoctorInfo> Doctorlist2;
    @FXML public TableColumn<DoctorInfo, String> Name;
    @FXML public TableColumn<DoctorInfo, String> Qualification;
    @FXML public TableColumn<DoctorInfo, String> Expertise;
    @FXML public TableColumn<DoctorInfo, String> Organization;
    @FXML public TableColumn<DoctorInfo, Integer> Mobile_No;

    public ObservableList<DoctorInfo> list= FXCollections.observableArrayList(
            new DoctorInfo("Dr. Begum Hosne Ara","MBBS, FCPS ( Gynae & Obs ), MS"," Gynecology & Obstetrics","Labaid Specialized Hospital, Dhanmondi, Dhaka",111),
            new DoctorInfo("Dr. Bimal Chnadra Shil","FCPS, MD ( Gastro. ) Fellow AIIMS ( India )","  Medicine & Gastroenterology","Dhaka Medical College & Hospital",1234),
            new DoctorInfo("Dr. G M Mostafa","MBBS, DO, MS ( Eye )"," Eye Surgeon - Contact Lens & Phaco","National Eye Science Institute & Hospital, Dhaka",222),
            new DoctorInfo("Professor Dr. Golam Mohiuudin Akbar Chowdhury","Professor Dr. Golam Mohiuudin Akbar Chowdhury"," Chest Surgeon","Labaid Specialized Hospital, Dhanmondi, Dhaka",1231),
            new DoctorInfo("Dr. Hossain Imam Al Hadi","MBBS, FCPS, FRCS ( Glasgow )"," ENT - Head & Neck Surgeon","Bangabandhu Sheikh Mujib Medical University (BSMMU)",1445)
            );

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Name.setCellValueFactory(new PropertyValueFactory<DoctorInfo, String>("Name"));
        Qualification.setCellValueFactory(new PropertyValueFactory<DoctorInfo, String>("Qualification"));
        Expertise.setCellValueFactory(new PropertyValueFactory<DoctorInfo, String>("Expertise"));
        Organization.setCellValueFactory(new PropertyValueFactory<DoctorInfo, String>("Organization"));
        Mobile_No.setCellValueFactory(new PropertyValueFactory<DoctorInfo, Integer>("Mobile_No"));
        Doctorlist2.setItems(list);
    }
    
    public void YesDoct1(ActionEvent e){

        Appointment ap=new Appointment();
        int count=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Successfulled");
        ap.addAppointment(count);
        alert.setContentText("Name:Dr. Begum Hosne Ara\nTime:9.00PM to 10.30PM"+"\n"+"Serial No:"+ap.serialNumber+"\n"+"Date:"+ap.date);

        alert.showAndWait();
    }
    public void NoDoct1(ActionEvent e){
        Appointment rap=new Appointment();
        int count1=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Canceled");
        rap.removeAppointment(count1);
        //alert.setContentText("Name:Dr. Begum Hosne Ara\nTime:9.00PM to 10.30PM"+"\n"+"Serial No:"+rap.serialNumber+"\n"+"Date:"+rap.date);

        alert.showAndWait();

    }
    public void YesDoct2(ActionEvent e){
        Appointment ap=new Appointment();
        int count=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Successfulled");
        ap.addAppointment(count);
        alert.setContentText("Name:Dr. Bimal Chnadra Shil\nTime:9.00PM to 10.00PM"+"\n"+"Serial No:"+ap.serialNumber+"\n"+"Date:"+ap.date);

        alert.showAndWait();
    }
    public void NoDoct2(ActionEvent e){
        Appointment rap=new Appointment();
        int count1=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Canceled");
        rap.removeAppointment(count1);
        alert.showAndWait();
    }
    public void YesDoct3(ActionEvent e){
        Appointment ap=new Appointment();
        int count=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Successfulled");
        ap.addAppointment(count);
        alert.setContentText("Name:Dr. G M Mostafa\nTime:10.00PM to 11.00PM"+"\n"+"Serial No:"+ap.serialNumber+"\n"+"Date:"+ap.date);

        alert.showAndWait();
    }
    public void NoDoct3(ActionEvent e){
        Appointment rap=new Appointment();
        int count1=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Canceling Appointment");
        alert.setHeaderText("Appointment is Canceled");
        rap.removeAppointment(count1);
        alert.showAndWait();
    }
    public void YesDoct4(ActionEvent e){
        Appointment ap=new Appointment();
        int count=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Successfulled");
        ap.addAppointment(count);
        alert.setContentText("Name:Professor Dr. Golam Mohiuudin Akbar Chowdhury\nTime:8.30 PM to 9.30PM"+"\n"+"Serial No:"+ap.serialNumber+"\n"+"Date:"+ap.date);

        alert.showAndWait();
    }
    public void NoDoct4(ActionEvent e){
        Appointment rap=new Appointment();
        int count1=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Canceled");
        rap.removeAppointment(count1);
        
        alert.showAndWait();
    }
    public void YesDoct5(ActionEvent e){
        Appointment ap=new Appointment();
        int count=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Successfulled");
        ap.addAppointment(count);
        alert.setContentText("Name:Dr. Hossain Imam Al Hadi\nTime:8.00PM to 9.30PM"+"\n"+"Serial No:"+ap.serialNumber+"\n"+"Date:"+ap.date);

        alert.showAndWait();
    }
    public void NoDoct5(ActionEvent e){
        Appointment rap=new Appointment();
        int count1=1;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Appointment");
        alert.setHeaderText("Appointment is Canceled");
        rap.removeAppointment(count1);
       
        alert.showAndWait();
    }
}
