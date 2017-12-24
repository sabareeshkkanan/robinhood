package com.kalki.robinhood.api;

import com.kalki.robinhood.models.Multiple;
import com.kalki.robinhood.models.QuoteData;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/quotes")
public class Quote {

    @GetMapping("/{symbol}/")
    public QuoteData getQuote(@PathVariable("symbol") String symbol) {
        return new QuoteData();
    }

    @GetMapping("/")
    public Multiple<QuoteData> getQuotes(@RequestParam(defaultValue = "TSLA,AMD") String symbols) {
        return new Multiple<>();
    }

}
