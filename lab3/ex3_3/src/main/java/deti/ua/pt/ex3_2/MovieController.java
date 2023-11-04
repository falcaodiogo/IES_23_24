package deti.ua.pt.ex3_2;

import lombok.AllArgsConstructor;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("movies")
public class MovieController {

    private MovieService movieService;

    @GetMapping( "/index" ) // could also be @GetMapping( "/" )
    public String index( Model model ) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "index";
    }

    // build create Movie REST API
    @PostMapping
    public ResponseEntity<Movie> createMovei(@RequestBody Movie movie){
        Movie savedMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    // build get movie by id REST API
    // http://localhost:8080/movies/1
    @GetMapping("{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long movieId){
        Movie movie = movieService.getMovieById(movieId);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    // Build Get All Movies REST API
    // http://localhost:8080/shows
    @GetMapping("shows")
    public ResponseEntity<List<String>> getAllMovies(){
        List<String> names = new ArrayList<>();
        for (Movie m: movieService.getAllMovies()) {
            names.add(m.getTitle());
        }
        return new ResponseEntity<>(names, HttpStatus.OK);
    }

    // Build Update Movie REST API
    @PutMapping("{id}")
    // http://localhost:8080/movies/1
    public ResponseEntity<Movie> updateMovie(@PathVariable("id") Long movieId,
                                           @RequestBody Movie movie){
        movie.setId(movieId);
        Movie updatedMovie = movieService.updateMovie(movie);
        return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
    }

    // Build Delete Movie REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id") Long movieId){
        movieService.deleteMovie(movieId);
        return new ResponseEntity<>("Movie successfully deleted!", HttpStatus.OK);
    }

    // Get quotes by show/film ID
    @GetMapping("quotes")
    public ResponseEntity<List<String>> getQuotesByShow(@RequestParam(name = "show", required = true) Long showId) {
        List<String> quotes = movieService.getQuotesByShow(showId);
        return new ResponseEntity<>(quotes, HttpStatus.OK);
    }

}
