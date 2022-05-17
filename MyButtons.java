package com.example.shapespaint;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * This public class named MyButtons is for creating and stylizing custom JavaFx Buttons.
 *
 * @author Adam Zeid
 */
public class MyButtons
{
    private final Button clear;

    /**
     * This public method is a constructor of class MyButtons.
     */
    public MyButtons()
    {
        clear = new Button("CLEAR");
    }

    /**
     * This public method is a getter that returns custom JavaFX Button named clear. Method sets MinWidth,
     * Cursor, TextFill, Font and Style.
     *
     * @return clear witch is a JavaFX Button with set parameters.
     */
    public Button getClear()
    {
        clear.setMinWidth(300);
        clear.setCursor(Cursor.HAND);
        clear.setTextFill(Color.WHITE);
        clear.setFont(new Font("Verdana",30));
        clear.setStyle("-fx-background-color: #4f006b;");
        return clear;
    }
}
