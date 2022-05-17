package com.example.shapespaint;

import javafx.scene.shape.Polygon;

/**
 * This public class witch extends class Polygon is for creating a new type
 * shape object MyTriangle witch can be moved or resized on pane.
 *
 * @author Adam Zeid
 */
public class MyTriangle extends Polygon
{
    private double startX;

    private double startY;

    /**
     * This public method is a constructor of class MyTriangle witch extends class Polygon.
     *
     * @param x1 double value witch is an x coordinate of first point.
     * @param y1 double value witch is a y coordinate of first point.
     * @param x2 double value witch is an x coordinate of second point.
     * @param y2 double value witch is a y coordinate of second point.
     * @param x3 double value witch is an x coordinate of third point.
     * @param y3 double value witch is a y coordinate of third point.
     */
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        super(x1, y1, x2, y2, x3, y3);
        setOnMousePressed(new MyTriangleEventHandler());
        setOnMouseDragged(new MyTriangleEventHandler());
        setOnScroll(new MyTriangleScrollEventHandler());
    }

    /**
     * This public method is for checking if the object MyTriangle was or wasn't hit.
     *
     * @param x double value witch is an x coordinate taken from pane.
     * @param y double value witch is a y coordinate taken from pane.
     * @return getBoundsInLocal().contains(x, y) witch is boolean type witch
     * returns false if object wasn't hit or true if object was hit.
     */
    public boolean isHit(double x, double y)
    {
        return getBoundsInLocal().contains(x, y);
    }

    /**
     * This public void method is for setting value StartX and StartY witch are coordinates
     * of point from where shape will be moved.
     *
     * @param x double value witch is an x coordinate taken from pane minus the appropriate TranslateX.
     * @param y double value witch is a y coordinate taken from pane minus the appropriate TranslateY.
     */
    public void setStart(double x, double y)
    {
        startX = x;
        startY = y;
    }

    /**
     * This public method is a getter that returns previously set StartX.
     *
     * @return StartX witch is an x coordinate of a point from where moving is started.
     */
    public double getStartX()
    {
        return startX;
    }

    /**
     * This public method is a getter that returns previously set StartX.
     *
     * @return StartY witch is a y coordinate of a point from where moving is started.
     */
    public double getStartY()
    {
        return startY;
    }

    /**
     * This public void type method is for adding and setting new ScaleX value to the old one as long as it
     * is needed in order to resize Triangle.
     *
     * @param x double value witch is a x coordinate set after right event was used.
     */
    public void toResizeX(double x)
    {
        setScaleX(getScaleX() + x);
    }

    /**
     * This public void type method is for adding and setting new ScaleY value to the old one as long as it
     * is needed in order to resize Triangle.
     *
     * @param y double value witch is a y coordinate set after right event was used.
     */
    public void toResizeY(double y)
    {
        setScaleY(getScaleY() + y);
    }

    /**
     * This public void type method is for adding and setting new Rotate value to the old one as long as it
     * is needed in order to rotate Triangle.
     *
     * @param rotator double value witch is set after right event was used.
     */
    public void toRotate(double rotator)
    {
        setRotate(getRotate() + rotator);
    }
}
