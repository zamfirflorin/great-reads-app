package devmind.greatreadsapp.admin;

import devmind.greatreadsapp.author.Author;
import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.review.ReviewDto;
import devmind.greatreadsapp.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;


    public void approveAuthorBook(Author author, Book book) {

    }

    public void rejectAuthorBook(Author author, Book book) {

    }

    public void deleteUserReview(UserDto userDto, ReviewDto reviewDto) {

    }




}
