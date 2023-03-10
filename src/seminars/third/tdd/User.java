package seminars.third.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class User {
    public String name;
    public String pass;

    public Integer max = 100000;

    public ArrayList<String> new_user = new ArrayList<>();

    public User(String name, String pass){
        this.name = name;
        this.pass = pass;
    }

    public boolean auth(String login, String pass) {
       return Objects.equals(login, this.name) && Objects.equals(pass, this.pass);
    }
    public boolean addUser(String name, String pass){
        if (auth(name, pass) == true){
            new_user.add(String.valueOf(name));
        }
        return Arrays.asList(new_user).contains(name);
    }


}
