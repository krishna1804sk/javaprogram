package doubt;

import java.util.Scanner;

public class PrimeNumberChecker1 {
		 
	    public static boolean isPrime(int number) {
	 
	        int i = 2, count = 0;
	        boolean status;
	        while (i <= number / 2) {
	            if (number % i == 0) {
	                count++;
	                break;
	            }
	            i++;
	        }
	        status = count == 0 ? true : false;
	        return status;
	 
	    }
	    public static void main(String[] args) {
	        System.out.println("Enter a number to check Prime or Not");
	        Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        if(isPrime(number)) {
	            System.out.println(number + " is prime number");
	        }
	        else {
	            System.out.println(number + " is not a prime number");
	        }
	    }
	}


