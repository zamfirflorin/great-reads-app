package devmind.greatreadsapp.book;

import lombok.*;

import java.time.LocalDateTime;

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
}
