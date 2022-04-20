package devmind.greatreadsapp.user;


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
     Long id ;

     @Column(name = "email")
     String email;

     @Column(name = "password")
     String password;

     @Column(name = "firstName")
     String firstName;

     @Column(name = "lastName")
     String lastName;

     @OneToMany(mappedBy = "user")
     public List<Review> reviewList;


}
