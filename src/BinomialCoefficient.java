import java.util.Scanner;
public class BinomialCoefficient {

    public static int factorial(int number ){
      if(number <= 1){
          return 1;
      }
      return number*factorial(number-1);

    }
    public static void main( String args[]){
        int n = new Scanner(System.in).nextInt();
        int r = new Scanner(System.in).nextInt();
        int nCr = factorial(n) / (factorial(n-r) * factorial(r));
        System.out.println(nCr);
     }
}
