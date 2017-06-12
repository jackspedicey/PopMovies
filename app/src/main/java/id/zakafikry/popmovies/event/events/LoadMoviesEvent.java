package id.zakafikry.popmovies.event.events;

import id.zakafikry.popmovies.entity.MovieResults;

public final class LoadMoviesEvent implements ApiEvent {

    public final MovieResults.SortCriteria sortCriteria;

    public LoadMoviesEvent(MovieResults.SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

}
