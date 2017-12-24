package com.kalki.robinhood.models;

public class OrderRequest {
    private String account;
    private String instrument;
    private String symbol;
    private String type;
    private String time_in_force;
    private String trigger;
    private Double price;
    private Double stop_price;
    private Integer quantity;
    private String side;
    private String client_id;
    private boolean extended_hours;
    private boolean override_day_trade_checks;
    private boolean override_dtbp_checks;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime_in_force() {
        return time_in_force;
    }

    public void setTime_in_force(String time_in_force) {
        this.time_in_force = time_in_force;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStop_price() {
        return stop_price;
    }

    public void setStop_price(Double stop_price) {
        this.stop_price = stop_price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public boolean isExtended_hours() {
        return extended_hours;
    }

    public void setExtended_hours(boolean extended_hours) {
        this.extended_hours = extended_hours;
    }

    public boolean isOverride_day_trade_checks() {
        return override_day_trade_checks;
    }

    public void setOverride_day_trade_checks(boolean override_day_trade_checks) {
        this.override_day_trade_checks = override_day_trade_checks;
    }

    public boolean isOverride_dtbp_checks() {
        return override_dtbp_checks;
    }

    public void setOverride_dtbp_checks(boolean override_dtbp_checks) {
        this.override_dtbp_checks = override_dtbp_checks;
    }
}
