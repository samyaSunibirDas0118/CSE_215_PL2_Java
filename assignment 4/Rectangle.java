import java.io.IOException;
public class Rectangle extends GeometricObject implements ExceptionInterface {
    private double width;
    private double height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        try{
          setWidth(width);
          setHeight(height);
        }
        catch (IllegalArgumentException e) {
          System.out.println(e);
  }
    }
    /** Return width */
    public double getWidth() {
      return width;
    }
    /** Set a new width */
    public void setWidth(double newWidth)
    throws IllegalArgumentException {
      if (newWidth >= 0)
        width =  newWidth;
      else 
      throw new IllegalArgumentException( "Width cannot be negative");
    }
    /** Return height */
    public double getHeight() {
      return height;
    }
    /** Set a new height */
    public void setHeight(double newHeight)
    throws IllegalArgumentException {
      if (newHeight >= 0)
        height =  newHeight;
      else 
      throw new IllegalArgumentException( "Height cannot be negative");
    }
    /** Return area */
    public double getArea() {
      return width * height;
    }
    /** Return perimeter */
    public double getPerimeter() {
      return 2 * (width + height);
    }

  }
