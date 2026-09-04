import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in code below
		Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        int width = read.nextInt();

        int area = length * width;

        System.out.println("Area of the rectangle is: " + area);
	}
}