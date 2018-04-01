package com.somabrouki.authentication.security.model;

public class JwtTokens {

    public String token;
    public String refreshToken;

    public JwtTokens(String token, String refreshToken) {
        this.token = token;
        this.refreshToken = refreshToken;
    }
}
