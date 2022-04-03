package devmind.greatreadsapp.book;

import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.review.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookService {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ModelMapper modelMapper;

    public BookDto getBookById(Long id) {
       return modelMapper.map(bookRepository.getBookById(id), BookDto.class);
    }

    public List<Review> getReviews(Long bookId) {
       return reviewService.getAllReviewsByBookId(bookId);
    }

    public List<BookDto> getAllBooksByCategory(String category) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getCategory().equals(category)) //Book
                .map(book -> modelMapper.map(book, BookDto.class)) //BookDto
                .collect(Collectors.toList());
    }

    public List<Book> getAllPublishedBooks() {
        return bookRepository.getAllBooks().stream()
                .filter(Book::isPublished)
                .collect(Collectors.toList());
    }

    public void addBook(BookDto bookDto) {
        bookRepository.create(new ModelMapper().map(bookDto, Book.class));
    }


}
