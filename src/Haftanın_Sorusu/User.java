package Haftanın_Sorusu;

import java.time.LocalDateTime;

public class User {
    String name;
    LocalDateTime registerDate;

    public User(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
