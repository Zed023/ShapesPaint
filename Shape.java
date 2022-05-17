package com.example.shapespaint;

/**
 * This class named Shape contains an enum that can return an Object reading two set of parameters (x1,y1), (x2,y2).
 *
 * @author Adam Zeid
 */
public class Shape
{
    /**
     * This enum is contains three types CIRCLE, TRIANGLE and RECTANGLE and implements interface in order
     * to do calculations.
     */
    enum shapesEvents implements Methods
    {
        CIRCLE,
        RECTANGLE,
        TRIANGLE;

        /**
         * This public method from interface Methods is doing calculations on Cartesian coordinate system
         * in order to return one of three objects MyPolygon, MyRectangle or MyCircle.
         *
         * @return Circle or Rectangle or Triangle witch are a JavaFX Shapes
         */
        @Override
        public Object drawShape(double x1, double x2, double y1, double y2)
        {
            double distanceBetweanTwoPoints = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            switch (this)
            {
                case CIRCLE ->
                {
                    return new MyCircle(x1, y1, distanceBetweanTwoPoints);
                }
                case RECTANGLE ->
                {
                    double width = Math.abs(x1 - x2);
                    double height = Math.abs(y1 - y2);
                    if (x1 > x2 && y1 > y2)
                    {
                        return new MyRectangle(x2, y2, width, height);
                    }
                    if (x1 > x2)
                    {
                        return new MyRectangle(x2, y1, width, height);
                    }
                    if (y1 > y2)
                    {
                        return new MyRectangle(x1, y2, width, height);
                    }
                    return new MyRectangle(x1, y1, width, height);
                }
                case TRIANGLE ->
                {
                    double buildX1 = x2 - distanceBetweanTwoPoints;
                    double buildX3 = x2 + distanceBetweanTwoPoints;

                    return new MyTriangle(buildX1, y2, buildX3, y2, x1, y1);
                }
            }
            return null;
        }
    }
}
