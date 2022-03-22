package devmind.greatreadsapp.review;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {

    private Long id;
    private String comment;
    private Long rating;
    private String author;
    private LocalDateTime publishedTimestamp;

}
