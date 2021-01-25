class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int Total;
    double blue;
    double brown;
    double green;
    double orange;
    double red; 
    double yellow;
    Total = 55 * 9;
    blue = Total *.24;
    brown = Total *.13;
    green = Total *.16;
    orange = Total *.2;
    red = Total *.13;
    yellow = Total *.14;
    System.out.println("blue:" + blue);
    System.out.println("green:" + green);
    System.out.println("brown:" + brown);
    System.out.println("orange:" + orange);
    System.out.println("red:" + red);
    System.out.println("yellow:" + yellow);
    int Sum;
    Math.round(Sum);
    Sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum:" + Sum);
    if ( blue > brown & green > red)
     System.out.println("Blue over Brown and Green over Red");
     if ( brown <= orange)
     System.out.println ("Brown is less than or equal to Orange");
     if ( Sum = Total)
     System.out.println ("Numbers match");
  }
}