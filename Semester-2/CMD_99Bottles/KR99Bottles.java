public class KR99Bottles {
     public static void main(String[] args) {
     int i = 99;
     while (i > -1) {
       int n = i-1;
       if(i == 1) {
         System.out.println(i + " bottle of Lassi on the wall. " + i + " bottle of Lassi.  Take one down, pass it around, no more bottles of Lassi on the wall.");
       } else if (i == 0) {
         System.out.println("There are no more bottles of Lassi on the wall.");
       } else if (i == 2) {
         System.out.println(i + " bottles of Lassi on the wall. " + i + " bottles of Lassi. Take one down, pass it around, " + n + " bottle of Lassi on the wall.");
       } else {
        System.out.println(i + " bottles of Lassi on the wall. " + i + " bottles of Lassi. Take one down, pass it around, " + n + " bottles of Lassi on the wall.");
       }
        i-=1;
     }
     }
}
