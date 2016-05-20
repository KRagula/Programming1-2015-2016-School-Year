
public class Test{ 
   public void varValues(){
      double a, b, c, d;
      double Low = 1;
      double High = 100000;
      double ra = (double) (Math.random() * (High - Low)) + Low;
      a = ra;
      double rb = (double) (Math.random() * (High - Low)) + Low;
      b = rb;
      double rc = (double) (Math.random() * (High - Low)) + Low;
      c = rc;
      double rd = (double) (Math.random() * (High - Low)) + Low;
      d = rd;
      
      System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
   }
   
   public static void main(String args[]){
      Test test = new Test();
      test.varValues();
   }
}