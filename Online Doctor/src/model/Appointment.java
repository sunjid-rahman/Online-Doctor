package model;

public class Appointment {
    public int date;
    public int serialNumber;
    public Appointment() {

    }
    public Appointment(int date, int serialNumber) {
        super();
        this.date = date;
        this.serialNumber = serialNumber;
    }
    public void addAppointment(int count) {
        if((serialNumber+count)<=20&&(date+count)<=30)
        {
            this.serialNumber=serialNumber+count;
            this.date=this.date+1;
        }
        else {
            if((date+count)<=30) {
                this.date=date+count;
                this.serialNumber=1;
            }
            else {
                this.date=1;
                this.serialNumber=1;
            }
        }
    }

    public void removeAppointment(int count){
        if((serialNumber-count)>=0&&(date-count)>=0)
        {
            this.serialNumber=serialNumber-count;
            this.date=this.date-1;
        }
        else {
            if((date-count)>=0) {
                this.date=date-count;
                this.serialNumber=-1;
            }
            else {
                this.date=-1;
                this.serialNumber=-1;
            }
        }
    }
}
