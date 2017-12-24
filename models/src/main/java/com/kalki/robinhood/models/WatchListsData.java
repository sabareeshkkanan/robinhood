package com.kalki.robinhood.models;

public class WatchListsData {
    private String watchlist;

    private String created_at;

    private String instrument;

    private String url;

    public String getWatchlist() {
        return watchlist;
    }

    public void setWatchlist(String watchlist) {
        this.watchlist = watchlist;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
