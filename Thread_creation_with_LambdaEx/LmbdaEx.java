package Thread_creation_with_LambdaEx;

public class LmbdaEx {

	public static void main(String[] args) {
		Runnable rn= new Runnable() {
			public void run()
			{   System.out.println("implementation by anonymous class");
				System.out.println("Thread is running....");
			}
		};
		
		Thread th =new Thread(rn);
		th.start();
		
		 //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
     
		Runnable rn1= ()->{
		System.out.println(".....implementation by LambdaEx..... \n Thread is starting...");
		};
		
		Thread td1=new Thread(rn1);
		td1.start();

	}

}
