package com.example.shapespaint;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


/**
 * This public class is for creating a new EventHandler for object
 * MyRectangle that gives it an ability to be moved around the screen using mouse.
 *
 * @author Adam Zeid
 */
public class MyRectangleEventHandler implements EventHandler <MouseEvent>
{
    private MyRectangle rectangle;

    /**
     * This overridden void type public method is for setting new type of event handling.
     * It gives MyRectangle an ability to move, change color and be rotated using mouse.
     *
     * @param event witch is set after right MouseEvent was used.
     */
    @Override
    public void handle(MouseEvent event)
    {

        rectangle = (MyRectangle) event.getSource();

        //set points/set as active
        if(event.getEventType() == MouseEvent.MOUSE_PRESSED && event.getButton() == MouseButton.PRIMARY)
        {
            rectangle.setStart(event.getSceneX() - rectangle.getTranslateX(), event.getSceneY() - rectangle.getTranslateY());
        }

        //move
        if(event.getEventType() == MouseEvent.MOUSE_DRAGGED && event.getButton() == MouseButton.PRIMARY)
        {
            rectangle.setTranslateX(event.getSceneX() - rectangle.getStartX());
            rectangle.setTranslateY(event.getSceneY() - rectangle.getStartY());
        }

        //change color
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

            rectangle.setFill(colorPickers.getCpFill().getValue());
        }

        //rotate
        if(event.getEventType() == MouseEvent.MOUSE_PRESSED && event.getButton() == MouseButton.MIDDLE)
        {
            Scene scene = rectangle.getScene();
            scene.setOnKeyPressed
                    (e ->
                    {
                        switch (e.getCode())
                        {
                            case D -> rectangle.toRotate(1);

                            case A -> rectangle.toRotate(-1);
                        }
                    });
        }
    }
}
