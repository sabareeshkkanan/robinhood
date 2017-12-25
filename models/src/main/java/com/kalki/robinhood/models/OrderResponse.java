package com.kalki.robinhood.models;

import java.time.ZonedDateTime;
import java.util.List;

public class OrderResponse extends OrderRequest {
    private String position;

    private boolean override_day_trade_checks;

    private String state;


    private String cancel;

    private ZonedDateTime last_transaction_at;


    private String id;


    private ZonedDateTime created_at;


    private List<Execution> executions;


    private Double cumulative_quantity;

    private Double fees;




    private String reject_reason;

    private String url;

    private Double average_price;

    private ZonedDateTime updated_at;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean isOverride_day_trade_checks() {
        return override_day_trade_checks;
    }

    @Override
    public void setOverride_day_trade_checks(boolean override_day_trade_checks) {
        this.override_day_trade_checks = override_day_trade_checks;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public ZonedDateTime getLast_transaction_at() {
        return last_transaction_at;
    }

    public void setLast_transaction_at(ZonedDateTime last_transaction_at) {
        this.last_transaction_at = last_transaction_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(ZonedDateTime created_at) {
        this.created_at = created_at;
    }



    public Double getCumulative_quantity() {
        return cumulative_quantity;
    }

    public void setCumulative_quantity(Double cumulative_quantity) {
        this.cumulative_quantity = cumulative_quantity;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }



    public String getReject_reason() {
        return reject_reason;
    }

    public void setReject_reason(String reject_reason) {
        this.reject_reason = reject_reason;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getAverage_price() {
        return average_price;
    }

    public void setAverage_price(Double average_price) {
        this.average_price = average_price;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }


    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }
}
