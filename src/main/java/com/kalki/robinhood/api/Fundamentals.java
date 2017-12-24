package com.kalki.robinhood.api;

import com.kalki.robinhood.models.FundamentalsData;
import com.kalki.robinhood.models.Multiple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fundamentals")
public class Fundamentals {
    @GetMapping("/{symbol}/")
    public FundamentalsData getFundamentals(@PathVariable("symbol") String symbol) {
        return new FundamentalsData();
    }


    @GetMapping("/")
    public Multiple<FundamentalsData> query(String symbols) {
        return new Multiple<>();
    }

}
