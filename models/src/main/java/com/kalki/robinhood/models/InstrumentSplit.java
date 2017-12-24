package com.kalki.robinhood.models;

public class InstrumentSplit {
    private String execution_date;

    private String instrument;

    private String divisor;

    private String multiplier;

    private String url;

    public String getExecution_date() {
        return execution_date;
    }

    public void setExecution_date(String execution_date) {
        this.execution_date = execution_date;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getDivisor() {
        return divisor;
    }

    public void setDivisor(String divisor) {
        this.divisor = divisor;
    }

    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
