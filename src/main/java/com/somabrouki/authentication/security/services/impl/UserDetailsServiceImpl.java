package com.somabrouki.authentication.security.services.impl;

import com.somabrouki.authentication.security.model.UserDto;
import com.somabrouki.authentication.security.services.UserDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));

        return new UserDto(1L, "user", "password", "jwt@ippon.fr",
                authorities, true, LocalDate.now(), "saltquisertarien");
    }
}
