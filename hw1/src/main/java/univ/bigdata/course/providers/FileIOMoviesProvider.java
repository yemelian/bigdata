package univ.bigdata.course.providers;

import univ.bigdata.course.movie.MovieReview;

public class FileIOMoviesProvider implements MoviesProvider {

    @Override
    public boolean hasMovie() {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }

    @Override
    public MovieReview getMovie() {
        throw new UnsupportedOperationException("You have to implement this method on your own.");
    }
}
