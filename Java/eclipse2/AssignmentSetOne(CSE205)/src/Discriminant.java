import java.util.Scanner;

public class Discriminant {
private double a;
private double b;
private double c;
private double D;

public Discriminant()
{
	this.a=0;
	this.b=0;
	this.c=0;
	this.D=0;
}

public void getCoeff()
{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 3 Values: ");
	for(int i=0;i<1;i++)
	{
	a = scan.nextInt();
	b = scan.nextInt();
	c = scan.nextInt();
	}
}

public void calcDiscriminant()
{
	D = Math.pow((b), 2)-4*(a)*(c);
}

public void PrintResult()
{
	if(D>0)
		System.out.print("Two Solutions");
	if(D==0)
	System.out.println("one Solution");
	if(D<0)
		System.out.println("No Solution");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discriminant DD = new Discriminant();
		DD.getCoeff();
		DD.calcDiscriminant();
		System.out.println("result: ");
		DD.PrintResult();
		
	}

}
