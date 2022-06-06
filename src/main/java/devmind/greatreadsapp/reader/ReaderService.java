package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.review.ReviewDto;
import devmind.greatreadsapp.review.ReviewService;
import devmind.greatreadsapp.user.User;
import devmind.greatreadsapp.user.UserService;
import devmind.greatreadsapp.user.UserType;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookService bookService;

    @Autowired
    private ReviewService reviewService;

    public List<ReaderDto> getAllReaders() {
       return userService.getAllUsers().stream()
                .map(userDto -> modelMapper.map(userDto, User.class))
                .filter(user -> user.getRole().equals(UserType.READER))
                .map(reader -> modelMapper.map(reader, ReaderDto.class))
                .toList();
    }

    public List<Book> addToWishList(Long readerId, Long bookId) {

        BookDto bookDto = bookService.getBookById(bookId);
        return List.of();
    }

    public List<Book> addToReadList(ReaderDto readerDto, Long bookId) {
        List<Book> readList = readerDto.getReadBooks();
        BookDto bookDto = bookService.getBookById(bookId);
        readList.add(modelMapper.map(bookDto, Book.class));
        return readList;
    }

    public List<Review> addToReviewList(ReaderDto readerDto, Long reviewId) {
        List<Review> reviewList = readerDto.getReviewList();
        ReviewDto reviewDto = reviewService.getReview(reviewId);
        reviewList.add(modelMapper.map(reviewDto, Review.class));
        return reviewList;
    }

    public void addReviewToBook(ReaderDto readerDto, BookDto bookDto, ReviewDto reviewDto) {
        List<Review> reviewList = readerDto.getReviewList();
        reviewList.add(modelMapper.map(reviewDto, Review.class));
    }

    public void downlodEbook(BookDto bookDto) {

    }

}
