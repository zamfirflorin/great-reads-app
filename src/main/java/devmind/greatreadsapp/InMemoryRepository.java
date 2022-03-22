package devmind.greatreadsapp;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@Component
public class InMemoryRepository {

    Map<Long, User>  userMap;
    Map<Long, Book> bookMap;
    Map<Long, Review> reviewMap;

}
