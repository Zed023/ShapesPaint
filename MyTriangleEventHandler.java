package com.example.shapespaint;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * This public class is for creating a new EventHandler for object
 * MyTriangle that gives it an ability to be moved around the screen using mouse.
 *
 * @author Adam Zeid
 */
public class MyTriangleEventHandler implements EventHandler <MouseEvent>
{
    private MyTriangle triangle;


    /**
     * This overridden void type public method is for setting new type of event handling.
     * It gives MyTriangle an ability to move, change color and be rotated using mouse.
     *
     * @param event witch is set after right MouseEvent was used.
     */
    @Override
    public void handle(MouseEvent event)
    {
        triangle = (MyTriangle) event.getSource();
        if(event.getEventType() == MouseEvent.MOUSE_PRESSED && event.getButton() == MouseButton.PRIMARY)
        {
            triangle.setStart(event.getSceneX() - triangle.getTranslateX(), event.getSceneY() - triangle.getTranslateY());
        }
        if(event.getEventType() == MouseEvent.MOUSE_DRAGGED && event.getButton() == MouseButton.PRIMARY)
        {
            triangle.setTranslateX(event.getSceneX() - triangle.getStartX());
            triangle.setTranslateY(event.getSceneY() - triangle.getStartY());
        }
        if(event.getEventType() == MouseEvent.MOUSE_PRESSED && event.getButton() == MouseButton.SECONDARY)
        {
            Stage colorPickerStage = new Stage();
            MyColorPickers colorPickers = new MyColorPickers();
            Scene window = new Scene(colorPickers.getCpFill());
            colorPickerStage.setScene(window);
            colorPickerStage.setTitle("Color Picker");
            colorPickerStage.setHeight(140);
            colorPickerStage.setWidth(240);
            colorPickerStage.setResizable(false);
            colorPickerStage.showAndWait();

            triangle.setFill(colorPickers.getCpFill().getValue());
        }
        if(event.getEventType() == MouseEvent.MOUSE_PRESSED && event.getButton() == MouseButton.MIDDLE)
        {
            Scene scene = triangle.getScene();
            scene.setOnKeyPressed
                    (e ->
                    {
                        switch (e.getCode())
                        {
                            case D -> triangle.toRotate(1);

                            case A -> triangle.toRotate(-1);
                        }
                    });
        }
    }
}
