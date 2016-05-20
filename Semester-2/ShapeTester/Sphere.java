public class Sphere {
  private float r;
  public Sphere() {
    r = 0;
  }
  public void getRadius(float rad) {
    r = rad;
  }
  public double volumeMaker() {
    double volume = ((4.0/3.0)*Math.PI*r*r*r);
    return volume;
  }
  public double surfaceArea() {
    double sArea = 4*r*r*Math.PI;
    return sArea;
  }
}