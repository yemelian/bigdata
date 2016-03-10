package univ.bigdata.course;

import univ.bigdata.course.movie.Movie;

import java.util.List;
import java.util.Map;

public interface IMoviesStorage {

    /**
     * Method which calculates total scores average for all movies.
     *
     * @return - the average
     */
    double totalMoviesAverageScore();

    /**
     * For given movies calculates an average score of this movie.
     *
     * @param productId - id of the movie to calculate the average score.
     * @return - movie's average
     */
    double totalMovieAverage(final String productId);

    /**
     * For each movie calculates it's average score. List should be sorted
     * by average score in decreasing order and in case of same average tie
     * should be broken by natural order of product id. Only top k movies
     * with highest average should be returned
     *
     * @param topK - number of top movies to return
     * @return - list of movies where each @{@link Movie} includes it's average
     */
    List<Movie> getTopKMoviesAverage(final long topK);

    /**
     * Finds movie with the highest average score among all available movies.
     * If more than one movie has same average score, then movie with lowest
     * product id ordered lexicographically.
     *
     * @return - the movies record @{@link Movie}
     */
    Movie movieWithHighestAverage();

    /**
     * Returns a list of movies which has average of given percentile.
     * List should be sorted according the average score of movie and in case there
     * are more than one movie with same average score, sort by product id
     * lexicographically in natural order.
     *
     * @param percent - the percentile, value in range between [0..100]
     * @return - movies list
     */
    List<Movie> getMoviesPercentile(final double percent);

    /**
     * @return - the product id of most reviewed movie among all movies
     */
    String mostReviewedProduct();

    /**
     * Computes reviews count per movie, sorted by reviews count in decreasing order, for movies
     * with same amount of review should be ordered by product id. Returns only top k movies with
     * highest review count.
     *
     * @return - returns map with movies product id and the count of over all reviews assigned to it.
     */
    Map<String, Long> reviewCountPerMovieTopKMovies(final int topK);

    /**
     * Computes most popular movie which has been reviewed by at least
     * numOfUsers (provided as parameter).
     *
     * @param numOfUsers - limit of minimum users which reviewed the movie
     * @return - movie which got highest count of reviews
     */
    String mostPopularMovieReviewedByKUsers(final int numOfUsers);

    /**
     * Compute map of words count for top K words
     *
     * @param topK - top k number
     * @return - map where key is the word and value is the number of occurrences
     * of this word in the reviews summary, map ordered by words count in decreasing order.
     */
    Map<String, Long> moviesReviewWordsCount(final int topK);

    /**
     * Compute words count map for top Y most reviewed movies. Map includes top K
     * words.
     *
     * @param topMovies - number of top review movies
     * @param topWords - number of top words to return
     * @return - map of words to count, ordered by count in decreasing order.
     */
    Map<String, Long> topYMoviewsReviewTopXWordsCount(final int topMovies, final int topWords);

    /**
     * Compute top k most helpful users that provided reviews for movies
     *
     * @param k - number of users to return
     * @return - map of users to number of reviews they made. Map ordered by number of reviews
     * in decreasing order.
     */
    Map<String, Double> topKHelpfullUsers(final int k);

    /**
     * Total movies count
     */
    long moviesCount();

}
