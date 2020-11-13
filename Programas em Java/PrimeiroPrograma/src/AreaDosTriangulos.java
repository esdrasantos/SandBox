import java.util.Scanner;
import java.lang.Math;
public class AreaDosTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number of triangles to be considered.");
		int N = sc.nextInt();
		int largestArea = 0;
		int largestTriangle = 0;
		int i = 0;
		do {
				int[ ] areas = new int[N];
				int[ ] sides = new int[3];
				int p = 0;
				for(int j = 0; j < 3; j++)
				{
					System.out.printf("Determine the lenght of the %c side in the triangle %c.%n", j+'x', i+'A');
					sides[j] = sc.nextInt();
					p += sides[j];
				}
				
				p /= 2;
				areas[i] = (int)Math.sqrt(p*(p - sides[0])*(p - sides[1])*(p - sides[2]));
				
				if(areas[i] > largestArea)
				{
					largestArea = areas[i];
					largestTriangle = i;
				}
				i++;
			
		} while(i < N);
		
		System.out.println("The largest area is " + largestArea + " and belongs to triangle " + (char)(largestTriangle + 'A'));
		
		sc.close();

	}

}
