package devmind.greatreadsapp.user;


import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.review.Review;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

     @Id
     @Column(name = "id")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id ;

     @Column(name = "email")
     private String email;

     @Column(name = "password")
     private String password;

     @Column(name = "firstName")
     private String firstName;

     @Column(name = "lastName")
     private String lastName;

     @Column(name = "role")
     private String role;


}
