import java.io.IOException;
public class Circle extends GeometricObject implements ExceptionInterface {
  private double radius;
  public Circle() {
  }
  public Circle(double radius) {
    try {
    setRadius(radius);
        }
        catch (IllegalArgumentException e) {
                System.out.println(e);
        }
  }
  /** Return radius */
  public double getRadius() {
    return radius;
  }
public void setRadius(double newRadius)
      throws IllegalArgumentException {
    if (newRadius >= 0)
      radius =  newRadius;
    else
      throw new IllegalArgumentException(
        "Radius cannot be negative");
  }
  /** Return area */
   public double getArea() {
    return radius * radius * Math.PI;
  }
  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }
  /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }
}