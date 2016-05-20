




public class Box {
  private float h;
  private float w;
  private float l;
  
  public Box() {
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
    float volume = h*w*l;
    return volume;
  }
  public  float getSurfaceArea() {
    float surarea = (2*l*h) + (2*w*h)+(2*l*w);
    return surarea;
  }
}
