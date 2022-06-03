package observe.company;

public class TA extends Observer {
    String name;
    String department;
    String email;
    String phoneNumber;


    public TA(String name, String department, String email, String phoneNumber,Subject subject) {
        super();
        this.name = name;
        this.department = department;
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

    public void taObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.print("Hello TA " + this.name + "\n the new " + this.subject.getNotification() + " you have added is sent to all student \n \n");
    }
}
