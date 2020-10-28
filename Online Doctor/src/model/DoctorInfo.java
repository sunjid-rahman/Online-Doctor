package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by User on 1/10/2018.
 */
public class DoctorInfo {
    private SimpleStringProperty Name;
    private SimpleStringProperty Qualification;
    private SimpleStringProperty Expertise;
    private SimpleStringProperty Organization;
    private SimpleIntegerProperty Mobile_No;

    public DoctorInfo(String name, String qualification, String expertise, String organization, Integer mobile_No) {
        super();
        this.Name = new SimpleStringProperty(name);
        this.Qualification =new SimpleStringProperty(qualification);
        this.Expertise =new SimpleStringProperty(expertise);
        this.Organization =new SimpleStringProperty(organization);
        this.Mobile_No =new SimpleIntegerProperty(mobile_No);
    }

    public String getName() {
        return Name.get();
    }

    public String nameProperty() {
        return Name.get();
    }

    public void setName(String name) {
        this.Name=Name;
    }

    public String getQualification() {
        return Qualification.get();
    }

    public String qualificationProperty() {
        return Qualification.get();
    }

    public void setQualification(String qualification) {
        this.Qualification=Qualification;
    }

    public String getExpertise() {
        return Expertise.get();
    }

    public String expertiseProperty() {
        return Expertise.get();
    }

    public void setExpertise(String expertise) {
        this.Expertise=Expertise;
    }

    public String getOrganization() {
        return Organization.get();
    }

    public String organizationProperty() {
        return Organization.get();
    }

    public void setOrganization(String organization) {
        this.Organization=Organization;
    }

    public int getMobile_No() {
        return Mobile_No.get();
    }

    public Integer mobile_NoProperty() {
        return Mobile_No.get();
    }

    public void setMobile_No(int mobile_No) {
        this.Mobile_No=Mobile_No;
    }
}
