package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class CashBalances {
    private Double unsettled_funds;

    private ZonedDateTime updated_at;

    private Double cash_available_for_withdrawal;

    private Double buying_power;

    private Double cash;

    private ZonedDateTime created_at;

    private Double cash_held_for_orders;

    private Double uncleared_deposits;

    public Double getUnsettled_funds() {
        return unsettled_funds;
    }

    public void setUnsettled_funds(Double unsettled_funds) {
        this.unsettled_funds = unsettled_funds;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Double getCash_available_for_withdrawal() {
        return cash_available_for_withdrawal;
    }

    public void setCash_available_for_withdrawal(Double cash_available_for_withdrawal) {
        this.cash_available_for_withdrawal = cash_available_for_withdrawal;
    }

    public Double getBuying_power() {
        return buying_power;
    }

    public void setBuying_power(Double buying_power) {
        this.buying_power = buying_power;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public ZonedDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(ZonedDateTime created_at) {
        this.created_at = created_at;
    }

    public Double getCash_held_for_orders() {
        return cash_held_for_orders;
    }

    public void setCash_held_for_orders(Double cash_held_for_orders) {
        this.cash_held_for_orders = cash_held_for_orders;
    }

    public Double getUncleared_deposits() {
        return uncleared_deposits;
    }

    public void setUncleared_deposits(Double uncleared_deposits) {
        this.uncleared_deposits = uncleared_deposits;
    }
}
