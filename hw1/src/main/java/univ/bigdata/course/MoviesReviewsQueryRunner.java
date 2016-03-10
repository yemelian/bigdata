package univ.bigdata.course;

import univ.bigdata.course.providers.FileIOMoviesProvider;
import univ.bigdata.course.providers.MoviesProvider;

import java.io.PrintStream;

public class MoviesReviewsQueryRunner {

    public static void main(String[] args) {

        //TODO: Here you need to add the part of reading input parameters
        // opening stream for writing the output and validating.

        final PrintStream printer = null;
        try{
            final MoviesProvider provider = new FileIOMoviesProvider();
            final IMoviesStorage storage = new MoviesStorage(provider);

            printer.println("Getting list of total movies average.");
            // 1.
            printer.println();
            printer.println("TOP2.");
            storage.getTopKMoviesAverage(2).stream().forEach(printer::println);
            printer.println();
            printer.println("TOP4.");
            storage.getTopKMoviesAverage(4).stream().forEach(printer::println);

            // 2.
            printer.println("Total average: " + storage.totalMoviesAverageScore());

            // 3.
            printer.println();
            printer.println("The movie with highest average:  " + storage.movieWithHighestAverage());

            // 4.
            printer.println();
            storage.reviewCountPerMovieTopKMovies(4)
                    .entrySet()
                    .stream()
                    .forEach(pair -> printer.println("Movie product id = [" + pair.getKey() + "], reviews count [" + pair.getValue() + "]."));

            // 5.
            printer.println();
            printer.println("The most reviewed movie product id is " + storage.mostReviewedProduct());

            // 6.
            printer.println();
            printer.println("Computing 90th percentile of all movies average.");
            storage.getMoviesPercentile(90).stream().forEach(printer::println);

            printer.println();
            printer.println("Computing 50th percentile of all movies average.");
            storage.getMoviesPercentile(50).stream().forEach(printer::println);

            // 7.
            printer.println();
            printer.println("Computing TOP100 words count");
            storage.moviesReviewWordsCount(100)
                    .entrySet()
                    .forEach(pair -> printer.println("Word = [" + pair.getKey() + "], number of occurrences [" + pair.getValue() + "]."));

            // 8.
            printer.println();
            printer.println("Computing TOP100 words count for TOP100 movies");
            storage.topYMoviewsReviewTopXWordsCount(100, 100)
                    .entrySet()
                    .forEach(pair -> printer.println("Word = [" + pair.getKey() + "], number of occurrences [" + pair.getValue() + "]."));

            printer.println("Computing TOP100 words count for TOP10 movies");
            storage.topYMoviewsReviewTopXWordsCount(100, 10)
                    .entrySet()
                    .forEach(pair -> printer.println("Word = [" + pair.getKey() + "], number of occurrences [" + pair.getValue() + "]."));

            // 9.
            printer.println();
            printer.println("Most popular movie with highest average score, reviewed by at least 20 users " + storage.mostPopularMovieReviewedByKUsers(20));
            printer.println("Most popular movie with highest average score, reviewed by at least 15 users " + storage.mostPopularMovieReviewedByKUsers(15));
            printer.println("Most popular movie with highest average score, reviewed by at least 10 users " + storage.mostPopularMovieReviewedByKUsers(10));
            printer.println("Most popular movie with highest average score, reviewed by at least 5 users " + storage.mostPopularMovieReviewedByKUsers(5));

            // 10.
            printer.println();
            printer.println("Compute top 10 most helpful users.");
            storage.topKHelpfullUsers(10)
                    .entrySet()
                    .forEach(pair -> printer.println("User id = [" + pair.getKey() + "], helpfulness [" + pair.getValue() + "]."));

            printer.println();
            printer.println("Compute top 100 most helpful users.");
            storage.topKHelpfullUsers(100)
                    .entrySet()
                    .forEach(pair -> printer.println("User id = [" + pair.getKey() + "], helpfulness [" + pair.getValue() + "]."));

            // 11.
            printer.println();
            printer.println("Total number of distinct movies reviewed [" +storage.moviesCount() + "].");
            printer.println("THE END.");
        } catch (final Exception e) {
            e.printStackTrace();
        }

    }
}
