package com.kalki.robinhood.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dividends")
public class Dividends {
    @GetMapping("/{id}/")
    public void getDividend(@PathVariable("id") String id) {

    }
}
