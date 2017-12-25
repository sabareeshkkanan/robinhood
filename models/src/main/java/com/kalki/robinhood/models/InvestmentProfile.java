package com.kalki.robinhood.models;

import java.time.ZonedDateTime;

public class InvestmentProfile {
    private String liquid_net_worth;

    private String investment_experience;

    private String risk_tolerance;

    private ZonedDateTime updated_at;

    private String source_of_funds;

    private String investment_objective;

    private String liquidity_needs;

    private String annual_income;

    private String tax_bracket;

    private String user;

    private String total_net_worth;

    private String time_horizon;

    private boolean suitability_verified;

    public String getLiquid_net_worth() {
        return liquid_net_worth;
    }

    public void setLiquid_net_worth(String liquid_net_worth) {
        this.liquid_net_worth = liquid_net_worth;
    }

    public String getInvestment_experience() {
        return investment_experience;
    }

    public void setInvestment_experience(String investment_experience) {
        this.investment_experience = investment_experience;
    }

    public String getRisk_tolerance() {
        return risk_tolerance;
    }

    public void setRisk_tolerance(String risk_tolerance) {
        this.risk_tolerance = risk_tolerance;
    }

    public ZonedDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(ZonedDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getSource_of_funds() {
        return source_of_funds;
    }

    public void setSource_of_funds(String source_of_funds) {
        this.source_of_funds = source_of_funds;
    }

    public String getInvestment_objective() {
        return investment_objective;
    }

    public void setInvestment_objective(String investment_objective) {
        this.investment_objective = investment_objective;
    }

    public String getLiquidity_needs() {
        return liquidity_needs;
    }

    public void setLiquidity_needs(String liquidity_needs) {
        this.liquidity_needs = liquidity_needs;
    }

    public String getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(String annual_income) {
        this.annual_income = annual_income;
    }

    public String getTax_bracket() {
        return tax_bracket;
    }

    public void setTax_bracket(String tax_bracket) {
        this.tax_bracket = tax_bracket;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTotal_net_worth() {
        return total_net_worth;
    }

    public void setTotal_net_worth(String total_net_worth) {
        this.total_net_worth = total_net_worth;
    }

    public String getTime_horizon() {
        return time_horizon;
    }

    public void setTime_horizon(String time_horizon) {
        this.time_horizon = time_horizon;
    }

    public boolean isSuitability_verified() {
        return suitability_verified;
    }

    public void setSuitability_verified(boolean suitability_verified) {
        this.suitability_verified = suitability_verified;
    }
}
