package com.kalki.robinhood.models;

public class FundamentalsData {
    private Double market_cap;

    private Double open;

    private Double high_52_weeks;

    private String description;

    private Double pe_ratio;

    private Double volume;

    private String instrument;

    private Double dividend_yield;

    private Double high;

    private Double low;

    private Double average_volume;

    private Double low_52_weeks;

    public Double getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(Double market_cap) {
        this.market_cap = market_cap;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh_52_weeks() {
        return high_52_weeks;
    }

    public void setHigh_52_weeks(Double high_52_weeks) {
        this.high_52_weeks = high_52_weeks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPe_ratio() {
        return pe_ratio;
    }

    public void setPe_ratio(Double pe_ratio) {
        this.pe_ratio = pe_ratio;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Double getDividend_yield() {
        return dividend_yield;
    }

    public void setDividend_yield(Double dividend_yield) {
        this.dividend_yield = dividend_yield;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getAverage_volume() {
        return average_volume;
    }

    public void setAverage_volume(Double average_volume) {
        this.average_volume = average_volume;
    }

    public Double getLow_52_weeks() {
        return low_52_weeks;
    }

    public void setLow_52_weeks(Double low_52_weeks) {
        this.low_52_weeks = low_52_weeks;
    }
}
