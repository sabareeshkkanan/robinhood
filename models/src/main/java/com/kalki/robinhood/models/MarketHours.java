package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class MarketHours {
    private String previous_open_hours;

    private String next_open_hours;

    private ZonedDateTime closes_at;

    private Boolean is_open;

    private ZonedDateTime opens_at;

    private ZonedDateTime extended_opens_at;

    private ZonedDateTime date;

    private ZonedDateTime extended_closes_at;

    public String getPrevious_open_hours() {
        return previous_open_hours;
    }

    public void setPrevious_open_hours(String previous_open_hours) {
        this.previous_open_hours = previous_open_hours;
    }

    public String getNext_open_hours() {
        return next_open_hours;
    }

    public void setNext_open_hours(String next_open_hours) {
        this.next_open_hours = next_open_hours;
    }

    public ZonedDateTime getCloses_at() {
        return closes_at;
    }

    public void setCloses_at(ZonedDateTime closes_at) {
        this.closes_at = closes_at;
    }

    public Boolean getIs_open() {
        return is_open;
    }

    public void setIs_open(Boolean is_open) {
        this.is_open = is_open;
    }

    public ZonedDateTime getOpens_at() {
        return opens_at;
    }

    public void setOpens_at(ZonedDateTime opens_at) {
        this.opens_at = opens_at;
    }

    public ZonedDateTime getExtended_opens_at() {
        return extended_opens_at;
    }

    public void setExtended_opens_at(ZonedDateTime extended_opens_at) {
        this.extended_opens_at = extended_opens_at;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public ZonedDateTime getExtended_closes_at() {
        return extended_closes_at;
    }

    public void setExtended_closes_at(ZonedDateTime extended_closes_at) {
        this.extended_closes_at = extended_closes_at;
    }
}
