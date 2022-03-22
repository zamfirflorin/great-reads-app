package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
@Component
public class Reader extends User {

    private List<Book> readBooks;

    private List<Review> reviewList;

    private List<Book> wishList;

    public Reader(String email, String password, String firstName, String lastName, List<Book> readBooks, List<Review> reviewList, List<Book> wishList) {
        super(email, password, firstName, lastName);
        this.readBooks = readBooks;
        this.reviewList = reviewList;
        this.wishList = wishList;
    }
}
