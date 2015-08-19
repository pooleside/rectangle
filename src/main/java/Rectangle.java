public class Rectangle {

//these are the properties (buckets) where the class stores data
  private Integer mWidth;
  private Integer mHeight;
  //This is the constructor.  It creates a new Rectangle instance.
  public Rectangle (Integer width, Integer height){
    mWidth = width;  //Filling the properties with parameter value
    mHeight = height;
  }
      //Method section
      //Method that gets the width from the properties.
      public int getWidth(){
        return mWidth; // do not put = because just returning a variable that is
                        //already filled by the constructor.  This is why we
                        //have a constructor.  We have created our getWidth
                        //method.
      }

      //Method that gets the length.
      public int getHeight(){
        return mHeight;
      }
      //Methods that start with "is" are booleans
      public boolean isSquare(){
        return mWidth == mHeight;  //This is an expression.  Do these equal?
                                  //If so, will automatically return true.  If
                                  // not false.
      }
      public int getSurfaceArea(){
        return mWidth * mHeight;
      }
}
