package cor.com;

import cor.com.Users.users;

public interface handler {
    void setNext(baseHandler next);

    void handle(String request);
}
