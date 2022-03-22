package devmind.greatreadsapp.review;


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
    private String author;
    private LocalDateTime publishedTimestamp;

    public Review(String comment, Long rating, String author, LocalDateTime publishedTimestamp) {
        this.id = id++;
        this.comment = comment;
        this.rating = rating;
        this.author = author;
        this.publishedTimestamp = publishedTimestamp;
    }

    private Long getNumberOfInstance() {
        return nbInstances++;
    }
}
