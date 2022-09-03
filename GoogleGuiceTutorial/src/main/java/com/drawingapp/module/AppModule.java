package com.drawingapp.module;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.SizeValue;
import com.drawingapp.requests.SquareRequest;
import com.drawingapp.requests.SquareRequestSubClass;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(DrawShape.class).to(DrawSquare.class);
        //bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);//DrawSquare is singleton
        bind(SquareRequest.class).to(SquareRequestSubClass.class);
        //bind(SquareRequest.class).in(
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(SizeValue.class).toInstance(10);
    }
}
