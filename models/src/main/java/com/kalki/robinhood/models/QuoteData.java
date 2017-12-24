package com.kalki.robinhood.models;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class QuoteData {
    private String adjusted_previous_close;

    private LocalDate previous_close_date;

    private String bid_price;

    private ZonedDateTime updated_at;

    private boolean trading_halted;

    private String symbol;

    private String ask_price;

    private Integer bid_size;

    private String last_extended_hours_trade_price;

    private String last_trade_price;

    private String previous_close;

    private Integer ask_size;

    public String getAdjusted_previous_close() {
        return adjusted_previous_close;
    }

    public void setAdjusted_previous_close(String adjusted_previous_close) {
        this.adjusted_previous_close = adjusted_previous_close;
    }

    public LocalDate getPrevious_close_date() {
        return previous_close_date;
    }

    public void setPrevious_close_date(LocalDate previous_close_date) {
        this.previous_close_date = previous_close_date;
    }

    public String getBid_price() {
        return bid_price;
    }

    public void setBid_price(String bid_price) {
        this.bid_price = bid_price;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isTrading_halted() {
        return trading_halted;
    }

    public void setTrading_halted(boolean trading_halted) {
        this.trading_halted = trading_halted;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAsk_price() {
        return ask_price;
    }

    public void setAsk_price(String ask_price) {
        this.ask_price = ask_price;
    }

    public Integer getBid_size() {
        return bid_size;
    }

    public void setBid_size(Integer bid_size) {
        this.bid_size = bid_size;
    }

    public String getLast_extended_hours_trade_price() {
        return last_extended_hours_trade_price;
    }

    public void setLast_extended_hours_trade_price(String last_extended_hours_trade_price) {
        this.last_extended_hours_trade_price = last_extended_hours_trade_price;
    }

    public String getLast_trade_price() {
        return last_trade_price;
    }

    public void setLast_trade_price(String last_trade_price) {
        this.last_trade_price = last_trade_price;
    }

    public String getPrevious_close() {
        return previous_close;
    }

    public void setPrevious_close(String previous_close) {
        this.previous_close = previous_close;
    }

    public Integer getAsk_size() {
        return ask_size;
    }

    public void setAsk_size(Integer ask_size) {
        this.ask_size = ask_size;
    }
}
