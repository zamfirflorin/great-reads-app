package devmind.greatreadsapp.book;


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

    private Long id;

    private String title;

    private String author;

    private String description;

    private LocalDateTime publishedDate;

    private List<Long> reviewsIdList;


}
