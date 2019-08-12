package com.mercadolibre;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;


public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Main.class).in(Singleton.class);
    }

}