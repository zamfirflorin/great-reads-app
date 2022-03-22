package devmind.greatreadsapp.review;


import lombok.*;

import java.time.LocalDateTime;

@Builder
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
