package devmind.greatreadsapp.user;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
