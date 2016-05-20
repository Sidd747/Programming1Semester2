public class Sphere {
  
  private float r;
  
  
  public  Sphere() {
    r = 0;
 
  }
  public void setRadius(float R) {
    r = R;
  }

  public  double getVolume(){
    double volume = (4.0/3.0)*Math.PI*r*r*r;
    return volume;
  }
  public  double getSurfaceArea() {
    double surarea = 4*r*r*Math.PI;
    return surarea;
  }
  }
