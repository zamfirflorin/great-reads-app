package devmind.greatreadsapp.book;

import devmind.greatreadsapp.review.Review;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Long id;

    private String title;

    private String author;

    private String description;

    private LocalDateTime publishedDate;

    private List<Review> reviewsList;

    private String category;

    private boolean isPublished;
}
