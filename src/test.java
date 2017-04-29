/* a class that checks whether a given number is a prime
   using both the Thread class and Runnable interface*/
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        prime n= new prime(5);
        
		primeThread t= new primeThread(7);
		t.start();

	}

}
