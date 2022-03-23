package devmind.greatreadsapp.book;

import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.review.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
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

}
