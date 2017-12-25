package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class Position {
    private Double intraday_average_buy_price;

    private ZonedDateTime updated_at;

    private Double shares_held_for_stock_grants;

    private Double shares_held_for_sells;

    private ZonedDateTime created_at;

    private Double intraday_quantity;

    private String account;

    private Double quantity;

    private String instrument;

    private Double average_buy_price;

    private String url;

    private Double shares_held_for_buys;

    public Double getIntraday_average_buy_price() {
        return intraday_average_buy_price;
    }

    public void setIntraday_average_buy_price(Double intraday_average_buy_price) {
        this.intraday_average_buy_price = intraday_average_buy_price;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Double getShares_held_for_stock_grants() {
        return shares_held_for_stock_grants;
    }

    public void setShares_held_for_stock_grants(Double shares_held_for_stock_grants) {
        this.shares_held_for_stock_grants = shares_held_for_stock_grants;
    }

    public Double getShares_held_for_sells() {
        return shares_held_for_sells;
    }

    public void setShares_held_for_sells(Double shares_held_for_sells) {
        this.shares_held_for_sells = shares_held_for_sells;
    }

    public ZonedDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(ZonedDateTime created_at) {
        this.created_at = created_at;
    }

    public Double getIntraday_quantity() {
        return intraday_quantity;
    }

    public void setIntraday_quantity(Double intraday_quantity) {
        this.intraday_quantity = intraday_quantity;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Double getAverage_buy_price() {
        return average_buy_price;
    }

    public void setAverage_buy_price(Double average_buy_price) {
        this.average_buy_price = average_buy_price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getShares_held_for_buys() {
        return shares_held_for_buys;
    }

    public void setShares_held_for_buys(Double shares_held_for_buys) {
        this.shares_held_for_buys = shares_held_for_buys;
    }
}
