import java.util.Scanner;




public class ShapeTester {

  public static void main(String []args) {
    System.out.println("What shape would you like to make today? Please type in lowercase. Your choices are a box, sphere, or pyramid.  ");
    Scanner scn = new Scanner(System.in);
    Box b1 = new Box();
    Sphere s1 = new Sphere();
    Pyramid p1 = new Pyramid();
    String shape = scn.nextLine();
    if (shape.equals("box")) {
      System.out.println("Enter height: ");
      Scanner scn2 = new Scanner(System.in);
      float hEnter = scn2.nextFloat();
      System.out.println("Enter width: ");
      Scanner scn3 = new Scanner(System.in);
      float wEnter = scn3.nextFloat();
      System.out.println("Enter length: ");
      Scanner scn4 = new Scanner(System.in);
      float lEnter = scn4.nextFloat();
      b1.setHeight(hEnter);
      b1.setWidth(wEnter);
      b1.setLength(lEnter);
      System.out.println("Volume is: " + b1.getVolume());
      System.out.println("Surface area is: " + b1.getSurfaceArea());      
      
    }
    else if (shape.equals("sphere")) {
      System.out.println("Enter radius: ");
      Scanner scn5 = new Scanner(System.in);
      float rEnter = scn5.nextFloat();
      s1.setRadius(rEnter);
      System.out.println("Volume is: " + s1.getVolume());
      System.out.println("Surface area is: " + s1.getSurfaceArea());
    }
    else if (shape.equals("pyramid")) {
      System.out.println("Enter height: ");
      Scanner scn6 = new Scanner(System.in);
      float hEnter = scn6.nextFloat();
      System.out.println("Enter width: ");
      Scanner scn7 = new Scanner(System.in);
      float wEnter = scn7.nextFloat();
      System.out.println("Enter length: ");
      Scanner scn8 = new Scanner(System.in);
      float lEnter = scn8.nextFloat();
      p1.setHeight(hEnter);
      p1.setWidth(wEnter);
      p1.setLength(lEnter);
      System.out.println("Volume is: " + p1.getVolume());
      System.out.println("Surface area is: " + p1.getSurfaceArea());   
    }
    else {
      System.out.println("Read the instructions again. Carefully");
    }
  }
}
