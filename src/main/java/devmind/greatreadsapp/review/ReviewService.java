package devmind.greatreadsapp.review;


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

    public void createReview(ReviewDto reviewDto) {
        Review review = modelMapper.map(reviewDto, Review.class);
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

}
