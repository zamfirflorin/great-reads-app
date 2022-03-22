package devmind.greatreadsapp.admin;


import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Administrator extends User {

    public Administrator(String email, String password, String firstName, String lastName) {
        super(email, password, firstName, lastName);
    }


}
