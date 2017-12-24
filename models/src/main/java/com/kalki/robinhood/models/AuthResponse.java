package com.kalki.robinhood.models;

public class AuthResponse {
    private String token;
    private String mfa_type;
    private String mfa_required;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMfa_type() {
        return mfa_type;
    }

    public void setMfa_type(String mfa_type) {
        this.mfa_type = mfa_type;
    }

    public String getMfa_required() {
        return mfa_required;
    }

    public void setMfa_required(String mfa_required) {
        this.mfa_required = mfa_required;
    }
}
