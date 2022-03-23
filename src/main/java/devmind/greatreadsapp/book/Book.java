package devmind.greatreadsapp.book;


import devmind.greatreadsapp.review.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    static Long nbInstances = 1L;

    private Long id;

    private String title;

    private String author;

    private String description;

    private LocalDateTime publishedDate;

    private List<Review> reviewsList;


    public Book(String title, String author, String description, LocalDateTime publishedDate, List<Review> reviewList) {
        this.id = getNumberOfInstance();
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishedDate = publishedDate;
        this.reviewsList = reviewList;
    }

    private Long getNumberOfInstance() {
        return nbInstances++;
    }
}
