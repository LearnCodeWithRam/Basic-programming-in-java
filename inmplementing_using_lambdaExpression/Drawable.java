package inmplementing_using_lambdaExpression;

interface LambdaEx
{
	//public void Drawing();
	//public String Drawing();
	public Double Drawing(int x, double f);
}
public class Drawable {

	public static void main(String[] args) {
		
		int size=30;
		LambdaEx lx=(x,f)->{
			
				//System.out.println("width="+size);
			//return "Return statement in Lambda";
			return (x+f);
		
		};
		System.out.println(lx.Drawing(50,20.5));

	}

}
