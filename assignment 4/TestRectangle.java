public class TestRectangle {
    /** Main method */
    public static void main(String[] args) {
      GeometricObject geoObject3 = new Rectangle(-5, -5);
      GeometricObject geoObject1 = new Rectangle(5, -5);
      GeometricObject geoObject2 = new Rectangle(1, 2);
      displayGeometricObject(geoObject3);
      displayGeometricObject(geoObject1);
      displayGeometricObject(geoObject2);
  }
  public static void displayGeometricObject(GeometricObject object) {
      System.out.println();
      System.out.println("The area is " + object.getArea());
      System.out.println("The perimeter is " + object.getPerimeter());
    }
  }