package id.zakafikry.popmovies.event.events;

import id.zakafikry.popmovies.entity.Movie;

public class UpdateMovieEvent {

    public final Movie movie;

    public UpdateMovieEvent(Movie movie) {
        this.movie = movie;
    }

}
