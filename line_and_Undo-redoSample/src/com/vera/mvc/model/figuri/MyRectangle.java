package com.vera.mvc.model.figuri;

import java.awt.*;
import java.awt.geom.*;

public class MyRectangle implements FigureInterface {
    Rectangle2D.Double myFigure;
    public MyRectangle(){
        myFigure = new Rectangle2D.Double();
    }
    @Override
    public void setFrameFromDiagonal(double x1, double y1, double x2, double y2) {
        myFigure.setFrameFromDiagonal(x1,y1,x2,y2);
    }

    @Override
    public void setFrameFromDiagonal(Point2D first, Point2D second) {
        myFigure.setFrameFromDiagonal(first,second);
    }

    @Override
    public FigureInterface clone(){
        MyRectangle copy = new MyRectangle();
        copy.myFigure = (Rectangle2D.Double) myFigure.clone();
        return copy;
    }

    @Override
    public double getMinX() {
        return myFigure.getMinX();
    }

    @Override
    public double getMinY() {
        return myFigure.getMinY();
    }

    @Override
    public double getMaxX() {
        return myFigure.getMaxX();
    }

    @Override
    public double getMaxY() {
        return myFigure.getMaxY();
    }

    @Override
    public Rectangle getBounds() {
        return myFigure.getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        return myFigure.getBounds();
    }

    @Override
    public boolean contains(double x, double y) {
        return myFigure.contains(x,y);
    }

    @Override
    public boolean contains(Point2D p) {
        return myFigure.contains(p);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return myFigure.intersects(x,y,w,h);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return myFigure.intersects(r);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return myFigure.contains(x,y,w,h);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return myFigure.contains(r);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return myFigure.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return myFigure.getPathIterator(at,flatness);
    }
}
