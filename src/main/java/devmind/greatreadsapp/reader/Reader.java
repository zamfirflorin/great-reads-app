package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Reader extends User {

    private List<Book> readBooks;

    private List<Review> reviewList;

    private List<Book> wishList;

}
