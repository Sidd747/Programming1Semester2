public class Commercial extends Planes {
  private int numseat;
  private String officialname;
  public Commercial() {
    numseat = 0;
    officialname = "";
  }
  
  public void setNumSeat(int S) {
    numseat = S;
  }
  public void setName(String tempName) {
    officialname = tempName;
  }
  
  public int getRevenue() {
    int rev = numseat*310;
    return rev;
  }
  
  public String getName() {
    String name = officialname;
    return name;
  }
  
}  
