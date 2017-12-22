package algorithms;

public class Fibonacci {
public static void main(String[] args) {
	for (int i = 0; i < i+1; i++) {
		System.out.println("Number " + i + ": " + Fib(i));
	}
	
}
static int Fib(int a) {
	if(a<=1) {
		return a;
	}
	else {
		return Fib(a-1) + Fib(a-2);
	}
	
	
	
	
}
}
