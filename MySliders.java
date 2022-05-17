package com.example.shapespaint;

import javafx.scene.control.Slider;

/**
 * This public class named MySliders is for creating and stylizing custom JavaFx Sliders.
 *
 * @author Adam Zeid
 */
public class MySliders
{
    private final Slider lineSlider;

    /**
     * This public method is a constructor of class MySliders.
     */
    public MySliders()
    {
        lineSlider = new Slider(1, 50, 3);
    }

    /**
     * This public method is a getter that returns custom JavaFX Slider named slider.
     *
     * @return slider witch is a JavaFX Slider with set parameters
     */
    public Slider getSlider()
    {
        lineSlider.setShowTickMarks(true);
        lineSlider.setShowTickLabels(true);
        return lineSlider;
    }
}
