package devmind.greatreadsapp.reader;


import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.review.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ReaderDto {

    private List<Book> readBooks;

    private List<Review> reviewList;

    private List<Book> wishList;

}
