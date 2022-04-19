package devmind.greatreadsapp.book;


import devmind.greatreadsapp.review.Review;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "desription")
    private String description;

    @Column(name = "published_date")
    private LocalDateTime publishedDate;

    @OneToMany
    private List<Review> reviewsList;

    @Column(name = "category")
    private String category;

    @Column(name = "is_published")
    private boolean isPublished;

}
