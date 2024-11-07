package com.pluralsight;

import javax.xml.stream.Location;
import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shape {
    protected Turtle turtle; // Use to Draw the shape
    protected Point2D.Double Location; // Location where the shape is to be drawn
    protected Color color;
    protected Integer Border;

    // Constructor


    public Shape(Turtle turtle, Point2D.Double location, Color color, Integer border) {
        this.turtle = turtle;
        Location = location;
        this.color = color;
        Border = border;
    }

    public abstract void paint();

}
