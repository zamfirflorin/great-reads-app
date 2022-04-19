package devmind.greatreadsapp.author;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.user.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Author extends User {

    private List<Book> publishedBooks;

}
