package com.kodilla.testing.shape;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.*;


public class ShapeCollector {


    ArrayList<Shape> shapes = new ArrayList<>();


        ArrayList<Shape> addFigure (Shape shape){
            shapes.add(shape);
            return shapes;
        }

        public boolean removeFigure (Shape shape){
        boolean result = false;
            if (shapes.contains(shape)) {
                shapes.remove(shape);
            }
            return true;
        }

        public Shape getFigure (int n){
            Shape shape = null;
            if (n >= 0 && n < shapes.size()){
                shape = shapes.get(n);
            }
            return shape;
        }

        public String showFigures (Shape shape) {
           String result = shape.getShapeName();
           return result;
        }





}
