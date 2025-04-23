package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.pen.Pen;
import com.xworkz.inheritence.internal.pen.BallPen;

public class PenRunner {
    public static void main(String[] args) {



        Pen pen = new Pen();
        pen.write();
        pen.inkFlow();
        pen.cap();
        pen.refill();
        System.out.println("**************************************");
        Pen pens = new BallPen();
        pens.write();
        pens.inkFlow();
        pens.cap();
        pens.refill();


        System.out.println("**************************************");
        BallPen ballPen = new BallPen();
        ballPen.write();
        ballPen.inkFlow();
        ballPen.cap();
        ballPen.refill();
    }
}
