package com.fib;

import java.util.Scanner;

class fibonacciExample {
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		  
		   System.out.println("Enter the number to limit Fibonacci series: ");
		   int num = input.nextInt();
		   //loop till the last count
		   for(int i = 1; i <= num; i++){
			   //call Fibonacci function to print sum of last two numbers
		      System.out.print(printFibonacci(i) + " ");
		   }
		   input.close();
		 }
		 
		 
		 // recursion function
		 private static int printFibonacci(int CurrentNumber){
		  //exit condition 
		  if(CurrentNumber == 1 || CurrentNumber == 2){
		   return 1;
		  }
		  return printFibonacci(CurrentNumber - 1) + printFibonacci(CurrentNumber - 2);
		 }

}



