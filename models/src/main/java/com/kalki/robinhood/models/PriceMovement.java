package com.kalki.robinhood.models;

public class PriceMovement {

    private Double market_hours_last_movement_pct;
    private Double market_hours_last_price;

    public Double getMarket_hours_last_movement_pct() {
        return market_hours_last_movement_pct;
    }

    public void setMarket_hours_last_movement_pct(Double market_hours_last_movement_pct) {
        this.market_hours_last_movement_pct = market_hours_last_movement_pct;
    }

    public Double getMarket_hours_last_price() {
        return market_hours_last_price;
    }

    public void setMarket_hours_last_price(Double market_hours_last_price) {
        this.market_hours_last_price = market_hours_last_price;
    }
}
