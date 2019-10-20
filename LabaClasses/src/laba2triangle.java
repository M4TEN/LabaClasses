import java.util.Scanner;
public class laba2triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Введите координаты 1ой вершины треугольника:");
		System.out.print("x=");
		double ax=in.nextDouble();
		System.out.print("y=");
		double ay=in.nextDouble();
		
		System.out.println("Введите координаты 2ой вершины треугольника:");
		System.out.print("x=");
		double bx=in.nextDouble();
		System.out.print("y=");
		double by=in.nextDouble();
		
		System.out.println("Введите координаты 3й вершины треугольника:");
		System.out.print("x=");
		double cx=in.nextDouble();
		System.out.print("y=");
		double cy=in.nextDouble();
		
		double a=Math.sqrt((ax-bx)*(ax-bx)+(ay-by)*(ay-by));
		double b=Math.sqrt((cx-bx)*(cx-bx)+(cy-by)*(cy-by));
		double c=Math.sqrt((ax-cx)*(ax-cx)+(ay-cy)*(ay-cy));
		
		if (a+b<=c || a+c<=b || b+c<=a)
			System.out.println("Треугольник не существует");
		else
		{
			double p=(a+b+c)/2.0;
			double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("s="+s);
		}
		
	}

}
