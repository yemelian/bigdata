package univ.bigdata.course.providers;

import univ.bigdata.course.movie.MovieReview;

public interface MoviesProvider {

    boolean hasMovie();

    MovieReview getMovie();
}
