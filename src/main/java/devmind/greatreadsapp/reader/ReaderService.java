package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookService;
import devmind.greatreadsapp.user.User;
import devmind.greatreadsapp.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReaderService {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookService bookService;

    public List<ReaderDto> getAllReaders() {
       return userService.getAllUsers().stream()
                .map(userDto -> modelMapper.map(userDto, User.class))
                .filter(user -> user instanceof Reader)
                .map(this::convertToReader)
                .map(reader -> modelMapper.map(reader, ReaderDto.class))
                .toList();
    }

    public List<Book> addToWishList() {

    }

    private Reader convertToReader(User user) {
        return new Reader(user.getEmail(), user.getPassword(), user.getFirstName(), user.getLastName(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }


}
