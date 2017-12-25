package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class MoverInfo {
    private String instrument_url;

    private ZonedDateTime updated_at;

    private String symbol;

    private String description;

    private PriceMovement price_movement;

    public String getInstrument_url() {
        return instrument_url;
    }

    public void setInstrument_url(String instrument_url) {
        this.instrument_url = instrument_url;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PriceMovement getPrice_movement() {
        return price_movement;
    }

    public void setPrice_movement(PriceMovement price_movement) {
        this.price_movement = price_movement;
    }
}
