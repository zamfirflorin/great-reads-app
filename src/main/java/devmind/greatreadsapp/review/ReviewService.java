package devmind.greatreadsapp.review;


import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.user.User;
import devmind.greatreadsapp.user.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void createReview(ReviewDto reviewDto, BookDto bookDto, UserDto userDto) {
        Review review = modelMapper.map(reviewDto, Review.class);
        review.setBook(modelMapper.map(bookDto, Book.class));
        review.setAuthor(modelMapper.map(userDto, User.class));
        reviewRepository.create(review);
    }
    public ReviewDto getReview(Long id) {
        return modelMapper.map(reviewRepository.getReviewById(id), ReviewDto.class);
    }

    public List<ReviewDto> getAllReviews() {
        return  reviewRepository.getAllReviews().stream()
                .map(review -> modelMapper.map(review, ReviewDto.class))
                .toList();
    }
    public void updateReview(ReviewDto reviewDto) {
        Review review = reviewRepository.getReviewById(reviewDto.getId());
    }

    public void deleteReview(ReviewDto reviewDto) {
        reviewRepository.delete(reviewDto.getId());
    }

    public List<Review> getAllReviewsByBookId(Long bookId) {
        return reviewRepository.getAllReviewsByBookId(bookId);
    }
}
