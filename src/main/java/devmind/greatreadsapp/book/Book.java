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

    private Long id = 1L;

    private String title;

    private String author;

    private String description;

    private LocalDateTime publishedDate;

    private List<Long> reviewsIdList;


    public Book(String title, String author, String description, LocalDateTime publishedDate, List<Long> reviewsIdList) {
        this.id = id++;
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishedDate = publishedDate;
        this.reviewsIdList = reviewsIdList;
    }
}
