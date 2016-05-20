import java.util.Scanner;
  
  public class BuildPlane {
  public static void main(String []args) {
    System.out.println("Welcome to PlaneGenerator 2016. First, type which type of plane you would like to generate? Please type in lowercase, your choices are commercial or military. ");
    Scanner scn = new Scanner(System.in);
    String type = scn.nextLine();
    Military m1 = new Military();
    Commercial c1 = new Commercial();
    Planes p1 = new Planes();
    if(type.equals("commercial")) {
      System.out.println("Enter company name of airplane(Airbus, Boeing, Embraer, Bombardier, Lockheed Martin: ");
      Scanner scan1 = new Scanner(System.in);
      String comName = scan1.nextLine();
      System.out.println("Enter the time you would like to spend on developing this plane(years)Up to 50: ");
      Scanner scan2 = new Scanner(System.in);
      int tiDev = scan2.nextInt();
      System.out.println("Enter the number of seats inside the airplane. ");
      Scanner scan3 = new Scanner(System.in);
      int numSeat = scan3.nextInt();
      System.out.println("Enter the name of this airplane. ");
      Scanner scan4 = new Scanner(System.in);
      String Name = scan4.nextLine();
      p1.setTime(tiDev);
      p1.setName(comName);
      c1.setNumSeat(numSeat);
      c1.setName(Name);
      System.out.println(p1.getName() + " " + c1.getName());
      System.out.println(p1.getStatement());
      System.out.println(c1.getRevenue() + " dollars per flight");
      
    } else if(type.equals("military")) {
      System.out.println("Enter company name of airplane(Airbus, Boeing, Embraer, Bombardier, Lockheed Martin: ");
      Scanner scan4 = new Scanner(System.in);
      String comName1 = scan4.nextLine();
      System.out.println("Enter the time you would like to spend on developing this plane(years): ");
      Scanner scan5 = new Scanner(System.in);
      int tiDev1 = scan5.nextInt();
      System.out.println("Enter range level of this airplane (in tens of thousands of miles) (1-10) "); 
      Scanner scan6 = new Scanner(System.in);
      int ran = scan6.nextInt();
      System.out.println("Enter the name of this airplane. ");
      Scanner scan7 = new Scanner(System.in);
      String Name1 = scan7.nextLine();
      p1.setTime(tiDev1);
      p1.setName(comName1);
      m1.setRange(ran);
      m1.setName(Name1);
      System.out.println(p1.getName() + " " + m1.getName());
      System.out.println(p1.getStatement());
      System.out.println(m1.getRange() + " miles");
    } else {
      System.out.println("ERROR. Try again. ");
    }
  }  
}
