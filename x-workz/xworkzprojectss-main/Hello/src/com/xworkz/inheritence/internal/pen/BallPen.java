package com.xworkz.inheritence.internal.pen;

public class BallPen extends Pen {
    public BallPen() {
        super();
        System.out.println("Running non-arg constructor BallPen");
    }
    @Override
    public void write() {
        System.out.println("Writing");
    }
    @Override
    public void inkFlow() {
        System.out.println("Ink flow");
    }
    @Override
    public void cap() {
        System.out.println("Has a cap");
    }
    @Override
    public void refill() {
        System.out.println("Can be refilled");
    }
}
