public class Pyramid {

  private float h;
  private float w;
  private float l;
  
  public Pyramid() {
    h = 0;
    w = 0;
    l = 0;
 
  }
  public void setHeight(float H) {
    h = H;
  }
  public void setWidth(float W) {
    w = W;
  }
  public void setLength(float L) {
    l = L;
  }
  public  float getVolume(){
    float volume = (h*w*l)/3;
    return volume;
  }
  public  double getSurfaceArea() {
    double surarea = (l*w)+l*(Math.sqrt((w/2)*(w/2) + h*h))+w*(Math.sqrt((l/2)*(l/2)+h*h));
    return surarea;
  }
}
