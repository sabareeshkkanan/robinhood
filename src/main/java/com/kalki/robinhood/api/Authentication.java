package com.kalki.robinhood.api;

import com.kalki.robinhood.models.AuthResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Authentication {

    @PostMapping("/api-token-auth/")
    public AuthResponse login(String username, String password) {
        return new AuthResponse();
    }

    @PostMapping("/api-token-logout/")

    public void logout(
            @RequestHeader(value = "Authorization") String token) {

    }


}
