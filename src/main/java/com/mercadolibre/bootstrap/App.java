package com.mercadolibre.bootstrap;

import com.mercadolibre.controllers.SearchController;
import io.jooby.Jooby;
import io.jooby.di.GuiceModule;


public class App extends Jooby {

    {
        install(new GuiceModule());

        mvc(SearchController.class);
    }

    public static void main(String[] args) {
        runApp(args, App::new);
    }
}
