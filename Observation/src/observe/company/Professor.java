package observe.company;

import java.sql.Date;

public class Professor extends Observer {
    String name;
    String department;
    String hirringDate;
    String PhDTopic;
    String email;
    String phoneNumber;


    public Professor(String name, String department, String hirringDate, String phDTopic, String email,
                     String phoneNumber, Subject subject) {
        super();
        this.name = name;
        this.department = department;
        this.hirringDate = hirringDate;
        this.PhDTopic = phDTopic;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
        this.subject.addObserver(this);
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHirringDate() {
        return hirringDate;
    }

    public void setHirringDate(String hirringDate) {
        this.hirringDate = hirringDate;
    }

    public String getPhDTopic() {
        return PhDTopic;
    }

    public void setPhDTopic(String phDTopic) {
        PhDTopic = phDTopic;
    }

    @Override
    public void update() {
        System.out.print("Greetings Professor " + this.name + "\n the new " + this.subject.getNotification() + " you have added is sent to all student \n\n");
    }


}
