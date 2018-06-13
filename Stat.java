//This program shows that static block is called before the main function //
 
class Stat{
   static int num;
   static String mystr;
   //First Static block
   static{
      System.out.println("Static Block 1");
      num = 68;
      mystr = "Block1";
  } 
  //Second static block
  static{
      System.out.println("Static Block 2");
      num = 98;
      mystr = "Block2";
  }
  public static void main(String args[])
  {
      System.out.println("Value of num is "+num);
      System.out.println("Value of mystr is "+mystr);
   }
}