package com.somabrouki.authentication.security.services;

import com.somabrouki.authentication.security.model.UserDto;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
    UserDto loadUserByUsername(String username) throws UsernameNotFoundException;
}
