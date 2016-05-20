public class Box{
  private float width;
  private float height;
  private float length;
  public Box(){
    width = 0;
    height = 0;
    length = 0;
  }
  public void getLength(float len) {
    length = len;
  }
  public void getWidth(float wid) {
    width = wid;
  }
  public void getHeight(float heig) {
    height = heig;
  }
  public double surfaceArea() {
    double sArea = 2*((length*width) + (length*height) + (height*width));
    return sArea;
  }
  public double volumeMaker() {
    double volume = (length*width*height);
    return volume;
  }
}