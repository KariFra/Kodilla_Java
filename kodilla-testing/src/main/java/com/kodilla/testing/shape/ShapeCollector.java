package com.kodilla.testing.shape;


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
                return true;
            }
            return result;
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
