package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
    DrawShape drawShape;

    @Inject
    public SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest(){
        drawShape.draw();
    }
}
