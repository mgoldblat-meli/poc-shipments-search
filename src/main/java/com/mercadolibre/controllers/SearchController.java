package com.mercadolibre.controllers;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Path("/search")
public class SearchController {

    @GET
    public String Search() {
        return "This is my shipment";
    }
}
