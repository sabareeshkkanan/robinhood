package com.kalki.robinhood.api;

import com.kalki.robinhood.models.Multiple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/midlands/movers")
public class Movers {
    @GetMapping("/sp500/")
    public Multiple<Movers> getMovers(String direction) {
        return new Multiple<>();
    }
}
