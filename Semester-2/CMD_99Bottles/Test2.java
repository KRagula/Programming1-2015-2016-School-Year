public class Test2 {
  public static void main(String args[]){
//    String fullName = "Kanishka Ragula";
//    fullName = fullName.toUpperCase();
//      System.out.println(fullName);

//        String fullName = "Kanishka Ragula";
//    fullName = fullName.toLowerCase();
//      System.out.println(fullName);

//    String fullName = "Kanishka Ragula";
//    int age = 14;
//      System.out.println(fullName + " is " + age + ".");
//    
//        String fullName = "KanishkaRagula";
//    int letters = fullName.length();
//      System.out.println(letters);
//
//      public static void main(String args[]){
//    String fullName = "\\Kanishka Ragula";
//      System.out.println(fullName);
//
//    public class Test2 {
//  public static void main(String args[]){
//    String fullName = "/Kanishka Ragula";
//      System.out.println(fullName);

    
//    String firstName = "Kanishka";
//    String lastName = "Ragula";
//    String fullName = firstName + lastName;
//    System.out.println(fullName);
//    String fullName2 = firstName.concat(lastName);
//    System.out.println(fullName2);
    
    String fullName = "Kanishka Ragula";
    String[] parts = fullName.split(" ");
    String firstName = parts[0];
    String lastName = parts[1];
    System.out.println(firstName);
    System.out.println(lastName);
  }
}