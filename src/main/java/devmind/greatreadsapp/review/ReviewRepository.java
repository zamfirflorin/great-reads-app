package devmind.greatreadsapp.review;

import devmind.greatreadsapp.InMemoryDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ReviewRepository {

    @Autowired
    private InMemoryDataStore inMemoryDataStore;

    public void create(Review review) {
        inMemoryDataStore.getReviewMap().put(review.getId(), review);
    }

    public Review getReviewById(Long id) {
        return inMemoryDataStore.getReviewMap().get(id);
    }
    public List<Review> getAllReviews() {
        List<Review> reviewList = new ArrayList<>();
        Map<Long, Review> reviewMap = inMemoryDataStore.getReviewMap();
        for (Long key : reviewMap.keySet()) {
            reviewList.add(reviewMap.get(key));
        }
        return reviewList;
    }

    public void updateReview(Review review) {
        inMemoryDataStore.getReviewMap().put(review.getId(), review);
    }
    public void delete(Long id) {
        inMemoryDataStore.getReviewMap().remove(id);
    }

    public List<Review> getAllReviewsByBookId(Long bookId) {
        List<Review> reviewList = new ArrayList<>();
        Map<Long, Review> reviewMap = inMemoryDataStore.getReviewMap();

        for (Long key : reviewMap.keySet()) {
            if (reviewMap.get(key).getBook().getId().equals(bookId)) {
                reviewList.add(reviewMap.get(key));
            }
        }
        return reviewList;
    }
}
