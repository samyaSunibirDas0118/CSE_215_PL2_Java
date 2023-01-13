public class TestGeometricObject {
    /** Main method */
    public static void main(String[] args) {
      //create the geometric objects needed
      GeometricObject geoObject1 = new Circle(5);
      GeometricObject geoObject2 = new Rectangle(5, 3);
      GeometricObject geoObject3 = new Triangle(5, 3, 4);
  
      System.out.println("Do the three objects have the same area? " + equalArea(geoObject1, geoObject2, geoObject3));
  
      // Display circle
      showGeometricObject(geoObject1);
  
      // Display rectangle
      showGeometricObject(geoObject2);

      //Display triangle
      showGeometricObject(geoObject3);
    }
  
    /** A method for comparing the areas of three geometric objects */
    public static boolean equalArea(GeometricObject o1, GeometricObject o2, GeometricObject o3) {
      return o1.getArea() == o2.getArea() && o1.getArea() == o3.getArea();      //returns true if equal
    }
  
    //show geometric object by accessing their area, perimeter
    public static void showGeometricObject(GeometricObject object) {
      System.out.println();
      System.out.println("The area is " + object.getArea());
      System.out.println("The perimeter is " + object.getPerimeter());
    }
  }