package devmind.greatreadsapp.review;


import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class Review {

    static Long nbInstances = 1L;
    private Long id;
    private String comment;
    private Long rating;
    private User author;
    private Book book;
    private LocalDateTime publishedTimestamp;

    public Review(String comment, Long rating, User author, LocalDateTime publishedTimestamp, Book book) {
        this.id = id++;
        this.comment = comment;
        this.rating = rating;
        this.author = author;
        this.publishedTimestamp = publishedTimestamp;
        this.book = book;
    }

    private Long getNumberOfInstance() {
        return nbInstances++;
    }
}
