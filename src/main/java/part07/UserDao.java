package part07;

import java.util.Arrays;
import java.util.List;

public class UserDao {
    public List<User> findAllUsers() {
        return Arrays.asList(new User("Martin"), new User("Dean"));
    }
}
