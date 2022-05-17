package com.example.shapespaint;

import javafx.scene.Cursor;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;

/**
 * This public class named MyToggleButtons is for creating and stylizing custom JavaFx ToggleButtons.
 *
 * @author Adam Zeid
 */
public class MyToggleButtons
{
    private final ToggleButton circle, rectangle, triangle;
    private final ToggleGroup tools;

    /**
     * This public method is a constructor of class MyToggleButton.
     */
    public MyToggleButtons()
    {
        circle = new ToggleButton("CIRCLE");
        rectangle = new ToggleButton("RECTANGLE");
        triangle = new ToggleButton("TRIANGLE");
        tools = new ToggleGroup();
    }

    /**
     * This public method is a getter that returns custom JavaFX circle ToggleButton.
     *
     * @return circle witch is a ToggleButton with set parameters.
     */
    public ToggleButton getCircle()
    {
        circle.setFont(new Font("Verdana",30));
        circle.setMinWidth(300);
        circle.setMinHeight(70);
        circle.setToggleGroup(tools);
        circle.setCursor(Cursor.HAND);
        return circle;
    }

    /**
     * This public method is a getter that returns custom JavaFX rectangle ToggleButton.
     *
     * @return rectangle witch is a ToggleButton with set parameters.
     */
    public ToggleButton getRectangle()
    {
        rectangle.setFont(new Font("Verdana",30));
        rectangle.setMinWidth(300);
        rectangle.setMinHeight(70);
        rectangle.setToggleGroup(tools);
        rectangle.setCursor(Cursor.HAND);
        return rectangle;
    }

    /**
     * This public method is a getter that returns custom JavaFX triangle ToggleButton.
     *
     * @return triangle witch is a ToggleButton with set parameters.
     */
    public ToggleButton getTriangle()
    {
        triangle.setFont(new Font("Verdana",30));
        triangle.setMinWidth(300);
        triangle.setMinHeight(70);
        triangle.setToggleGroup(tools);
        triangle.setCursor(Cursor.HAND);
        return triangle;
    }
}
