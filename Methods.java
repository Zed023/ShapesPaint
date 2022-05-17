package com.example.shapespaint;
/**
 * This public interface named Methods is for storing useful methods.
 *
 * @author Adam Zeid
 */
public interface Methods
{
    /**
     * This method is for returning one of the object initially shape. Method creates an object
     * based on two x coordinates and two y coordinates.
     *
     * @param x1 first x coordinate taken from pane.
     * @param x2 second x coordinate taken from pane.
     * @param y1 first y coordinate taken from pane.
     * @param y2 second y coordinate taken from pane.
     * @return object created by from given coordinates and formula
     *         written by developer by overriding this method.
     */
    Object drawShape(double x1, double x2, double y1, double y2);
}
