package com.example.shapespaint;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;



/**
 * This public class named MyDrawings is for creating toolBar and drawingPane.
 * It is also a class where shapes are being put on the Pane.
 *
 * @author Adam Zeid
 */
public class MyDrawings extends Node
{
    private final BorderPane drawingPane;
    private final VBox toolBar;
    private final MyToggleButtons toggleButtons;
    private final MyColorPickers colorPickers;
    private final MySliders sliders;
    private final MyLabels labels;
    private final MyButtons buttons;
    private double x1,x2,y1,y2;

    /**
     * This public method is a constructor of class MyDrawings.
     */
    public MyDrawings()
    {
        drawingPane = new BorderPane();
        toolBar = new VBox(10);
        toggleButtons = new MyToggleButtons();
        colorPickers = new MyColorPickers();
        sliders = new MySliders();
        buttons = new MyButtons();
        labels = new MyLabels();
    }

    /**
     * This public method is a getter that returns custom JavaFX Vbox named toolBar.
     *
     * @return toolBar witch is a JavaFX VBox with set parameters
     */
    public VBox getToolBar()
    {
        toolBar.getChildren().addAll(toggleButtons.getCircle(), toggleButtons.getRectangle(), toggleButtons.getTriangle(),
                labels.getLineColor(), colorPickers.getCpLine(), labels.getFillColor(), colorPickers.getCpFill(),
                labels.getLineWidth(), sliders.getSlider(), buttons.getClear());
        toolBar.setPadding(new Insets(5));
        toolBar.setStyle("-fx-background-color: #2a2626");
        toolBar.setPrefWidth(300);

        return toolBar;
    }

    /**
     * This public method returns the Node that represents this Styleable object.
     *
     * @return the Node that represents this Styleable object
     */
    @Override
    public Node getStyleableNode()
    {
        return super.getStyleableNode();
    }

    /**
     * This public method is a getter that returns custom JavaFX BorderPane named drawingPane.
     * It is also able to draw shapes on pane by reading users mouse events.
     *
     * @return drawingPane witch is a JavaFX BorderPane with set parameters
     */
    public BorderPane getDrawingPane()
    {
        //When mouse is pressed
        drawingPane.setOnMousePressed
                (e ->
                {
                    if(toggleButtons.getRectangle().isSelected())
                    {
                        x1 = e.getX();
                        y1 = e.getY();
                    }
                    else if(toggleButtons.getCircle().isSelected())
                    {
                        x1 = e.getX();
                        y1 = e.getY();
                    }
                    else if(toggleButtons.getTriangle().isSelected())
                    {
                        x1 = e.getX();
                        y1 = e.getY();
                    }
                });

        //When mouse is released
        drawingPane.setOnMouseReleased
                (e ->
                {
                    //draw rectangle
                    if(toggleButtons.getRectangle().isSelected())
                    {
                        x2 = e.getX();
                        y2 = e.getY();

                        MyRectangle rectangle = (MyRectangle) Shape.shapesEvents.RECTANGLE.drawShape(x1,x2,y1,y2);
                        assert rectangle != null;
                        rectangle.setStroke(colorPickers.getCpLine().getValue());
                        rectangle.setFill(colorPickers.getCpFill().getValue());
                        rectangle.setStrokeWidth(sliders.getSlider().getValue());
                        drawingPane.getChildren().add(rectangle);
                    }

                    //draw circle
                    else if(toggleButtons.getCircle().isSelected())
                    {
                        x2 = e.getX();
                        y2 = e.getY();

                        MyCircle circle = (MyCircle) Shape.shapesEvents.CIRCLE.drawShape(x1,x2,y1,y2);
                        assert circle != null;
                        circle.setStroke(colorPickers.getCpLine().getValue());
                        circle.setFill(colorPickers.getCpFill().getValue());
                        circle.setStrokeWidth(sliders.getSlider().getValue());
                        drawingPane.getChildren().add(circle);
                    }

                    //draw triangle
                    else if(toggleButtons.getTriangle().isSelected())
                    {
                        x2 = e.getX();
                        y2 = e.getY();

                        MyTriangle triangle = (MyTriangle) Shape.shapesEvents.TRIANGLE.drawShape(x1,x2,y1,y2);
                        assert triangle != null;
                        triangle.setStroke(colorPickers.getCpLine().getValue());
                        triangle.setFill(colorPickers.getCpFill().getValue());
                        triangle.setStrokeWidth(sliders.getSlider().getValue());
                        drawingPane.getChildren().add(triangle);
                    }
                });
        //clear button
        buttons.getClear().setOnAction(e -> drawingPane.getChildren().clear());
        return drawingPane;
    }
}
