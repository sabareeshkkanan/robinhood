package com.kalki.robinhood.api;

import com.kalki.robinhood.models.WatchListCreateResponse;
import com.kalki.robinhood.models.WatchListsData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/watchlists")
public class Watchlists {
    @PostMapping()
    public WatchListCreateResponse create(String name) {
        return new WatchListCreateResponse();
    }

    @PostMapping("/Default/bulk_add/")
    public List<WatchListsData> add(String symbols) {
        return new ArrayList<>();
    }
}
