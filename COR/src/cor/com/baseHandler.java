package cor.com;
import cor.com.Users.*;

import java.util.Objects;

public class baseHandler implements handler {
    baseHandler next;
    users user;
    Course course = new Course("Advanced software","SW2345");

    @Override
    public void setNext(baseHandler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        if(next!=null)
            next.handle(request);
        else{
            if(Objects.equals(request, "Assignment"))
                course.AddAssignment(request,user);
            else if(Objects.equals(request, "Exam"))
                course.AddExam(request,user);
            else if(Objects.equals(request, "Task"))
                course.AddTask(request,user);
            else if(Objects.equals(request, "Grades"))
                course.PostGrade(request,user);
        }
    }
}
