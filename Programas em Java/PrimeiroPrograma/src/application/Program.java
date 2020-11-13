package application;
import  java.util.Scanner;
import  entities.Triangle;;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number of triangles to be considered.");
		int N = sc.nextInt();
		Triangle object[] = new Triangle[N];
		int index = 0;
		
		sc.close();
	}

}
