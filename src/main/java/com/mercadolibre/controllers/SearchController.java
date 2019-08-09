package com.mercadolibre.controllers;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/search")
public class SearchController {

    @GET
    public String Search() {
        return "This is my shipment";
    }
}
