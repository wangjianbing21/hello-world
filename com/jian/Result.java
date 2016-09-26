public class Result{
   public static void main(String[] args){
     long result=0;
     long x=1;
     for (int i=1;i<=10;i++) {
          x=i*x;
          result=+x;
}
    System.out.println("result="+result);

}
}