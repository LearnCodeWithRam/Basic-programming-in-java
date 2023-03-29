package implementation_by_anonymous_class;

 interface LambdaEx
 {
	 public void drawing();
 }


class Drawable
	{
	public static void main(String[] args) {
	
		int size=20;
		LambdaEx lx= new LambdaEx() {
			public void drawing() 
			{
				System.out.println("Width="+size);
			}
			
		};
		lx.drawing();

	}

}
