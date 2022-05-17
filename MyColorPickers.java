package com.example.shapespaint;

import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

/**
 * This public class named MyColorPicker is for creating and stylizing custom JavaFx ColorPicker.
 *
 * @author Adam Zeid
 */
public class MyColorPickers
{
    private final ColorPicker cpLine, cpFill;

    /**
     * This public method is a constructor of class MyColorPicker.
     */
    public MyColorPickers()
    {
        cpLine = new ColorPicker(Color.BLACK);
        cpFill = new ColorPicker(Color.TRANSPARENT);
    }

    /**
     * This public method is a getter that returns custom JavaFX ColorPicker named cpLine.
     *
     * @return cpLine witch is a ColorPicker with set parameters.
     */
    public ColorPicker getCpLine()
    {
        cpLine.setMinWidth(300);
        cpLine.setMinHeight(50);
        return cpLine;
    }

    /**
     * This public method is a getter that returns custom JavaFX ColorPicker named cpFill.
     *
     * @return cpFill witch is a ColorPicker with set parameters.
     */
    public ColorPicker getCpFill()
    {
        cpFill.setMinWidth(300);
        cpFill.setMinHeight(50);
        return cpFill;
    }
}
