package com.somabrouki.authentication.security.services;

import com.somabrouki.authentication.security.model.AuthenticationRequest;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.springframework.security.core.Authentication;

public interface AuthenticationService {

    Authentication getAuthentication(Jws<Claims> request);

    Authentication authenticate(AuthenticationRequest authenticationRequest);
}
