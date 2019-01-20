package com.kalki.robinhood.api;

import com.kalki.robinhood.models.TagsAndCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/midlands/tags/tag")
public class Tags {
    @GetMapping("/10-most-popular/")
    public TagsAndCategory tenMostPopular() {
        return new TagsAndCategory();
    }

    @GetMapping("/100-most-popular/")
    public TagsAndCategory hundredMostPopular() {
        return new TagsAndCategory();
    }
}
