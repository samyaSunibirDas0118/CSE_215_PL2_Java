import java.io.IOException;
public interface ExceptionInterface {
  void setWidth(double newWidth) throws IllegalArgumentException;
  void setHeight(double newHeight) throws IllegalArgumentException;
}