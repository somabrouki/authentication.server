package com.somabrouki.authentication.security.services;

import com.somabrouki.authentication.security.model.JwtTokens;
import com.somabrouki.authentication.security.model.UserDto;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.springframework.security.core.Authentication;

public interface JwtTokenService {

    String createToken(UserDto user);

    String createRefreshToken(UserDto user);

    Jws<Claims> validateJwtToken(String token);

    JwtTokens createTokens(Authentication authentication);

    JwtTokens refreshJwtToken(String refreshToken);
}
