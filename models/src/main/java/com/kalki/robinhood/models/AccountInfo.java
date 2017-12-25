package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class AccountInfo {
    private boolean deposit_halted;

    private String account_number;

    private boolean withdrawal_halted;

    private Double max_ach_early_access_amount;

    private String portfolio;

    private Double sma_held_for_orders;

    private MarginBalances margin_balances;

    private Double cash_held_for_orders;

    private String type;

    private Double uncleared_deposits;

    private CashBalances cash_balances;

    private String url;

    private String positions;

    private Double unsettled_funds;

    private ZonedDateTime updated_at;

    private Double sma;

    private Double cash_available_for_withdrawal;

    private Double buying_power;

    private Double cash;

    private ZonedDateTime created_at;

    private boolean deactivated;

    private boolean sweep_enabled;

    private boolean only_position_closing_trades;

    private String user;

    public boolean isDeposit_halted() {
        return deposit_halted;
    }

    public void setDeposit_halted(boolean deposit_halted) {
        this.deposit_halted = deposit_halted;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public boolean isWithdrawal_halted() {
        return withdrawal_halted;
    }

    public void setWithdrawal_halted(boolean withdrawal_halted) {
        this.withdrawal_halted = withdrawal_halted;
    }

    public Double getMax_ach_early_access_amount() {
        return max_ach_early_access_amount;
    }

    public void setMax_ach_early_access_amount(Double max_ach_early_access_amount) {
        this.max_ach_early_access_amount = max_ach_early_access_amount;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public Double getSma_held_for_orders() {
        return sma_held_for_orders;
    }

    public void setSma_held_for_orders(Double sma_held_for_orders) {
        this.sma_held_for_orders = sma_held_for_orders;
    }

    public MarginBalances getMargin_balances() {
        return margin_balances;
    }

    public void setMargin_balances(MarginBalances margin_balances) {
        this.margin_balances = margin_balances;
    }

    public Double getCash_held_for_orders() {
        return cash_held_for_orders;
    }

    public void setCash_held_for_orders(Double cash_held_for_orders) {
        this.cash_held_for_orders = cash_held_for_orders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getUncleared_deposits() {
        return uncleared_deposits;
    }

    public void setUncleared_deposits(Double uncleared_deposits) {
        this.uncleared_deposits = uncleared_deposits;
    }

    public CashBalances getCash_balances() {
        return cash_balances;
    }

    public void setCash_balances(CashBalances cash_balances) {
        this.cash_balances = cash_balances;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

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

    public Double getSma() {
        return sma;
    }

    public void setSma(Double sma) {
        this.sma = sma;
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

    public boolean isDeactivated() {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated) {
        this.deactivated = deactivated;
    }

    public boolean isSweep_enabled() {
        return sweep_enabled;
    }

    public void setSweep_enabled(boolean sweep_enabled) {
        this.sweep_enabled = sweep_enabled;
    }

    public boolean isOnly_position_closing_trades() {
        return only_position_closing_trades;
    }

    public void setOnly_position_closing_trades(boolean only_position_closing_trades) {
        this.only_position_closing_trades = only_position_closing_trades;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
