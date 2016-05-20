
import java.io.*;


public class ThoughtQuestions {
  public static void main(String []args) throws IOException 
  {
byte data[] = new byte[10];
FileOutputStream out = new FileOutputStream("the-file-name");
out.write(data);
out.close();
  }
}