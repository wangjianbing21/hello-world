public class TestEx{
   public static void main(String args[]){
   int arr[] = {1,2,3};
   System.out.println(arr[2]);
   try {
   System.out.println(2/0);
   } catch ( ArithmeticException ae){
   System.out.println("ÏµÍ³Î¬»¤");
  // ae.printStackTrace();
   }
   }



} 
