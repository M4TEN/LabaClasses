import java.util.Scanner;
public class laba2 {
	public static boolean Vhodit(double x0,double y0,double x1,double y1,double x3,double y3){
		if (x0>x1 && y0>y1 && x0<x3 && y0<y3)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Введите координаты 1ой вершины 1го прямоугольника:");
		System.out.print("x=");
		double a1x=in.nextDouble();
		System.out.print("y=");
		double a1y=in.nextDouble();
		
		System.out.println("Введите координаты 2ой вершины 1го прямоугольника:");
		System.out.print("x=");
		double c1x=in.nextDouble();
		System.out.print("y=");
		double c1y=in.nextDouble();
		
		System.out.println("Введите координаты 1ой вершины 2го прямоугольника:");
		System.out.print("x=");
		double a2x=in.nextDouble();
		System.out.print("y=");
		double a2y=in.nextDouble();
		
		System.out.println("Введите координаты 2ой вершины 2го прямоугольника:");
		System.out.print("x=");
		double c2x=in.nextDouble();
		System.out.print("y=");
		double c2y=in.nextDouble();
		
		System.out.println("Введите координаты точки");
		System.out.print("x=");
		double dot_x=in.nextDouble();
		System.out.print("y=");
		double dot_y=in.nextDouble();
		
		boolean temp=true;
		
		if ((Vhodit(dot_x,dot_y,a1x,a1y,c1x,c1y)==true && Vhodit(dot_x,dot_y,a2x,a2y,c2x,c2y)==true) ||
		(Vhodit(dot_x,dot_y,a1x,a1y,c1x,c1y)==false && Vhodit(dot_x,dot_y,a2x,a2y,c2x,c2y)==false))
			System.out.println("Точка входит в область, ограниченную двумя прямогуольниками");
		else
			System.out.println("Точка не входит в область, ограниченную двумя прямогуольниками");
	}

}
