package by.AlexAzyavchikov.paint.Components.Draw.DrawingStrategy;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends AbstractStrategy {
    @Override
    public void draw(GraphicsContext graphicContext, Point2D top, int w, int h) {
        graphicContext.fillRect(top.getX(), top.getY(), w, h);
        graphicContext.strokeRect(top.getX(), top.getY(), w, h);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
