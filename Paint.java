/*
 * ===================================================
 *                      contents
 * ===================================================
 * 01- draw Rectangle OK
 * 02- draw Circle NEARLY OK
 * 03- draw Triangle OK
 * ----------------------------------------------------
 *                     Features
 * ----------------------------------------------------
 * - the ability to change Line color OK
 * - the ability to change Fill color OK
 * - the ability to change Line width OK
 * - the ability to set shape as active drag it and resize it OK
 * - the ability to set shape as active and rotate it OK
 * - the ability to set shape as active and change its color OK
 * - Clear OK
 * ===================================================
 */

package com.example.shapespaint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * This class named ShapesPaint is for creating a GUI that draws shapes.
 *
 * @author Adam Zeid
 */
public class Paint extends Application
{
    /**
     * This method named start is where the GUI is written and made functional.
     *
     * @param primaryStage the primary stage for this application, onto which the application
     *                     scene can be set. Applications may create other stages,
     *                     if needed, but they will not be primary stages.
     */
    @Override
    public void start(Stage primaryStage)
    {
        /* ----------Stage and scene---------- */
        BorderPane pane = new BorderPane();
        MyDrawings drawingPane = new MyDrawings();
        pane.setCenter(drawingPane.getDrawingPane());
        pane.setLeft(drawingPane.getToolBar());

        Scene scene = new Scene(pane, 1600, 900);

        primaryStage.setTitle("Shapes Paint");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method of class Paint. That runs whole program.
     *
     * @param args String array. Is compulsory in main method in java in order
     *             to receive the parameters for the input.
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}