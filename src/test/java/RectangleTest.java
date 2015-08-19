import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testR = new Rectangle(2,2);
    assertEquals(true, testR instanceof Rectangle);
  }

//Running a method to test that the class/object Rectangle called testR will
//return a integer representing width when you call the method Rectangle.getWidth()
//assertEquals-we are saying the first parameter is equal to second parameter. In
//this case the width parameter = 2 . Remember...a method always has ().
  @Test
  public void newRectangle_getsAnIntegerCalledWidth(){
    Rectangle testR = new Rectangle(2,2);
    assertEquals(2, testR.getWidth());
    //
  }

  @Test
  public void newRectangle_getsAnIntegerCalledHeight(){
    Rectangle testR = new Rectangle(3,2);
    assertEquals (2, testR.getHeight());
  }

  @Test  //could also title it isSquare_WidthAndHeightNotEqual_false
  public void isSquare_notASquare_false(){
    Rectangle testR = new Rectangle(6,1);
    assertEquals(false, testR.isSquare());
  }
  @Test
  public void getSurfaceArea_multipliesWidthAndHeight(){
    Rectangle testR = new Rectangle(2,5);
    assertEquals(10, testR.getSurfaceArea());
  }
}
