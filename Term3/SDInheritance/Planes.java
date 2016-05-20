
public class Planes {
  private int timeDev;
  private String officialName;
    
    public Planes() {
    timeDev = 0;
    officialName = "";
  }
  
  public void setTime(int tempDev) {
    timeDev = tempDev;
  }
  
  public void setName( String tempName) {
    officialName = tempName;
  }
  
  public String getStatement() {
    String na1;
    if (timeDev>=22) {
      na1 = "After 21 years of delays and promises, the CEO of your company has officially cancelled the program, due to lack of funding and failure to deliver on promises. You have been fired. Here is what your plane would have been if you hadn't been fired";
    } else if (timeDev >= 13 && timeDev<22) {
      na1 = "You will create a excellent plane. Grade: A+. Earnings: 86B";
    } else if (timeDev>=9 && timeDev<13) {
      na1 = "You will create a good plane. Grade: A-. Earnings: 26B";
    } else if (timeDev>=5 && timeDev<9) {
      na1 = "You will create an average plane. Grade: B-. Earnings: 866M";
    } else if (timeDev<5 && timeDev>0) {
      na1 = "You will create a bad plane. Grade: F. Earnings: 0. Your company officially fires you, because of your decision to cut short the program.";
    } else {
      na1= "You're fired.";
    }
    return na1;
  }
  public String getName() {
    String name = officialName;
    return name;
  }
} 
