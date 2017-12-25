package com.kalki.robinhood.api;

import com.kalki.robinhood.models.Multiple;
import com.kalki.robinhood.models.WatchListCreateResponse;
import com.kalki.robinhood.models.WatchListsData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/watchlists")
public class Watchlists {

    @GetMapping("/")
    public Multiple<WatchListCreateResponse> getAll() {
        return new Multiple<>();
    }

    @GetMapping("/{name}/")
    public Multiple<WatchListsData> get(
            @PathVariable("name") String name) {
        return new Multiple<>();
    }

    @DeleteMapping("/{name}/{instrumentId}")
    public Multiple<WatchListsData> delete(@PathVariable("name") String name,
                                           @PathVariable("instrumentId") String instrumentId) {
        return new Multiple<>();
    }


    @PostMapping("/")
    public WatchListCreateResponse create(String name) {
        return new WatchListCreateResponse();
    }

    @PostMapping("/Default/bulk_add/")
    public List<WatchListsData> add(String symbols) {
        return new ArrayList<>();
    }
}
