package Builder.com.Users;

import Builder.com.Gateways.*;

import java.util.ArrayList;
import java.util.List;

public interface Director {
    EmailGateway emailGate = new EmailGateway();
    SMSGateway smsGate = new SMSGateway();
    List<Student> students = new ArrayList<Student>();

    void notifyStudent(String message);
}
