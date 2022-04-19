package devmind.greatreadsapp.review;

public class ReviewNotFoundException extends RuntimeException{

    public ReviewNotFoundException(Long reviewId) {
        super(String.format("Review with id '%d' not found.", reviewId));
    }

}
