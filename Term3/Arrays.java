
import java.util.Random;
import java.util.Scanner;





public class Arrays {
  public static void main(String []args) {
    System.out.println("Enter number of dice: ");
    Scanner scanner = new Scanner(System.in);
    int nofdice = scanner.nextInt();
    int[] myList = new int[nofdice];
    Random rand = new Random();
    for (int i = 0; i<myList.length; i++) {
      System.out.println("Dice number: " + i);
      System.out.println(rand.nextInt(7));
    } 
  }
}