package devmind.greatreadsapp.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {

    Long id = 1L;
    String email;
    String password;
    String firstName;
    String lastName;

    public User(String email, String password, String firstName, String lastName) {
        this.id = id++;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
