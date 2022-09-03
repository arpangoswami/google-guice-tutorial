package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequestSubClass extends SquareRequest{

    @Inject
    public SquareRequestSubClass(DrawShape drawShape) {
        super(drawShape);
    }

    @Override
    public void makeRequest(){
        System.out.println("Calling draw method from subclass!!!");
        drawShape.draw();
    }
}
