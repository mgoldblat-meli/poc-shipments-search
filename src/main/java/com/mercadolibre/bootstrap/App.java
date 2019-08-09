package com.mercadolibre.bootstrap;

import com.mercadolibre.controllers.SearchController;
import com.mercadolibre.bootstrap.services.SearchServiceImp;
import io.jooby.Jooby;
import io.jooby.di.SpringModule;


public class App extends Jooby {

    {
        install(new SpringModule());

        get("/search-service", ctx -> {
            SearchServiceImp service = require(SearchServiceImp.class);
            return service.Search();
        });

        mvc(SearchController.class);
    }

    public static void main(String[] args) {
        // TODO Investigate https://jooby.io/#execution-model

        runApp(args, App::new);
    }
}
