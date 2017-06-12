package id.zakafikry.popmovies.event.events;

import android.support.annotation.NonNull;

import id.zakafikry.popmovies.entity.Movie;

public class MovieLoadedEvent {

    public final Movie movie;

    public MovieLoadedEvent(@NonNull Movie movie) {
        this.movie = movie;
    }

}
