package com.example.shapespaint;

import javafx.scene.shape.Circle;

/**
 * This public class is for creating a new type shape object MyCircle witch can be moved or resized on pane.
 *
 * @author Adam Zeid
 */
public class MyCircle extends Circle
{
    /**
     * This public method is a constructor of class MyCircle witch extends class Circle.
     *
     * @param x double value witch is an x coordinate of circle center.
     * @param y double value witch is a y coordinate of circle center.
     * @param radius double value witch is a radius of circle.
     */
    public MyCircle(double x, double y, double radius)
    {
        super(x, y, radius);
        setOnMousePressed(new MyCircleEventHandler());
        setOnMouseDragged(new MyCircleEventHandler());
        setOnScroll(new MyCircleScrollEventHandler());
    }

    /**
     * This public method is for checking if the object MyCircle was or wasn't hit.
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
     * This public void type method is for adding and setting new x value to the old one as long as it
     * is needed in order to move x coordinate of center of Circle.
     *
     * @param x double value witch is an x coordinate taken from pane.
     */
    public void addX(double x)
    {
        setCenterX(getCenterX() + x);
    }

    /**
     * This public void type method is for adding and setting new y value to the old one as long as it
     * is needed in order to move y coordinate of center of Circle.
     *
     * @param y double value witch is a y coordinate taken from pane.
     */
    public void addY(double y)
    {
        setCenterY(getCenterY() + y);
    }

    /**
     * This public void type method is for adding and setting new radius value to the old one as long as it
     * is needed in order to resize Circle.
     *
     * @param radius double value witch extends when right event was used.
     */
    public void addRadius(double radius)
    {
        setRadius(getRadius() + radius);
    }

    /**
     * This public void type method is for adding and setting new Rotate value to the old one as long as it
     * is needed in order to rotate Circle.
     *
     * @param rotator double value witch is set after right event was used.
     */
    public void toRotate(double rotator)
    {
        setRotate(getRotate() + rotator);
    }
}
