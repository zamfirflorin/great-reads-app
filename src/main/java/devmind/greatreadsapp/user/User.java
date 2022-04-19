package devmind.greatreadsapp.user;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
public  class User {

     @Id
     @Column(name = "id")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id ;

     @Column(name = "email")
     String email;

     @Column(name = "password")
     String password;

     @Column(name = "firstName")
     String firstName;

     @Column(name = "lastName")
     String lastName;

}
