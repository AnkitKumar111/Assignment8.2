public class prime implements Runnable {
	Thread t1;
	int num;
	//constructor to initialize variable start thread
	prime(int i){
		num=i;
    t1=new Thread(this,"Prime number");
    System.out.println("thread t1 is created");
    t1.start();
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//checking the no is prime or not
		try{
	         
	        for(int i=2; i<=num/2; i++){
	            if(num % i == 0){
	            	System.out.println("number is not prime");
	            	return;
	            }
	        }
	        System.out.println("number is prime");
		}
            catch(Exception e)
               {
                    System.out.println(e);
               }		
	}
}
