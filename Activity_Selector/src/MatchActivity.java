import java.util.Scanner;

public class MatchActivity {
	public static String[] activitySelection(String a[], int s[], int f[], int n) {
	    String[] A = new String[n]; // array A of size n
	    A[0] = "fakeItem"; //array will start from index 1. So, fake item at index 0
	    A[1] = a[1];

	    int k=1;
	    int iter = 1;

	    for(int i=2; i<=n; i++) {
	      if(s[i] >= f[k]) {
	        //appending array A
	        iter++;
	        A[iter] = a[i];
	        k=i;
	      }
	    }

	    /*
	      Making first element of the array A (index 0) equal to iter
	      just to know the length of the array when used in different function.
	    */
	    A[0] = a[iter];
	    return A;
	  }

	public static void main(String[] args)
	{
		
		 
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String[] activityname=new String[n+1];
		activityname[0]="fakeActivity";
		 int[] starTime=new int[n+1];
		 starTime[0]=0;//fake
		 int[] endTime=new int[n+1];
		 endTime[0]=0;//fake
		 
		for(int i=1;i<n;i++) {
	      System.out.println("Enter the ActivityName:");
	      activityname[i]=sc.next();
	      System.out.println("Enter the StartTime:");
	      starTime[i]=sc.nextInt();
	      System.out.println("Enter the FinishTime:");
	      endTime[i]=sc.nextInt();
		}
	    //Arrays staring from 1. Elements at index 0 are fake
	   // int a[] = {0, 2, 3, 5, 1, 4};
	   // int s[] = {0, 0, 1, 3, 4, 1};
	    //int f[] = {0, 2, 3, 4, 6, 6};
	    String[] p = activitySelection(activityname, starTime, endTime, n);

	    //p[0] is the length upto which activities are stored
	    for(int i=0; i<p.length; i++) {
	      System.out.println(p[i]);
	    }	
	}
}
