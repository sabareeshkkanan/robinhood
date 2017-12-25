package com.kalki.robinhood.api;

import com.kalki.robinhood.models.AuthResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Authentication {

    @PostMapping(value = "/api-token-auth/", consumes = "application/x-www-form-urlencoded")
    public AuthResponse login(@RequestPart String username,
                              @RequestPart String password,
                              @RequestPart(required = false) String mfa_code) {
        return new AuthResponse();
    }

    @PostMapping("/api-token-logout/")

    public void logout(
            @RequestHeader(value = "Authorization") String token) {

    }


}
