package univ.bigdata.course;

import univ.bigdata.course.movie.Movie;
import univ.bigdata.course.providers.MoviesProvider;

import java.util.List;
import java.util.Map;

/**
 * Main class which capable to keep all information regarding movies review.
 * Has to implements all methods from @{@link IMoviesStorage} interface.
 * Also presents functionality to answer different user queries, such as:
 * <p>
 * 1. Total number of distinct movies reviewed.
 * 2. Total number of distinct users that produces the review.
 * 3. Average review score for all movies.
 * 4. Average review score per single movie.
 * 5. Most popular movie reviewed by at least "K" unique users
 * 6. Word count for movie review, select top "K" words
 * 7. K most helpful users
 */
public class MoviesStorage implements IMoviesStorage {

    public MoviesStorage(final MoviesProvider provider) {
        //TODO: read movies using provider interface
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public double totalMoviesAverageScore() {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public double totalMovieAverage(String productId) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public List<Movie> getTopKMoviesAverage(long topK) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public Movie movieWithHighestAverage() {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public List<Movie> getMoviesPercentile(double percentile) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public String mostReviewedProduct() {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public Map<String, Long> reviewCountPerMovieTopKMovies(int topK) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public String mostPopularMovieReviewedByKUsers(int numOfUsers) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public Map<String, Long> moviesReviewWordsCount(int topK) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public Map<String, Long> topYMoviewsReviewTopXWordsCount(int topMovies, int topWords) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public Map<String, Double> topKHelpfullUsers(int k) {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public long moviesCount() {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }
}
