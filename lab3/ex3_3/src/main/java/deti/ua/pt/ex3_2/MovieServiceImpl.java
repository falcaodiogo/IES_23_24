package deti.ua.pt.ex3_2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie getMovieById(Long movieId) {
        Optional<Movie> optionalMovie = movieRepository.findById(movieId);
        return optionalMovie.get();
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie updateMovie(Movie movie) {
        Movie existingMovie = movieRepository.findById(movie.getId()).get();
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setYear(movie.getYear());
        Movie updatedMovie = movieRepository.save(existingMovie);
        return updatedMovie;
    }

    @Override
    public void deleteMovie(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    @Override
    public List<String> getQuotesByShow(Long showId) {
        List<String> quotes = new ArrayList<>();
        Movie existingMovie = movieRepository.findById(showId).get();
        quotes.add(existingMovie.getQuote());
        return quotes;
    }

}