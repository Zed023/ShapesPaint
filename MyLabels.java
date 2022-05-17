package com.example.shapespaint;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * This public class named MyLabels is for creating and stylizing custom JavaFX Labels.
 *
 * @author Adam Zeid
 */
public class MyLabels
{
    private final Label lineColor, fillColor, lineWidth;

    /**
     * This public method is a constructor of class MyLabels.
     */
    public MyLabels()
    {
        lineColor = new Label("LINE COLOR");
        fillColor = new Label("FILL COLOR");
        lineWidth = new Label("LINE WIDTH");
    }

    /**
     * This public method is a getter that returns custom JavaFX Label named LineColor.
     *
     * @return lineColor witch is a JavaFX Label with set parameters.
     */
    public Label getLineColor()
    {
        lineColor.setFont(new Font("Verdana",30));
        lineColor.setTextFill(Color.web("#ffffff"));
        return lineColor;
    }

    /**
     * This public method is a getter that returns custom JavaFX fillColor Label.
     *
     * @return fillColor witch is a JavaFX Label with set parameters.
     */
    public Label getFillColor()
    {
        fillColor.setFont(new Font("Verdana",30));
        fillColor.setTextFill(Color.web("#ffffff"));
        return fillColor;
    }

    /**
     * This public method is a getter that returns custom JavaFX lineWidth Label.
     *
     * @return lineWidth witch is a JavaFX Label with set parameters.
     */
    public Label getLineWidth()
    {
        lineWidth.setFont(new Font("Verdana",30));
        lineWidth.setTextFill(Color.web("#ffffff"));
        return lineWidth;
    }
}
