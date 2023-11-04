package deti.ua.pt.ex3_2;

import java.util.List;

public interface MovieService {
    Movie createMovie(Movie movie);

    Movie getMovieById(Long movieId);

    List<Movie> getAllMovies();

    Movie updateMovie(Movie movie);

    void deleteMovie(Long movieId);

    List<String> getQuotesByShow(Long showId);
}
