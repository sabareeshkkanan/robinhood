package com.kalki.robinhood.models;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Execution {
    private String id;

    private ZonedDateTime timestamp;

    private Double price;

    private Double quantity;

    private LocalDate settlement_date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getSettlement_date() {
        return settlement_date;
    }

    public void setSettlement_date(LocalDate settlement_date) {
        this.settlement_date = settlement_date;
    }
}
