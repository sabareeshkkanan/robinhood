package com.kalki.robinhood.api;

import com.kalki.robinhood.models.MarketData;
import com.kalki.robinhood.models.MarketHours;
import com.kalki.robinhood.models.Multiple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/markets")

public class Markets {
    @GetMapping
    public Multiple<MarketData> getAll() {
        return new Multiple<>();
    }

    @GetMapping("/{mic}/hours/{date}/")
    public MarketHours getMArketHours(@PathVariable("mic") String mic,
                                      @PathVariable("date") String date) {

        return new MarketHours();
    }

}
