package observe.company;

public class Student extends Observer {
    String name;
    int Id;
    String email;
    String phoneNumber;


    public Student(String name, int id, String email, String phoneNumber,Subject subject) {
        super();
        this.name = name;
        Id = id;
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void studentObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.print("Hello student " + this.name + "\n a new " + this.subject.getNotification() + " is added \n \n");
    }
}
