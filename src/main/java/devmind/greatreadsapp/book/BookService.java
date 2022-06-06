package devmind.greatreadsapp.book;

import devmind.greatreadsapp.review.ReviewDto;
import devmind.greatreadsapp.review.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ModelMapper modelMapper;

    public BookDto getBookById(Long id) {
       return modelMapper.map(bookRepository.findById(id), BookDto.class);
    }

    public List<ReviewDto> getReviews(Long bookId) {
       return reviewService.getAllReviewsByBookId(bookId);
    }

    public List<BookDto> getAllBooksByCategory(String category) {
        return bookRepository.findAll().stream()
                .filter(book -> book.getCategory().equals(category)) //Book
                .map(book -> modelMapper.map(book, BookDto.class)) //BookDto
                .collect(Collectors.toList());
    }

    @Transactional
    public BookDto updateBook(BookDto bookDto) {
        Book book = bookRepository.findById(bookDto.getId()).orElseThrow(() -> new BookNotFoundException(bookDto.getId()));
        //book.setCategory(bookDto.getCategory());
        book.setAuthor(book.getAuthor());
        book.setTitle(book.getTitle());
        bookRepository.save(book);
        return modelMapper.map(book, BookDto.class);
    }


    public List<Book> getAllPublishedBooks() {
        return bookRepository.findAll().stream()
                .filter(Book::isPublished)
                .collect(Collectors.toList());
    }

    public void addBook(BookDto bookDto) {
        bookRepository.save(new ModelMapper().map(bookDto, Book.class));
    }


    public void addProfilePicture(File file, Long userId) {
    }


    public void uploadBook(byte[] bytes, String name, Long bookId) {
    }
}
