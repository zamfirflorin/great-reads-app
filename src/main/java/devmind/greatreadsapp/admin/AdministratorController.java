package devmind.greatreadsapp.admin;

import devmind.greatreadsapp.author.Author;
import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import devmind.greatreadsapp.review.ReviewDto;
import devmind.greatreadsapp.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private BookService bookService;

    public void approveAuthorBook(Author author, Book book) {

    }

    public void rejectAuthorBook(Author author, Book book) {

    }

    public void deleteUserReview(UserDto userDto, ReviewDto reviewDto) {

    }

    @PostMapping(value = "/updateBook", consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookDto updateBook(RequestBody BookDto dto) {
        return bookService.updateBook(dto);
    }


}
