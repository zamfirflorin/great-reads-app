package devmind.greatreadsapp.user;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public  class User {

    static Long nbInstances = 1L;
     Long id ;
     String email;
     String password;
     String firstName;
     String lastName;

    public User(String email, String password, String firstName, String lastName) {
        this.id = getNumberOfInstance();
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Long getNumberOfInstance() {
        return nbInstances++;
    }
}
