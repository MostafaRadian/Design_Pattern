package observe.company;

public class Main {

    public static void main(String[] args)  {
        Subject subject = new Subject();
        new Professor("Ahmed Farouk", "Bioinformatics", "2020-09-29", "Biophysics", "fakemail.fci.gov@gmail.com", "01122334455", subject);
        new TA("Yossef Ali", "Bioinformatics", "fakemail@gmail.com", "01122334455", subject);
        new Student("Clown", 0, "fakemail@gmail", "01122334455", subject);

        subject.setNotification("task");
        subject.setNotification("assignment");
        subject.setNotification("Grades");
    }
}
