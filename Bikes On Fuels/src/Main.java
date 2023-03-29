import java.util.*;
import java.text.DecimalFormat;
class Main
{
private static final DecimalFormat d = new DecimalFormat("0.00");


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double cd=0;
double fuel=100;
while(n>0)
{
cd += (double)fuel/ n;
n-=1;
//System.out.println(d.format(cd));
}
System.out.println(d.format(cd));
}
}