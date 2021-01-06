package com.example;

import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class SampleController {
    @Get("/name1")
    @Cacheable(cacheNames = "sample1")
    public String getName1() {
        return "cached name 1";
    }

    @Get("/name2")
    @Cacheable(cacheNames = "sample2")
    public String getName2() {
        return "cached name 2";
    }
}
