import java.util.Scanner;

public class PigLatin {

    public static void main(String []args) {
      System.out.println("Enter name:");
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      String firstLetter="";
      String restofword = "";
      String pig = "ay";
      String[] splitName = name.split(" ");
      int a=0;
      while (a<splitName.length)
      { 
        pig = "ay ";
        firstLetter = splitName[a].substring(0,1);
        firstLetter=firstLetter.toLowerCase();
        if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u") || firstLetter.equals("y")){
        splitName[a]+="yay";
        } else {
        restofword = splitName[a].substring(1);
        restofword = restofword.toLowerCase();
        splitName[a] = restofword + firstLetter + pig;
        }
        a++;
  
      }
      a=0;
      String output="";
      while (a<splitName.length)
      {
        output += splitName[a];
        a++;
      }
      System.out.println(output);
    }
}
