package id.zakafikry.popmovies.event.events;

import java.util.List;

import id.zakafikry.popmovies.entity.Movie;
import id.zakafikry.popmovies.entity.MovieResults;

public final class MoviesLoadedEvent {

    public final List<Movie> movies;
    public final MovieResults.SortCriteria sortCriteria;

    public MoviesLoadedEvent(List<Movie> movies, MovieResults.SortCriteria sortCriteria) {
        this.movies = movies;
        this.sortCriteria = sortCriteria;
    }

}
