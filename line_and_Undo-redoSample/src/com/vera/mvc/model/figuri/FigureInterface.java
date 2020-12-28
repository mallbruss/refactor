package com.vera.mvc.model.figuri;

import java.awt.*;
import java.awt.geom.Point2D;

public interface FigureInterface extends Shape {
    void setFrameFromDiagonal(double x1, double y1, double x2, double y2);
    void setFrameFromDiagonal(Point2D first, Point2D second);

    FigureInterface clone();

    double getMinX();
    double getMinY();

    double getMaxX();
    double getMaxY();
}
