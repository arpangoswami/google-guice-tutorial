package com.drawingapp.services;

import com.google.inject.Inject;
import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.SizeValue;


public class DrawSquare implements DrawShape{

    private final String color;
    private final Integer size;

    @Inject
    public DrawSquare(@ColorValue String color,@SizeValue Integer size) {
        super();
        this.color = color;
        this.size = size;
    }


    @Override
    public void draw() {
        System.out.printf("Drawing a square of %d size and %s color\n",size,color);
    }
}
