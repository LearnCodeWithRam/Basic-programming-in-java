
public class LabledBreak {

	public static void main(String[] args) {
		        int targetValue = 7;

		        outerLoop:
		        for (int i = 0; i < 10; i++) {
		            for (int j = 0; j < 10; j++) {
		                if (i+j == targetValue) {
		                    System.out.println("Found " + targetValue + " at (" + i + ", " + j + ")");
		                    break outerLoop;
		                }
		            }
		        }
		    }

	}


