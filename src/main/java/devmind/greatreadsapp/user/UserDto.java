package devmind.greatreadsapp.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    String email;
    String password;
    String firstName;
    String lastName;
}
