package doubt;



public class PrimeNumbersExample {

 public static void main(String[] args) {

  int primeCheckNumber;
  int n = 1;
  int divisibleCount;

  while (n <= 100) { //Example to print prime numbers from 1 to 100 (1 to N)
   divisibleCount = 0;
   primeCheckNumber = 2;
   while (primeCheckNumber <= n/2) {
    if (n % primeCheckNumber == 0) {
     divisibleCount++;
     break;
    }
    primeCheckNumber++;
   }
   if (divisibleCount == 0 && n != 1) {
    System.out.print(n + " ");
   }
   n++;
  }

 }
}


