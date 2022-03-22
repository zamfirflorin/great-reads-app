package devmind.greatreadsapp.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {

    Long id;
    String email;
    String password;
    String firstName;
    String lastName;

    public User(Long id, String email, String password, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}