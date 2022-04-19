package devmind.greatreadsapp.review;


import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "rating")
    private Long rating;

    private User author;
    private Book book;
    private LocalDateTime publishedTimestamp;


}
