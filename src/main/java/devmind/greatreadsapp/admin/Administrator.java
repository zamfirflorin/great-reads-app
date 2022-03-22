package devmind.greatreadsapp.admin;


import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Administrator extends User {

    public Administrator(Long id, String email, String password, String firstName, String lastName) {
        super(id, email, password, firstName, lastName);
    }


}
