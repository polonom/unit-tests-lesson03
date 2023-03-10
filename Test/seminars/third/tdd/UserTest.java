package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreation() {
        User user = new User("Pavel", "qwerty");
        String login = "Pavel";
        String pass = "qwerty";
        assertTrue(user.auth(login, pass));
    }

    @Test
    void userIsHere() {
        User user = new User("Pavel", "qwerty");
        String login = "Pavel";
        String pass = "qwerty";
        assertFalse(user.addUser(login, pass));

    }
}