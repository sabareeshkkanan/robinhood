package com.kalki.robinhood.api;

import com.kalki.robinhood.models.InstrumentData;
import com.kalki.robinhood.models.InstrumentSplit;
import com.kalki.robinhood.models.Multiple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instruments")
public class Instruments {

    @GetMapping
    public Multiple<InstrumentData> getAll() {
        return new Multiple<>();
    }


    @GetMapping("/{instrument_id}/")
    public InstrumentData get(@PathVariable("instrument_id") String instrument_id) {
        return new InstrumentData();
    }

    @GetMapping("/")
    public Multiple<InstrumentData> query(String query) {
        return new Multiple<>();
    }

    @GetMapping("/{instrument_id}/splits/")
    public Multiple<InstrumentSplit> getSplits(@PathVariable("instrument_id") String instrument_id) {
        return new Multiple<>();
    }
}
