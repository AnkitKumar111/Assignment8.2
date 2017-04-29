
public class primeThread extends Thread{
	int num;
	//constructor to initialize variable
	public primeThread(int i) {
		num=i;
	}
	//checking the number is prime or not
	public void run()
	{
		System.out.println("Running Primethread which extended from thread class");
		try{
	         
	        for(int i=2; i<=num/2; i++){
	            if(num % i == 0){
	            	System.out.println("num.is not prime-->PrimeThread");
	            	return;
	            }
	        }
	        System.out.println("Num is prime-->PrimeThread");
		}
		catch(Exception e){
			
		}
	}

}
