package com.mercadolibre.bootstrap;

import com.mercadolibre.controllers.SearchController;
import com.mercadolibre.bootstrap.service.SearchService;
import io.jooby.Jooby;
import io.jooby.di.SpringModule;
//import io.jooby.di.GuiceModule;


public class App extends Jooby {

    {
        //install(new GuiceModule());
        install(new SpringModule());

        get("/search-service", ctx -> {
            SearchService service = require(SearchService.class);
            return service.Search();
        });

        mvc(SearchController.class);
    }

    public static void main(String[] args) {
        // TODO Investigate https://jooby.io/#execution-model

        //var context = (ApplicationContext)new ClassPathXmlApplicationContext("applicationContext.xml");


        runApp(args, App::new);
    }
}
