public class Military extends Planes {
  private int rangeL;
  private String officialname;
  
  public Military() {
    rangeL = 0;
    officialname = "";
  }
  public void setRange(int tempRange) {
    rangeL = tempRange;
  }
  public void setName(String tempName) {
    officialname = tempName;
  }
  
  public int getRange() {
    int ra = rangeL*10000;
    return ra;
  }
  
 public String getName() {
    String name = officialname;
    return name;
  }
}
