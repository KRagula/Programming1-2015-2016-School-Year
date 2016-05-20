public class Pyramid{
  private float length;
  private float width;
  private float height;
  public Pyramid() {
    length = 0;
    width = 0;
    height = 0;
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
    double sArea = ((length*width)+(length*Math.sqrt((width/2)*(width/2)+(height*height)))+(width*Math.sqrt((length/2)*(length/2)+(height*height))));
    return sArea;
  }
  public double volumeMaker() {
    double volume = (length*width*height)/3;
    return volume;
  }
}