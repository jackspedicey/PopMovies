package id.zakafikry.popmovies.event.events;

import android.support.annotation.NonNull;

import id.zakafikry.popmovies.entity.Movie;

public final class MovieUpdatedEvent {

    public final Movie movie;

    public MovieUpdatedEvent(@NonNull Movie movie) {
        this.movie = movie;
    }

}
