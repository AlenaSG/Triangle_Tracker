class Triangle {
  public int mSide1;
  public int mSide2;
  public int mSide3;

public Triangle(int side1, int side2, int side3) {
  mSide1 = side1;
  mSide2 = side2;
  mSide3 = side3;
}


  public String determineTriangle(int side1, int side2, int side3) {
    if(side1 == 0 || side2 == 0 || side3 == 0) {
      return "Enter valid lengths";
    } else if(((side1 + side2) < side3) || ((side2 + side3) < side1) || ((side3 + side1) < side2)) {
      return " It is not a triangle";
    } else if ((side1 == side2) && (side2 == side3)) {
      return "The triangle is Equilateral";
    } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
      return "The triangle is Isosceles.";
    } else if ((side1 != side2) && (side2 != side3) && (side3 != side1)) {
      return "The triangle is Scalene.";
    }
    return ("possible error.");
    }
  }
