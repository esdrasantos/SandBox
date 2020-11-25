package application;
import  java.util.Scanner;
import  entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number of triangles to be considered.");
		int N = Integer.parseInt(sc.nextLine());
		int id = 0;
		int largestTriangle = 0;
		double largestArea = 0;
		
		Triangle []object = new Triangle[N]; // intanciacao do vetor 
		do {
			System.out.println("TRIANGLE " + (char)(id + 'A'));
			object[id] = new Triangle();     // instanciacao do objeto na posicao do vetor de Triangulos 
			object[id].setA(sc);
		    object[id].setB(sc);
			object[id].setC(sc);			
			double area = object[id].calculateArea();	
			
			if(area > largestArea)
			{
				largestArea = area;
				largestTriangle = id;
			}	
			
			id++;	
		}while(id < N);
		
		System.out.printf("The largest area is %.2f and belongs to triangle %c.%n", largestArea, largestTriangle + 'A');	
	    sc.close();
	}

}
